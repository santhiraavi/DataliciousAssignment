package com.datalicious;


import java.io.FileNotFoundException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Datalicious {


		static WebDriver driver;
		
		
		public static void main(String[] args) throws FileNotFoundException, NoSuchMethodException, InterruptedException
		{

			
			driver=new FirefoxDriver();
//			System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver.exe");
//			driver=new ChromeDriver();

			driver.get("https://www.google.com/");
			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);// wait for 20 seconds
			
			WebElement search=driver.findElement(By.xpath("//div/div/input[@id='lst-ib']"));//finding path for search input box
			
			search.sendKeys("Datalicious");//search for dalalicious

//			search.click();
			
			driver.findElement(By.tagName("button")).submit();//click on search
			

	        List<WebElement> linkElements = driver.findElements(By.xpath("//h3[@class='r']/a"));
	        
	        
			while (true) 
			
			{

			  for (WebElement eachlink : linkElements) 
			  	{
				 if (eachlink.getAttribute("href").contentEquals("https://www.datalicious.com/"))
				 {
					eachlink.click();//click on first link
					 break;
				 }   			  
			  }
			  break;
			}	
			
			
			
		}
	}
