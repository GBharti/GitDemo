package com.selenium;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class TestJenkins {
  @Test
  public void testGoogleLaunch() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation testing_impt\\chromedriver_win32\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		 
				driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS) ;
				
				driver.get("https://www.google.com/");
				System.out.println(driver.getTitle());
				
				//assertEquals("Google", driver.getTitle());
				
			System.out.println("test cahnges made");
				driver.quit();
  }
}
