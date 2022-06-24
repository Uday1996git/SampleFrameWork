package com.DemoProject.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.DemoProject.PageObjects.LoginPage;

public class TC_DemoProject_01 extends BaseClass{
	 
	@Test
	public void LoginTest() {
		webDriver.get(Url);
		logger.info("Navigated to the url provided");
		logger.warn("Wait");
		LoginPage lp = new LoginPage(webDriver);
		lp.SetUserName(Username);
		logger.info("Entered the Username");
		lp.SetPassword(Password);
		System.out.println(webDriver.getTitle());
		if(webDriver.getTitle().equals("GTPL Bank Home Page")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
}
