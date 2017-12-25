package com.iber.util;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class PropertyUtil {

	private static final String BUNDLE_NAME = "/push.properties";

//	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);
//
//	private PropertyUtil() {
//	}
//
	public static String getString(String key) {
		try {
			return prop.getProperty(key);
		} catch (Exception e) {
			return '!' + key + '!';
		}
	}
	
	private static  Properties prop=new Properties(); 
	static{
		try {
			InputStream is=PropertyUtil.class.getResourceAsStream(BUNDLE_NAME);
			prop.load(new InputStreamReader(is, "utf-8"));
			is.close();
	    } catch (IOException e) {  
	        e.printStackTrace();  
	    } 
	} 
}
