package com.job.util;

public class UploadFileUtil {
	
	/*public static String JZSHOP_DOMSIN = "http://47.93.231.245:8080/";
	public static String IMAGE_DIR = "/home/images/";
	public static String HEAD_DIR = "/home/heads/";
	public static String STATIC_DIR = "/home/static/";*/
	
	public static String JZSHOP_DOMSIN = "http://localhost:8080/";
	public static String IMAGE_DIR = "D:/images/";
	public static String HEAD_DIR = "D:/heads/";
	public static String STATIC_DIR = "D:/static/";
	
	public static String[] IMAGE_FILE_EXT = {"png", "jpg", "jpeg", "bmp"};
	
	public static boolean isImageAllowed(String imageExt) {
		for(String ext : IMAGE_FILE_EXT) {
			if(ext.equals(imageExt)) {
				return true;
			}
		}
		return false;
	}
}
