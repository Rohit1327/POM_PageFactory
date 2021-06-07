package Helper_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/*We have created this utility to as to reduce the redundancy of the code*/



public class BrowserFactory  {
	
	ReadConfig readconfig = new ReadConfig(); 
	
	static WebDriver driver ;
	/*
	 * public String uname = "9466547949"; //if we do not use properties file we
	 * have to hard code the values //like this which is not a good practice public
	 * String pwd ="Rohit@724"; // To read the data from properties file we have
	 * created the ReadConfig file // Now only we have to call the methods using its
	 * object
	 */	
	
	  
	  public String uname =readconfig.getUserName();
	  public String pwd =readconfig.getPassword();
	 // public String url =readconfig.getApplicationURL();
	 
	
	
	public static WebDriver startBrowser(String browserName,  String url)
	
	
	{
		if(browserName.equalsIgnoreCase("firefox"))
			
		{
			System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
			driver = new ChromeDriver();
			
		}
		
		else if(browserName.equalsIgnoreCase("chrome"))
			
		{
			System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
			driver = new ChromeDriver();
			
		}

	
		driver.manage().window().maximize();
		driver.get(url);
		
		return driver;
		
		
	}
	
}


