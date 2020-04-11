package com.jinxiaohui.common.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StreamUtil {
	//读取InputStream 放入集合
    public static List<String> readFileToList(InputStream in) throws IOException{
    	//声明集合
    	List<String> list = new ArrayList<String>();
    	BufferedReader reader = new BufferedReader(new InputStreamReader(in));
    	String line="";
		while((line=reader.readLine())!=null) {
			list.add(line);
		}
		return list;
	}
	//传入文件
    public static List<String> readFileToList(File file) throws IOException{
    	FileInputStream fileInputStream = new FileInputStream(file);
		return readFileToList(fileInputStream);
	}
    //传入路径
    public static List<String> readFileToList(String pathName) throws IOException{
    	File file = new File(pathName);
    	FileInputStream fileInputStream = new FileInputStream(file);
		return readFileToList(fileInputStream);
	}
    
    
    
}
