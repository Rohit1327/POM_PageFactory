package Helper_Utility;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

// To read the data from property file
public class ReadConfig {

	Properties pro;

	public ReadConfig() {
		File src = new File("Configuration/Config.properties");

		try {
			FileInputStream fis = new FileInputStream(src); // To read the data of the file we use FileInputStream
			pro = new Properties();
			pro.load(fis); // This will load the file inside the constructor

		} catch (Exception e) {

			System.out.println("Exception is" + e.getMessage());
		}

	}

	public String getApplicationURL() // Every method will return the value because we have to use this value in test
										// case
	{
		String url = pro.getProperty("Appurl");
		return url;

	}

	public String getUserName() // Every method will return the value because we have to use this value in test
								// case
	{
		String uname = pro.getProperty("username");
		return uname;

	}

	public String getPassword() // Every method will return the value because we have to use this value in test
								// case
	{
		String pwd = pro.getProperty("password");
		return pwd;

	}

	// We have to add corresponding method for property present in each property
	// file

}
