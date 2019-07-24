package com.oracle.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.zxing.WriterException;
import com.oracle.FaceIdUntil.FaceMatch;
import com.oracle.JpgUntil.QRCodeGenerator;
import com.oracle.entity.*;
import com.oracle.service.AdminService;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import java.util.List;

import com.oracle.FileUploadUntil.*;
import redis.clients.jedis.Jedis;
import sun.misc.BASE64Decoder;


@Controller
@RequestMapping("userctlr")
@Scope("prototype")
public class AdminController {
    //连接本地的 Redis 服务
    public static Jedis jedis = new Jedis("localhost");

    @Autowired
    AdminService adminService;


    @RequestMapping("login")
    public ModelAndView login(ModelAndView mav, Adminmessage adminmessage, HttpSession session) {

        System.out.println("进入登录方法" + adminmessage);

        Adminmessage admin = new Adminmessage();
        admin = adminService.login(adminmessage);

        System.out.println(admin);

        if (admin != null && admin.getAdmstatus() != false) {
            session.setAttribute("nowadmin", admin);
            mav.setViewName("redirect:../index.jsp");
            return mav;
        } else {
            mav.setViewName("redirect:../login.jsp");
            return mav;
        }

    }


    @RequestMapping("allDepa")
    @ResponseBody
    public Map<String, List<String>> allDepa() {
        System.out.println("进入查找所有院系方法");

        Map<String, List<String>> map = new HashMap<>();

        List<Depmessage> allDepa = new ArrayList<>();
        allDepa = adminService.adllDepa();

        List<String> allDepaName = new ArrayList<>();

        for (int i = 0; i < allDepa.size(); i++) {
//            System.out.println(allDepa.get(i).getDepname());
            allDepaName.add(allDepa.get(i).getDepname());
        }

//        System.out.println(allDepaName.size());
        map.put("allDepa", allDepaName);

        return map;

    }




    @RequestMapping("allMajor")
    @ResponseBody
    public Map<String, List<String>> allDepa(String depaName) {
        System.out.println("进入查找所有专业的方法");

        System.out.println(depaName);

        List<Majormessage> majormessageList = adminService.allMajor(depaName);
        List<String> list = new ArrayList<>();

        for (int i = 0; i < majormessageList.size(); i++) {
            list.add(majormessageList.get(i).getMajname());
        }

        Map<String, List<String>> map = new HashMap<>();
        map.put("allMajor", list);

        return map;
    }

    @RequestMapping("allClass")
    @ResponseBody
    public Map<String, List<String>> allClass(String majorName) {
        System.out.println("进入查找所有班级的方法");

        System.out.println(majorName);

        List<Classmessage> classmessageList = adminService.allClass(majorName);
        List<String> list = new ArrayList<>();

        for (int i = 0; i < classmessageList.size(); i++) {
            list.add(classmessageList.get(i).getClassname());
        }

        Map<String, List<String>> map = new HashMap<>();
        map.put("allClass", list);

        return map;
    }

    @RequestMapping("allClassInfo")
    @ResponseBody
    public Map<String, Object> allClassInfo(int page, int limit) {
        System.out.println("查询所有班级信息");

//        System.out.println(page+limit);

        List<classInfo> list = adminService.allClassInfo((page - 1) * limit, limit);

        System.out.println(list.size());

        Map<String, Object> map = new HashMap<>();


        map.put("code", 0);
        map.put("msg", "");
        map.put("count", adminService.ClassCount());
        map.put("data", list);

        return map;

    }

    @RequestMapping("allBoss")
    @ResponseBody
    public Map<String, List<String>> allBoss() {
        System.out.println("进入查找所有班主任方法");

        Map<String, List<String>> map = new HashMap<>();

        List<Teamessage> allBoss = new ArrayList<>();
        allBoss = adminService.allBoss();

        List<String> allBossName = new ArrayList<>();

        for (int i = 0; i < allBoss.size(); i++) {
//            System.out.println(allDepa.get(i).getDepname());
            allBossName.add(allBoss.get(i).getTeaname());
        }

//        System.out.println(allDepaName.size());
        map.put("allBoss", allBossName);

        return map;

    }

    @RequestMapping("searchClassName")
    @ResponseBody
    public Map<String, String> searchClassName(String className) {
        System.out.println("检测班级名是否存在");

        String result = null;

        if (adminService.searchClassName(className) == true) {
            result = "该名称已被占用，请重试";
        } else {
            result = "该名称可以使用";
        }
        ;

        Map<String, String> map = new HashMap<>();
        map.put("searchClassName", result);

        return map;
    }

    @RequestMapping("addNewClass")
    @ResponseBody
    public Map<String, String> addNewClass(String className, String classBoss, String depaName, String majorName) {
        System.out.println("添加新班级");

        String result = null;

        Teamessage tea = adminService.searchTeaByTeaName(classBoss);
        Depmessage dep = adminService.searchDepaByDepaName(depaName);
        Majormessage maj = adminService.searchMajorByMajorName(majorName);

        Classmessage classmessage = new Classmessage(null, className, tea.getTeaid(), dep.getDepid(), maj.getMajid());


        if (adminService.addNewClass(classmessage) == 1) {
            result = "班级信息添加成功";
        } else {
            result = "班级信息添加失败";
        }
        ;

        Map<String, String> map = new HashMap<>();
        map.put("addNewClass", result);

        return map;
    }


    @RequestMapping("allClassInfoByBoss")
    @ResponseBody
    public Map<String, Object> allClassInfoByBoss(int page, int limit, String teaname) {
        System.out.println("查询指定班主任所带所有班级信息");

        System.out.println(page + limit + teaname);

        List<classInfo> list = adminService.allClassInfoByBoss((page - 1) * limit, limit, teaname);

//        System.out.println(list.size());

        Map<String, Object> map = new HashMap<>();

        Teamessage tea = adminService.searchTeaByTeaName(teaname);


        map.put("code", 0);
        map.put("msg", "");
        map.put("count", adminService.ClassCountByBoss(tea.getTeaid()));
        map.put("data", list);

        return map;

    }

    @RequestMapping("allClassInfoByDepa")
    @ResponseBody
    public Map<String, Object> allClassInfoByDepa(int page, int limit, String depname) {
        System.out.println("查询指定院系所有班级信息");

        System.out.println(page + limit + depname);

        List<classInfo> list = adminService.allClassInfoByDepa((page - 1) * limit, limit, depname);

//        System.out.println(list.size());

        Map<String, Object> map = new HashMap<>();

        Depmessage depmessage = adminService.searchDepaByDepaName(depname);

        map.put("code", 0);
        map.put("msg", "");
        map.put("count", adminService.ClassCountByDepa(depmessage.getDepid()));
        map.put("data", list);

        return map;

    }

    @RequestMapping("allClassInfoByMajor")
    @ResponseBody
    public Map<String, Object> allClassInfoByMajor(int page, int limit, String majname) {
        System.out.println("查询指定专业所有班级信息");

        System.out.println(page + limit + majname);

        List<classInfo> list = adminService.allClassInfoByMajor((page - 1) * limit, limit, majname);

//        System.out.println(list.size());

        Map<String, Object> map = new HashMap<>();

        Majormessage majormessage = adminService.searchMajorByMajorName(majname);

        map.put("code", 0);
        map.put("msg", "");
        map.put("count", adminService.ClassCountByMajor(majormessage.getMajid()));
        map.put("data", list);

        return map;

    }

    @RequestMapping("allClassInfoByClass")
    @ResponseBody
    public Map<String, Object> allClassInfoByClass(int page, int limit, String classname) {
        System.out.println("查询指定班级所有班级信息");

        System.out.println(page + limit + classname);

        List<classInfo> list = adminService.allClassInfoByClass((page - 1) * limit, limit, classname);

//        System.out.println(list.size());

        Map<String, Object> map = new HashMap<>();


        map.put("code", 0);
        map.put("msg", "");
        map.put("count", list.size());
        map.put("data", list);

        return map;

    }


    @RequestMapping("editClassInfo")
    @ResponseBody
    public Map<String, String> editClassInfo(int classid, String classname, String teaname, String depname, String majname) {
        System.out.println("编辑班级信息");

        Teamessage tea = adminService.searchTeaByTeaName(teaname);
        Depmessage depa = adminService.searchDepaByDepaName(depname);
        Majormessage maj = adminService.searchMajorByMajorName(majname);

        Classmessage classmessage = new Classmessage();
        classmessage.setClassid(classid);
        classmessage.setClassname(classname);
        classmessage.setDepid(depa.getDepid());
        classmessage.setMajid(maj.getMajid());
        classmessage.setTeaid(tea.getTeaid());

        String result = null;

        int num = adminService.editClassInfo(classmessage);
        if (num == 1) {
            result = "更新成功";
        } else {
            result = "更新失败，请重试";
        }

        Map<String, String> map = new HashMap<>();
        map.put("editClassResult", result);

        return map;
    }

    @RequestMapping("delClassInfo")
    @ResponseBody
    public Map<String, String> delClassInfo(int classid) {

        System.out.println("删除班级信息");

        String result = null;

        int num = adminService.delClassInfo(classid);
        if (num == 1) {
            result = "删除成功";
        } else {
            result = "删除失败，请重试";
        }

        Map<String, String> map = new HashMap<>();
        map.put("delClassResult", result);

        return map;

    }

    @RequestMapping("classComBine")
    @ResponseBody
    public Map<String, String> classComBine(String className1, String className2) {

        System.out.println("合并班级");

        Classmessage classId1 = adminService.searchClassByClassName(className1);
        Classmessage classId2 = adminService.searchClassByClassName(className2);

        int num = adminService.classComBine(classId1.getClassid(), classId2.getClassid());

        System.out.println(num + "test");

        String result = null;

        if (num == 1) {
            //更改班级id
            result = "合并成功";
            //删除旧的班级
            int count = adminService.delClassInfo(classId1.getClassid());
            //更新学生的院系、专业
            int count2 = adminService.updateClassDepaMajor(classId2.getDepid(), classId2.getMajid(), classId2.getClassid());
        } else {
            result = "合并失败，请重试";
        }

        Map<String, String> map = new HashMap<>();
        map.put("classComBineResult", result);

        return map;

    }

    @RequestMapping("fileUpload")
    @ResponseBody
//    @Action(description="添加或更新流程需求单主表")
    public Map<String, String> fileUpload(HttpServletRequest request, @RequestParam("file") MultipartFile[] files)
            throws IOException {
        int count = 0;
        int Allcount = 0;

        // 文件上传位置
        String rootPath = "/Users/zxg/uploadTest/";
        // 文件在服务器的绝对路径(若文件为多个，则以","隔开)
        String filePath = "";
        if (files != null && files.length != 0) {
            // 文件上传至服务器
//            Message msg = FileUpload.fileUpload(rootPath, files);
            Message msg = com.oracle.FileUploadUntil.FileUpload.fileUpload(rootPath, files);
            // 文件上传是否成功
            if (msg.getUploadSuccess()) {
                filePath = msg.getFilePath();

                try {
                    // String encoding = "GBK";
                    File excel = new File(filePath);
                    if (excel.isFile() && excel.exists()) { // 判断文件是否存在

                        String[] split = excel.getName().split("\\."); // .是特殊字符，需要转义！！！！！
                        Workbook wb;
                        // 根据文件后缀（xls/xlsx）进行判断
                        if ("xls".equals(split[1])) {
                            FileInputStream fis = new FileInputStream(excel); // 文件流对象
                            wb = new HSSFWorkbook(fis);
                        } else if ("xlsx".equals(split[1])) {
//		                	 FileInputStream fis = new FileInputStream(excel);   //文件流对象
                            wb = new XSSFWorkbook(excel);
                        } else {
                            System.out.println("文件类型错误!");
                            return null;
                        }

                        // 开始解析
                        Sheet sheet = wb.getSheetAt(0); // 读取sheet 0

                        int firstRowIndex = sheet.getFirstRowNum() + 3; // 前三行行是列名，所以不读
                        int lastRowIndex = sheet.getLastRowNum();
                        Allcount = lastRowIndex;
                        System.out.println("firstRowIndex: " + firstRowIndex);
                        System.out.println("lastRowIndex: " + lastRowIndex);

                        Classmessage classmessage = new Classmessage();

                        for (int rIndex = firstRowIndex; rIndex <= lastRowIndex; rIndex++) { // 遍历行
                            System.out.println("rIndex: " + rIndex);
                            Row row = sheet.getRow(rIndex);
                            if (row != null) {
                                int firstCellIndex = row.getFirstCellNum();
                                int lastCellIndex = row.getLastCellNum();
                                for (int cIndex = firstCellIndex; cIndex < lastCellIndex; cIndex++) { // 遍历列
                                    Cell cell = row.getCell(cIndex);
                                    if (cell != null) {
                                        cell.setCellType(CellType.STRING);

                                        switch (cIndex) {
                                            case 0:
                                                System.out.println(cell.toString() + "班级名称");
                                                classmessage.setClassname(cell.toString());
                                                break;
                                            case 1:
                                                System.out.println(cell.toString() + "班主任名称");
                                                Teamessage teamessage = adminService.searchTeaByTeaName(cell.toString());
                                                System.out.println(teamessage);
                                                classmessage.setTeaid(teamessage.getTeaid());
                                                break;
                                            case 2:
                                                System.out.println(cell.toString() + "院系名称");
                                                Depmessage depmessage = adminService.searchDepaByDepaName(cell.toString());
                                                classmessage.setDepid(depmessage.getDepid());
                                                break;
                                            case 3:
                                                System.out.println(cell.toString() + "专业名称");
                                                Majormessage majormessage = adminService.searchMajorByMajorName(cell.toString());
                                                classmessage.setMajid(majormessage.getMajid());
                                                break;

                                        }
                                    }

                                }

                                int result = adminService.addNewClass(classmessage);
                                count = count + result;

                            }
                        }

                    } else {
                        System.out.println("找不到指定的文件");
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        String results = null;
        if (count == Allcount) {
            results = "添加成功";
        } else {
            results = "添加失败";
        }

        Map<String, String> map = new HashMap<String, String>();
        map.put("addClassInfoByExcel", results);
        return map;
    }


    @RequestMapping(value = "Echarts", produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String Echarts() {

        System.out.println("Echart图");

        List<Depmessage> allDepa = adminService.adllDepa();

        HashMap[] allDepaMap = new HashMap[allDepa.size()];
        for (int i = 0; i < allDepaMap.length; i++) {
            allDepaMap[i] = new HashMap<String, Object>();

            List<Majormessage> allMajor = adminService.allMajor(allDepa.get(i).getDepname());

            allDepaMap[i].put("value", allMajor.size());
            allDepaMap[i].put("name", allDepa.get(i).getDepname());

        }

        String result = JSON.toJSONString(allDepaMap);

        return result;
    }


    @RequestMapping(value = "Echarts2", produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String Echarts2() {

        System.out.println("Echart图2");

        List<Depmessage> allDepa = adminService.adllDepa();

        HashMap[] allDepaMap = new HashMap[allDepa.size()];
        for (int i = 0; i < allDepaMap.length; i++) {
            allDepaMap[i] = new HashMap<String, Object>();

            int classCount = adminService.ClassCountByDepa(allDepa.get(i).getDepid());

            allDepaMap[i].put("value", classCount);
            allDepaMap[i].put("name", allDepa.get(i).getDepname());

        }

        String result = JSON.toJSONString(allDepaMap);

        return result;
    }

    @RequestMapping(value = "Echarts3", produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String Echarts3() {

        System.out.println("Echart图3");

        int count = 0;
        int allCount = 0;
        int classCount = 0;

        for (int m = 0; m < adminService.adllDepa().size(); m++) {
            for (int n = 0; n < adminService.allMajor(adminService.adllDepa().get(m).getDepname()).size(); n++) {
                allCount++;
            }
        }

        HashMap[] allDepaMap = new HashMap[allCount];
        for (int a = 0; a < allDepaMap.length; a++) {
            allDepaMap[a] = new HashMap<String, Object>();
        }


        System.out.println("allCount" + allCount);

        List<Depmessage> allDepa = adminService.adllDepa();


        for (int i = 0; i < allDepa.size(); i++) {
            System.out.println("count test" + count);

            List<Majormessage> allMajor = adminService.allMajor(allDepa.get(i).getDepname());


            for (int j = 0; j < allMajor.size(); j++) {

                classCount = adminService.ClassCountByMajor(allMajor.get(j).getMajid());
                System.out.println("classCount" + classCount);

                allDepaMap[count].put("value", classCount);
                allDepaMap[count].put("name", allMajor.get(j).getMajname());

                System.out.println("count" + count);
                count++;

            }

        }

        String result = JSON.toJSONString(allDepaMap);

        return result;
    }


    @RequestMapping("sendTelNum")
    @ResponseBody
    public String sendTelNum(String newPhone, HttpServletRequest request) {
        System.out.println("发送短信验证码");

        //连接本地的 Redis 服务
//        Jedis jedis = new Jedis("localhost");
        //查看服务是否运行
        System.out.println("服务正在运行: " + jedis.ping());

        //生成6位验证码
        String num = "";
        for (int i = 0; i < 6; i++) {
            num = num + String.valueOf((int) Math.floor(Math.random() * 9 + 1));
        }

        jedis.set(newPhone, num);
//        jedis.expire(newPhone,60*5);//设置过期时间5分钟


        //发送短信验证码
        String host = "http://dingxin.market.alicloudapi.com";
        String path = "/dx/sendSms";
        String method = "POST";
        String appcode = "4651f4171ccf47bfb8ca9b5fa12137b6";

        System.out.println("要发送的手机号是:" + newPhone + ",验证码是" + num);

        Map<String, String> headers = new HashMap<String, String>();
        // 最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        Map<String, String> querys = new HashMap<String, String>();
        querys.put("mobile", newPhone);
        querys.put("param", "code:" + num);
        querys.put("tpl_id", "TP19052212");
        Map<String, String> bodys = new HashMap<String, String>();

        try {
            /**
             * 重要提示如下: HttpUtils请从
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/src/main/java/com/aliyun/api/gateway/demo/util/HttpUtils.java
             * 下载
             *
             * 相应的依赖请参照
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/pom.xml
             */
            HttpResponse response = HttpUtils.doPost(host, path, method, headers, querys, bodys);
//			System.out.println(response.toString());
            // 获取response的body
//			System.out.println(EntityUtils.toString(response.getEntity()));
            String info = EntityUtils.toString(response.getEntity());

            Map<String, Object> map = JSONObject.parseObject(info, Map.class);

            String result = JSON.toJSONString(map);

            System.out.println(result);

            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }


    @RequestMapping("checkDuanXinNum")
    @ResponseBody
    public String checkDuanXinNum(String phone, String duanxinNum) {
        System.out.println("验证短信验证码是否正确");

        System.out.println("收到的手机号是:" + phone + ",验证码是:" + duanxinNum);

        String right = jedis.get(phone);

        String result = null;
        if (right.equals(duanxinNum)) {
            result = "1";
        } else {
            result = "0";
        }

        Map<String, Object> map = new HashMap<>();
        map.put("duanxinResult", result);

        String info = JSON.toJSONString(map);

        return info;
    }

    @RequestMapping("updateAdminInfo")
    @ResponseBody
    public String updateAdminInfo(Integer admId, String admName, String password, String phone) {
        System.out.println("更新管理员信息");

        Adminmessage adminmessage = new Adminmessage();
        adminmessage.setAdmid(admId);
        adminmessage.setAdmpass(password);
        adminmessage.setAdmphone(phone);
        adminmessage.setAdmname(admName);

        int result = adminService.updateAdminInfo(adminmessage);

        System.out.println("adminmessage" + adminmessage.toString() + ",result:" + result);

        String info = null;
        if (result == 1) {
            info = "1";
        } else {
            info = "0";
        }
        Map<String, Object> map = new HashMap<>();
        map.put("updateAdminInfo", info);


        return JSON.toJSONString(map);
    }

    @RequestMapping("logOff")
    public ModelAndView logOff(ModelAndView mav, HttpSession session) {
        System.out.println("安全退出");

        session.removeAttribute("nowadmin");

        mav.setViewName("redirect:../login.jsp");
        System.out.println("安全退出成功");
        return mav;


    }

    @RequestMapping("loginByPhone")
    public ModelAndView loginByPhone(ModelAndView mav, String phone, String duanxinNum, HttpSession session) {

        System.out.println("进入手机登录方法" + phone + duanxinNum);

        Adminmessage admin = new Adminmessage();
        admin = adminService.loginByPhone(phone);

        System.out.println(admin);

        if (admin != null) {
            session.setAttribute("nowadmin", admin);
            mav.setViewName("redirect:../index.jsp");
            return mav;
        } else {
            mav.setViewName("redirect:../loginByPhone.jsp");
            return mav;
        }

    }

    //动态匹配人脸版本
//    @RequestMapping("loginByFace")
//    @ResponseBody
//    public String loginByFace(ModelAndView mav, String imgData, HttpSession session) throws IOException {
//
//        System.out.println("进入Face登录方法" + imgData);
//
//        BASE64Decoder decoder = new BASE64Decoder();
//        byte[] b = decoder.decodeBuffer(imgData);//转码得到图片数据
//
//        ByteArrayInputStream bais = new ByteArrayInputStream(b);
//        BufferedImage bi1 = ImageIO.read(bais);
//
//        File w2 = new File("/Users/zxg/Pictures/FaceData/FaceID.png");
//
//        ImageIO.write(bi1, "png", w2);
//
//        if (FaceMatch.match() != null) {
//            Adminmessage admin = adminService.loginByFace(Integer.parseInt(FaceMatch.match()));
//
//            if (admin != null && admin.getAdmstatus() != false){
//                session.setAttribute("nowadmin", admin);
//                return "true";
//            }else {
//                return "false";
//            }
//
//        } else {
//            return "false";
//        }
//
//    }

    //自主选择身份版本
    @RequestMapping("loginByFace")
    @ResponseBody
    public String loginByFace(ModelAndView mav, String imgData,String admID, HttpSession session) throws IOException {

        System.out.println("进入Face登录方法" + imgData);

        BASE64Decoder decoder = new BASE64Decoder();
        byte[] b = decoder.decodeBuffer(imgData);//转码得到图片数据

        ByteArrayInputStream bais = new ByteArrayInputStream(b);
        BufferedImage bi1 = ImageIO.read(bais);

        File w2 = new File("/Users/zxg/Pictures/FaceData/FaceID.png");

        ImageIO.write(bi1, "png", w2);

        Adminmessage adminmessage=adminService.searchAdmIdByName(admID);

        if (FaceMatch.match(adminmessage.getAdmid().toString()) != false) {
            Adminmessage admin = adminService.loginByFace(adminmessage.getAdmid());

            if (admin != null && admin.getAdmstatus() != false){
                session.setAttribute("nowadmin", admin);
                return "true";
            }else {
                return "false";
            }

        } else {
            return "false";
        }

    }


    @RequestMapping("allAdmInfo")
    @ResponseBody
    public Map<String, Object> allAdmInfo(int page, int limit) {
        System.out.println("查询所有管理员信息");

        List<Adminmessage> list = adminService.allAdmin((page - 1) * limit, limit);

        System.out.println(list.size());

        Map<String, Object> map = new HashMap<>();


        map.put("code", 0);
        map.put("msg", "");
        map.put("count", adminService.AdminCount());
        map.put("data", list);

        return map;

    }

    @RequestMapping("updateNorAdminStatus")
    @ResponseBody
    public void updateNorAdminStatus(Integer admid, Boolean admstatus) {
        System.out.println("更新普通管理员状态" + admstatus);


        Adminmessage normaladmin = adminService.searchNorAdmByKey(admid);
        normaladmin.setAdmstatus(admstatus);

        int result = adminService.updateNorAdminInfo(normaladmin);

        System.out.println("adminmessage" + normaladmin.toString() + ",result:" + result);

        String info = null;
        if (result == 1) {
            info = "1";
        } else {
            info = "0";
        }
        Map<String, Object> map = new HashMap<>();
        map.put("updateNorAdminInfo", info);


    }

    @RequestMapping("updateNorAdminInfo")
    @ResponseBody
    public String updateNorAdminInfo(Integer admid, String admname, String admpass, String admphone, Boolean admstatus) {
        System.out.println("更新普通管理员信息");

        Adminmessage normaladmin = new Adminmessage();
        normaladmin.setAdmid(admid);
        normaladmin.setAdmname(admname);
        normaladmin.setAdmpass(admpass);
        normaladmin.setAdmphone(admphone);
        normaladmin.setAdmstatus(admstatus);

        System.out.println("normaladmin" + normaladmin.toString());

        int result = adminService.updateNorAdminInfo(normaladmin);

        System.out.println("adminmessage" + normaladmin.toString() + ",result:" + result);

        String info = null;
        if (result == 1) {
            info = "1";
        } else {
            info = "0";
        }
        Map<String, Object> map = new HashMap<>();
        map.put("updateNorAdminInfo", info);


        return JSON.toJSONString(map);
    }

    @RequestMapping("checkAdmName")
    @ResponseBody
    public String checkAdmName(String admName) {
        System.out.println("查询管理员账户是否存在");

        Adminmessage adminmessage = adminService.checkAdmName(admName);

        Boolean info = null;

        Map<String, Object> map = new HashMap<>();


        if (adminmessage != null) {
            info = true;
        } else {
            info = false;
        }

        map.put("checkAdmName", info);

        return JSON.toJSONString(map);
    }

    @RequestMapping("addNewAdm")
    @ResponseBody
    public String addNewAdm(String admName, String admPass, String admTel, Boolean admStatus) {
        System.out.println("新增管理员信息");

        Adminmessage adminmessage = new Adminmessage();
        adminmessage.setAdmname(admName);
        adminmessage.setAdmpass(admPass);
        adminmessage.setAdmphone(admTel);
        adminmessage.setAdmstatus(admStatus);

        System.out.println(adminmessage.toString());

        int result = adminService.addNewAdm(adminmessage);

        Boolean info = null;

        Map<String, Object> map = new HashMap<>();


        if (result == 1) {
            info = true;
        } else {
            info = false;
        }

        map.put("addNewAdm", info);

        return JSON.toJSONString(map);
    }

    @RequestMapping("delAdm")
    @ResponseBody
    public String delAdm(int admId) {
        System.out.println("删除管理员信息");

        int result = adminService.delAdm(admId);

        Boolean info = null;

        Map<String, Object> map = new HashMap<>();


        if (result == 1) {
            info = true;
        } else {
            info = false;
        }

        map.put("delAdm", info);

        return JSON.toJSONString(map);
    }

    @RequestMapping("loginByWeiXin")
    @ResponseBody
    public String loginByWeiXin(ModelAndView mav, Adminmessage adminmessage, HttpSession session) {

        System.out.println("进入登录方法" + adminmessage);

        Adminmessage admin = new Adminmessage();
        admin = adminService.login(adminmessage);

        System.out.println(admin);

        if (admin != null && admin.getAdmstatus() != false) {
//            String uuid=UUID.randomUUID().toString();
//            session.setAttribute(admin.getAdmid().toString(),uuid);
//            System.out.println(admin.getAdmid().toString()+"uuid:"+uuid);

            return admin.getAdmid().toString();

        } else {

            return null;
        }

    }

    @RequestMapping("ErWeiMa")
    @ResponseBody
    public ResponseEntity<byte[]> ErWeiMa(HttpSession session){
        System.out.println("生成二维码");

        //二维码内的信息
        String uuid=UUID.randomUUID().toString();


        byte[] qrcode = null;
        try {
            qrcode = QRCodeGenerator.getQRCodeImage(uuid, 360, 360);
        } catch (WriterException e) {
            System.out.println("Could not generate QR Code, WriterException :: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Could not generate QR Code, IOException :: " + e.getMessage());
        }

        // Set headers
        final HttpHeaders headers=new org.springframework.http.HttpHeaders();
        headers.setContentType(MediaType.IMAGE_PNG);

        return new ResponseEntity<byte[]>(qrcode, headers, HttpStatus.CREATED);

    }

    @RequestMapping("loginByWeiXinSaoMa")
    @ResponseBody
    public String loginByWeiXinSaoMa(ModelAndView mav, String uuid, String admId, HttpSession session) {

        System.out.println("进入微信扫码登录方法" + uuid+",amdID:"+admId);


        jedis.set(uuid,admId);

        Adminmessage admin=adminService.loginByFace(Integer.parseInt(admId));

        System.out.println(admin.toString());

        if (admin != null && admin.getAdmstatus() != false) {
//            session.setAttribute("nowadmin", admin);
            jedis.set("nowadmin",admId);
//            System.out.println("aaaaaa"+session.getId());
            return "true";
        } else {
            return "false";
        }

    }

    @RequestMapping("CheckWeiXinStatus")
    @ResponseBody
    public String CheckWeiXinStatus(ModelAndView mav, HttpSession session) {

        System.out.println("查询二维码扫描状态" );

        String admId=jedis.get("nowadmin");

        if(admId!=null){
            Adminmessage admin=adminService.loginByFace(Integer.parseInt(admId));

            if (admin != null && admin.getAdmstatus() != false) {
                System.out.println("查看session对象"+admin.toString());
                session.setAttribute("nowadmin", admin);
                jedis.del("nowadmin");
                return "true";
            } else {
                return "false";
            }
        }else {
            return "false";
        }

    }


    @RequestMapping("allAdmin")
    @ResponseBody
    public Map<String, List<String>> allAdmin() {
        System.out.println("进入查找所有管理员方法");

        Map<String, List<String>> map = new HashMap<>();

        List<Adminmessage> allAdmin = new ArrayList<>();
        allAdmin = adminService.allAdminToFace();

        List<String> allAdminName = new ArrayList<>();

        for (int i = 0; i < allAdmin.size(); i++) {
//            System.out.println(allDepa.get(i).getDepname());
            allAdminName.add(allAdmin.get(i).getAdmname());
        }

//        System.out.println(allDepaName.size());
        map.put("allAdmin", allAdminName);

        return map;

    }




}
