package com.cjc.automation.webapp.utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	public Properties pro;
	public FileInputStream fis;
	
	String path="D:\\java practical eclips\\Maven_FrameworkDDF_PrachiGupta\\src\\test\\resources\\configuration\\config.properties";
	
	public ReadConfig() 
	{
		try 
		{
			pro = new Properties();
			FileInputStream  fis = new FileInputStream(path);
			pro.load(fis);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public String getBaseUrl()
	{
		String value = pro.getProperty("url");

		if(value!=null)
		{
			return value;
		}
		else
			{
				throw new RuntimeException("url not specified in config file.");
			}

	}

	public String getBrowser()
	{
		String value = pro.getProperty("browser");

		if(value!=null)
		{
			return value;
		}
		else
		{
			throw new RuntimeException("url not specified in config file.");
		}

	}


}

