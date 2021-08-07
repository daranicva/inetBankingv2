package com.inetBanking.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;
	public  ReadConfig() {     //constructor
		File src=new File("./Configuration/config.properties");
	
		try {
			FileInputStream fis=new FileInputStream (src);
			pro =new Properties();
			pro.load(fis); //method 
		}catch (Exception e) {
			System.out.println("Exception is"+e.getMessage());
		}		
	}
   public String getApplicationURL() {
	   String url=pro.getProperty("baseURL");
	   return url;
   }
   public String getusername() {
	   String username=pro.getProperty("username");
	   return username;
   }
   public String getpassword() {
	   String password=pro.getProperty("password");
	   return password;
}
   public String getchromepath() {
	   String getchromepath=pro.getProperty("chromepath");
	   return getchromepath;
}
   public String getfirefoxpath() {
	   String getfirefoxpath=pro.getProperty("firefoxpath");
	   return getfirefoxpath;
} 
   
}	
 





