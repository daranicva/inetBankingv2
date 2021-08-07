package com.inetBanking.testCases;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetBanking.Utilities.ReadConfig;


public class BaseClass {
	 ReadConfig readconfig=new  ReadConfig();
	
public String baseURL= readconfig.getApplicationURL()  ;           //"http://demo.guru99.com/V1/index.php";
public String username= readconfig.getusername();                  //  "mngr335109";
public String password= readconfig.getpassword();                   //"UvYhymy";
public static WebDriver driver; 
 public static Logger logger;
@Parameters("browser")
@BeforeClass
public void setup(String br)
{
	
   Logger logger=Logger.getLogger(BaseClass.class);
    PropertyConfigurator.configure("log4j.properties");
    if (br.equals("firefox")) {
    System.setProperty("webdriver.gecko.driver",readconfig.getfirefoxpath());
    driver=new FirefoxDriver();
}
    else if (br.equals("chrome")) {
    	 System.setProperty("webdriver.chrome.driver",readconfig.getchromepath());
    	    driver=new ChromeDriver();
}
    
    driver.get(baseURL);
    }
@AfterClass
public void teardown() {
	driver.quit();
	
}
	

}









