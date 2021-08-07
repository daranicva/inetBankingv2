package com.inetBanking.Utilities;

import java.io.FileInputStream;
import java.util.Properties;


public class ReadData {
	public static String getData(String filename,String key) throws Exception
	{
		
	//	FileInputStream instream=new FileInputStream(filepath);
		
		Properties pro=new Properties();
	//	pro.load(instream);
		return pro.getProperty(key);
		
		
	}
		
		
		
	}


