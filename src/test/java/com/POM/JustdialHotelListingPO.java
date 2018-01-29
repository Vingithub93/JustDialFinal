package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Generics.BaseClass;

public class JustdialHotelListingPO extends BaseClass{

	public JustdialHotelListingPO(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//span[@class='lng_cont_name'])[1]")
	private WebElement eleFirstResult;
	
	public WebElement getEleFirstResult()
	{
		return eleFirstResult;
	}
}
