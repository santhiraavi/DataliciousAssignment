package com.datalicious.core;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.datalicious.utility.ConnfigFileReading;


public class Runner {

	public static WebDriver driver;
	public static void launch() throws FileNotFoundException, IOException
	{
		ConnfigFileReading read=new ConnfigFileReading();
		Configurator config=read.readProperties("./config.properties");
	
		if(config.getBrowser().equals("firefox"))
		{
			Runner.driver=new FirefoxDriver();
		}
		else if(config.getBrowser().equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
			Runner.driver=new ChromeDriver();
		}
		else
		{
			System.out.println("please mention browser");

		}
		
		Runner.driver.get(config.getUrl());//launch application
		

	}
}
