package com.akl.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.*;

import static java.lang.System.in;

/**
 * @Project: springboot
 * @Author: 查建军
 * @Date: 2019-06-03 17:29
 * @Description:
 */
public class JsonExcel {
	public static void main(String[] args) {
		File f = new File("F:\\FineReport_9.0\\WebReport\\WEB-INF\\assets\\map\\geographic\\中国(省级)");
		File ff = new File("F:\\FineReport_9.0\\WebReport\\WEB-INF\\assets\\map\\geographic\\中国(省级)\\test.txt");
		File [] files = f.listFiles();
		int sl = 1;
		for(File itemFile : files){
			String fileName = itemFile.getName();
			if(fileName.endsWith("point.json")){
				sl++;
				String areaName = fileName.substring(0,fileName.indexOf("-")-1);
				try(InputStream in = new FileInputStream(itemFile);OutputStream out = new FileOutputStream(ff,true)) {
					byte[] b = new byte[(int) itemFile.length()];
					int i = 0;
					while((i = in.read(b)) != -1){
						//System.out.println(new String(b));
						JSONObject jsonObject = JSON.parseObject(new String(b));
						JSONArray jsonArray = jsonObject.getJSONArray("features");
						System.out.println(sl+"\t"+areaName);
						int lenth = jsonArray.size();
						for(int j =0;j<jsonArray.size();j++){
							JSONObject itt = jsonArray.getJSONObject(j);
							JSONObject nameJ = itt.getJSONObject("properties");
							String name = nameJ.getString("name");
							int wz = itt.getIntValue("coordinates");
							System.out.print("地区-"+name+"位置-"+wz);
						}
						System.out.println("properties\t"+jsonArray.getString(0));
						System.out.println(jsonObject);
						//out.write(b);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}

	/*public static JSONObject json(){
		File f = new File("F:\\FineReport_9.0\\WebReport\\WEB-INF\\assets\\map\\geographic\\中国(省级)");
		File [] files = f.listFiles();
		for(File itemFile : files){
			String fileName = itemFile.getName();
			System.out.println(fileName);
		}
		return null;
	}*/
}
