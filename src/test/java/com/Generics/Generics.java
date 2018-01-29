package com.Generics;

import java.io.FileInputStream;
import java.util.Properties;


public class Generics {
	
	public static String getConfigProperties(String sKey)
	{
		String sValue="";
		Properties properties= new Properties();
		try
		{
			FileInputStream fis=new FileInputStream(Auto_Constant.CONFIG_PATH);
			properties.load(fis);
			sValue=properties.getProperty(sKey);
			
			
		}
		catch (Exception e) {
			
		}
		return sValue;
	}
}
