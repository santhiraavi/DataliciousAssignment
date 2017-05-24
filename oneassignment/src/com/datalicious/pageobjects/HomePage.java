package com.datalicious.pageobjects;

import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.core.Runner;
import com.datalicious.utility.UtilitySelenium;



public class HomePage
{
	private By googleSearchinputcox=By.xpath("//div/div/input[@id='lst-ib']");
	private By searchButton=By.tagName("button");
	private By linkElements=By.xpath("//h3[@class='r']/a");
	String firstlink="https://www.datalicious.com/";
	
	private By script=By.tagName("script");
	String googleAnalytics="https://www.google-analytics.com/analytics.js";
	
	
	public void searchAndClickOnFirstLink(String text)
		{
		
		WebElement search=Runner.driver.findElement(googleSearchinputcox);//finding path for search input box
		
		search.sendKeys(text);//search for text Dalalicious

		//search.click();
		
		Runner.driver.findElement(searchButton).submit();//click on search
		
		UtilitySelenium.waitForresults();//wait for page load
		
        List<WebElement> linksOfAllElements = Runner.driver.findElements(linkElements);//finding all the links 
        
		while (true) 			
			{
		  for (WebElement eachlink : linksOfAllElements) 
		  		{
			 if (eachlink.getAttribute("href").contentEquals(firstlink))
			 		{
				 		eachlink.click();//click on first link
				 		break;
			 		}   			  
		  		}
		  			break;
			}
		
		}		
		
	
	
	
	public void checkingAnalytics()
	{

		List<WebElement> scriptList =Runner.driver.findElements(script);
		
		boolean scriptFound = false;
		
		for(WebElement item : scriptList)
				
			{
				    
				scriptFound = item.getAttribute("src").contains(googleAnalytics);
					   
				scriptFound=true;
					    
				break;
				    
			}
		
			if(scriptFound)	 
				{
					System.out.println("Website is using Google Universal Analytics");					 
				 
				}
			else
		
				{		 
					System.out.println("Website is using host analytics");
				}
				 
	}
	
	
	
	}
