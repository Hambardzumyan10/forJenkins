//package com.utility;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.Properties;
//
//public class PropertiesUtility {
//
//	public static String getData(String key) throws IOException {
//
//		// Create File Class Object.
//
//		File file = new File("C:\\Users\\Shelendra Kumar\\Desktop\\TestData.properties");
//
//		// Create FileReader class object.
//		FileReader reader = new FileReader(file);
//
//		// Properties class object.
//
//		Properties prop = new Properties();
//
//		// Load properties file.
//
//		prop.load(reader);
//
//		// call getValue()
//
//		return (String) prop.get(key);
//
//	}
//
//}
