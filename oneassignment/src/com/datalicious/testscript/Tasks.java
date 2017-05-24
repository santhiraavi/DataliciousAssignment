package com.datalicious.testscript;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.core.Runner;
import com.datalicious.pageobjects.HomePage;
import com.datalicious.utility.UtilitySelenium;


public class Tasks {


	HomePage page=new HomePage();

	@BeforeTest
	public void beforeTest() throws FileNotFoundException, IOException
	{
		Runner.launch();	//intialize the browser and launch the application
	}
	
	@Test(priority=1)
	public void firstTask()	
			{	
		page.searchAndClickOnFirstLink("Datalicious");
			}
	//serach for Datalicious and wait for results finally click on first result

	@Test(priority=2)
	public void SecondTask()				
			{	
		page.checkingAnalytics();
		
			}			

	//checking that request made to google analytics or host	
		
	//I don't know the parameters dp and dt 
	
	
	}

