package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Generics.BaseClass;

public class JustdialHomePO extends BaseClass{

	public JustdialHomePO(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="h_login")
	private WebElement eleLoginLink;
	
	public WebElement getEleLoginLink()
	{
		return eleLoginLink;
	}
	
	@FindBy(id="h_sin_up")
	private WebElement eleSignupLink;
	
	public WebElement getEleSignupLink()
	{
		return eleSignupLink;
	}
	
	@FindBy(id="hotkeys_text_32")
	private WebElement eleHotelsLink;
	
	public WebElement getEleHotelsLink()
	{
		return eleHotelsLink;
	}
	
	

}
