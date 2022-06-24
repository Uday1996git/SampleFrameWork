package com.DemoProject.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver LocalDriver;
	public LoginPage(WebDriver RemoteDriver){
		LocalDriver=RemoteDriver;
		PageFactory.initElements(LocalDriver, this);
	}
	@FindBy(name="uid")
	@CacheLookup
	WebElement Username;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement Password;
	
	@FindBy(xpath="//input[@name='btnLogin']")
	@CacheLookup
	WebElement LoginBtn;

	public void SetUserName(String Uname) {
		Username.sendKeys(Uname);
	}
	public void SetPassword(String Pwd) {
		Password.sendKeys(Pwd);
	}
	public void ClickLogin() {
		LoginBtn.click();
	}
}
