package com.DemoProject.TestCases;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;






public class BaseClass {
	public String Url="https://demo.guru99.com/V1/index.php";
	public String Username="mngr417768";
	public String Password ="suzYdes";
	public WebDriver webDriver; 
	public static Logger logger;
	
	@BeforeClass
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		webDriver=new ChromeDriver();
		logger = LogManager.getLogger(BaseClass.class);
		
				
	}
	
	@AfterClass
	public void TearDown() {
		webDriver.quit();
	}
}
