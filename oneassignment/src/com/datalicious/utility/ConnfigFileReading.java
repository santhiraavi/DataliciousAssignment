package com.datalicious.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.datalicious.core.Configurator;


public class ConnfigFileReading {

	
	public Configurator readProperties(String propertyfilename) throws FileNotFoundException, IOException
	{
		Configurator configurator=new com.datalicious.core.Configurator();
		
				//read properties file
				Properties properties=new Properties();
				properties.load(new FileInputStream(new File(propertyfilename)));
				
				String browser=properties.get("browser").toString();
				String url=properties.getProperty("url").toString();
				configurator.setBrowser(browser);
				configurator.setUrl(url);
				return configurator;
	}
	
}
