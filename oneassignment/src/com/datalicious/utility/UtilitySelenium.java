package com.datalicious.utility;

import java.util.concurrent.TimeUnit;

import com.core.Runner;

public class UtilitySelenium 
{
	
	public static void waitForresults()
	{
		Runner.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	


	public static void maximize() {
		
		Runner.driver.manage().window().maximize();
	}
	
}
