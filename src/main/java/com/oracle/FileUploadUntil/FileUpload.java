package com.oracle.FileUploadUntil;


import com.github.pagehelper.util.StringUtil;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.*;

import java.io.*;
import java.util.ArrayList;

public class FileUpload {  

    /**
     * 多文件上传
     * @param rootPath 文件保存路径
     * @param files 文件
     * @return
     * @throws IOException
     */
    public static Message fileUpload(String rootPath,MultipartFile[] files)throws IOException {
        //初始化
        Message msg = new Message();
        //验证文件上传操作是否失败
        ArrayList<Integer> arr = new ArrayList<>();
        String savePath = "";
        for (int i = 0; i < files.length; i++) {
            MultipartFile file = files[i];
            if (!file.isEmpty()) {
                InputStream in = null;
                OutputStream out = null;
                try{
                    //创建文件夹
                    File dir = new File(rootPath);
                    if(!dir.exists()){
                        dir.mkdirs();
                    }
                    //文件路径
                    String filePath = rootPath + file.getOriginalFilename();
                    //创建文件
                    File serverFile = new File(filePath);
                    if(!serverFile.exists()){
                        serverFile.createNewFile();
                    }
                    //获得输入流
                    in = file.getInputStream();
                    //获得输出流
                    out = new FileOutputStream(serverFile);
                    //获得文件的size
                    long size = file.getSize();
                    byte[] b = new byte[(int) size];
                    int len = 0;
                    //向空白文件里输入内容
                    while ((len = in.read(b)) > 0) {
                        out.write(b, 0, len);
                    }
                    //获得存储在服务器的文件的绝对路径
                    if (!StringUtil.isEmpty(serverFile.getAbsolutePath())){
                        if( i == 0){
                            savePath =serverFile.getAbsolutePath();
                        }else{
                            savePath = savePath + "," + serverFile.getAbsolutePath();
                        }
                    }

                }catch (Exception e){
                    //若arr的size>0则，文件上传失败
                    arr.add(i);
                }finally {
                    //执行关闭IO流
                    out.close();
                    in.close();
                }
            }else{
                //若arr的size>0则，文件上传失败
                arr.add(i);
            }
        }
        //验证文件上传操作是否失败
        if (arr.size() > 0) {
            msg.setStatus(Status.ERROR);
            msg.setError("文件上传失败");
            msg.setErrorKys(arr);
            msg.setUploadSuccess(false);
        } else {
            msg.setStatus(Status.SUCCESS);
            msg.setStatusMsg("文件上传成功");
            //文件存储在服务器的路径
            msg.setFilePath(savePath);
            //文件上传成功
            msg.setUploadSuccess(true);
        }
        return msg;
    }

}  