package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.GenericLibrary;

public class FbLoginPage {
	public FbLoginPage() {
		PageFactory.initElements(GenericLibrary.driver, this);
	}

	// User name text box
	@FindBy(xpath = "//input[@id='email']")
	WebElement userName;

	// Password text box
	@FindBy(xpath = "//input[@id='pass']")
	WebElement password;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}
	
}
