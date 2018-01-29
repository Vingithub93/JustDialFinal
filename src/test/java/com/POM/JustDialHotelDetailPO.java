package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Generics.BaseClass;

public class JustDialHotelDetailPO extends BaseClass {

	public JustDialHotelDetailPO(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[text()='Best Deal']")
	private WebElement eleBestDealButton;
	
	public WebElement getEleBestDealButton()
	{
		return eleBestDealButton;
	}
	
	//***INFORMATION POPUP***
	@FindBy(id="bd_name")
	private WebElement eleNameTextField;
	
	public WebElement getEleNameTextField()
	{
		return eleNameTextField;
	}
	
	@FindBy(id="bd_mobile")
	private WebElement eleMobileNumberTextField;
	
	public WebElement getEleMobileNumberTextField()
	{
		return eleMobileNumberTextField;
	}
	
	@FindBy(id="bd_email")
	private WebElement eleEmailTextField;
	
	public WebElement getEleEmailTextField()
	{
		return eleEmailTextField;
	}
	
	@FindBy(id="bd_email")
	private WebElement eleSubmitButton;
	
	public WebElement getEleSubmitButton()
	{
		return eleSubmitButton;
	}
	
}
