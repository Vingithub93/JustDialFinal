package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Generics.BaseClass;

public class JustdialHotelListingPO extends BaseClass{

	public JustdialHotelListingPO(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	
}
