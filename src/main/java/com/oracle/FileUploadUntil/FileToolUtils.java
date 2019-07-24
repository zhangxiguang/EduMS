package com.oracle.FileUploadUntil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

public class FileToolUtils {
	
	//����ѧ�ź�taskId��ȡѧ���ϴ��ļ�
	public static File getStudentFile(String studentId,Integer taskId,ServletContext context){
		System.out.println("i am comensdhdwo的你我滴哦啊我点击哦挖掘:"+taskId);
		String rootPath = context.getInitParameter("studentFilePath") + "/" + taskId; 
		File dir = new File(rootPath);
		File[] files = dir.listFiles();
		for(File file : files){
			if(file.getName().contains(studentId)){
				return file;
			}
		}
		return null;
	}
	
	//���ļ�ѹ��
	public static File zipFiles(HttpServletRequest request){
		String[] sids = request.getParameterValues("studentId");
		Integer tid = Integer.parseInt(request.getParameter("taskId"));
		List<File> listFiles = new ArrayList<File>();
		for(int i = 0; i < sids.length; i++){
			File file = FileToolUtils.getStudentFile(sids[i], tid, request.getServletContext());
			listFiles.add(file);
		}
		String tempPath = request.getServletContext().getInitParameter("tempFilePath");
		File zipedFile = new File(tempPath + "/" + tid + ".zip");
		try {
			zipedFile.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		FileInputStream fis = null;
		ZipOutputStream zos = null;
		byte[] b = new byte[1024];
		int len = 0;
		try {
			zos = new ZipOutputStream(new FileOutputStream(zipedFile));
			
			for(File file : listFiles){
				fis = new FileInputStream(file);
				zos.putNextEntry(new ZipEntry(file.getName()));
				
				while((len = fis.read(b)) != -1){
					zos.write(b,0,len);
				}
				zos.closeEntry();
				fis.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			if(zos != null){				
				zos.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return zipedFile;
	}

}
