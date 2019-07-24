package com.oracle.FaceIdUntil;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.annotations.Lang;

import java.io.File;
import java.util.*;

/**
 * 人脸对比
 */
public class FaceMatch {

    /**
     * 重要提示代码中所需工具类
     * FileUtil,Base64Util,HttpUtil,GsonUtils请从
     * https://ai.baidu.com/file/658A35ABAB2D404FBF903F64D47C1F72
     * https://ai.baidu.com/file/C8D81F3301E24D2892968F09AE1AD6E2
     * https://ai.baidu.com/file/544D677F5D4E4F17B4122FBD60DB82B3
     * https://ai.baidu.com/file/470B3ACCA3FE43788B5A963BF0B625F3
     * 下载
     */

    //动态匹配人脸版本
    public static String match() {
        // 请求url
        String url = "https://aip.baidubce.com/rest/2.0/face/v3/match";
        try {

            byte[] bytes1 = null;
            byte[] bytes2 = FileUtil.readFileByBytes("/Users/zxg/Pictures/FaceData/FaceID.png");

//            File file = new File("/Users/zxg/Pictures/FaceData");
            String path = "/Users/zxg/Pictures/FaceData";
            int fileNum = 0, folderNum = 0;
            File file = new File(path);
            if (file.exists()) {
                LinkedList<File> list = new LinkedList<File>();
                File[] files = file.listFiles();
                for (File file2 : files) {
                    if (file2.getName().endsWith(".jpg")) {
//                        System.out.println("filepath"+file2.getAbsolutePath());
//                        System.out.println("filename"+file2.getName());
                        bytes1 = FileUtil.readFileByBytes(file2.getAbsolutePath());

                        String image1 = Base64Util.encode(bytes1);
                        String image2 = Base64Util.encode(bytes2);

                        List<Map<String, Object>> images = new ArrayList<>();

                        Map<String, Object> map1 = new HashMap<>();
                        map1.put("image", image1);
                        map1.put("image_type", "BASE64");
                        map1.put("face_type", "LIVE");
                        map1.put("quality_control", "LOW");
                        map1.put("liveness_control", "NORMAL");

                        Map<String, Object> map2 = new HashMap<>();
                        map2.put("image", image2);
                        map2.put("image_type", "BASE64");
                        map2.put("face_type", "LIVE");
                        map2.put("quality_control", "LOW");
                        map2.put("liveness_control", "NORMAL");

                        images.add(map1);
                        images.add(map2);

                        String param = GsonUtils.toJson(images);

                        // 注意这里仅为了简化编码每一次请求都去获取access_token，线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
                        String accessToken = AuthService.getAuth();

                        String result = HttpUtil.post(url, accessToken, "application/json", param);

                        JSONObject json = JSON.parseObject(result);
                        JSONObject json2 = JSON.parseObject(JSON.toJSONString(json.get("result")));

                        Object FaceObj = json2.get("score");
                        Float flaoat = Float.parseFloat(FaceObj.toString());

                        System.out.println("相似度:" + flaoat);


                        if (flaoat > 85) {
                            return file2.getName().substring(0, file2.getName().indexOf("."));
                        } else {
                            continue;
                        }
                    }

                }
            } else {
                System.out.println("文件不存在!");
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    //自主选择身份版本
    //动态匹配人脸版本
    public static Boolean match(String admId) {
        // 请求url
        String url = "https://aip.baidubce.com/rest/2.0/face/v3/match";
        try {

            byte[] bytes1 = FileUtil.readFileByBytes("/Users/zxg/Pictures/FaceData/" + admId + ".jpg");
            byte[] bytes2 = FileUtil.readFileByBytes("/Users/zxg/Pictures/FaceData/FaceID.png");


            String image1 = Base64Util.encode(bytes1);
            String image2 = Base64Util.encode(bytes2);

            List<Map<String, Object>> images = new ArrayList<>();

            Map<String, Object> map1 = new HashMap<>();
            map1.put("image", image1);
            map1.put("image_type", "BASE64");
            map1.put("face_type", "LIVE");
            map1.put("quality_control", "LOW");
            map1.put("liveness_control", "NORMAL");

            Map<String, Object> map2 = new HashMap<>();
            map2.put("image", image2);
            map2.put("image_type", "BASE64");
            map2.put("face_type", "LIVE");
            map2.put("quality_control", "LOW");
            map2.put("liveness_control", "NORMAL");

            images.add(map1);
            images.add(map2);

            String param = GsonUtils.toJson(images);

            // 注意这里仅为了简化编码每一次请求都去获取access_token，线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
            String accessToken = AuthService.getAuth();

            String result = HttpUtil.post(url, accessToken, "application/json", param);

            JSONObject json = JSON.parseObject(result);
            JSONObject json2 = JSON.parseObject(JSON.toJSONString(json.get("result")));

            Object FaceObj = json2.get("score");
            Float flaoat = Float.parseFloat(FaceObj.toString());

            System.out.println("相似度:" + flaoat);


            if (flaoat > 85) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }



    public static void main(String[] args) {
        System.out.println("最终结果" + FaceMatch.match("1"));
    }
}