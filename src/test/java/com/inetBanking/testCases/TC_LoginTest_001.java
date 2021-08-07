package com.inetBanking.testCases;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass{
	@Test
	public void LoginTest() {
		logger.info("URL opened");
		
		
		LoginPage lp=new LoginPage(driver);
		logger.info("Entered username");
		lp.setUserName(username);
		logger.info("Entered password");
		lp.setPassWord(password);
		
		lp.clickSubmit();
		System.out.println(driver.getTitle());
	
		if(driver.getTitle().equals("GTPL Bank Manager HomePage"))
		{
		Assert.assertTrue(true);
			logger.info("loging test pass");
		}
		else {
			Assert.assertTrue(false);
		logger.info("login test fail");
		}
	}
	

}
