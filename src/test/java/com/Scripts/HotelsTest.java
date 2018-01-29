package com.Scripts;

import org.testng.annotations.Test;

import com.Generics.BaseTest;
import com.POM.JustdialHomePO;

public class HotelsTest extends BaseTest{
	
	@Test
	public void hotelsBestDealsTest()
	{
		JustdialHomePO home= new JustdialHomePO(driver);
		home.getEleHotelsLink();
		
	}

}
