package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Generics.BaseClass;

public class JustdialSignupPO extends BaseClass{

	public JustdialSignupPO(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

}
