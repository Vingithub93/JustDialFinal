package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Generics.BaseClass;

public class JustdialHotelsPO extends BaseClass{

	public JustdialHotelsPO(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='5 Star Hotels']")
	private WebElement ele5StarHotelLink;
	
	public WebElement getEle5StarHotelLink()
	{
		return ele5StarHotelLink;
	}
	
	
	

}
