package testClass;

import org.testng.annotations.Test;

import pompackage.POM_Class;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class GettingText 
{
	  POM_Class obj;
	  WebDriver driver;
	  
	  @BeforeClass
	  public void beforeClass() 
	  {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\software tool\\chromedriver_win32\\chromedriver.exe");
			
			 driver = new ChromeDriver();
			 driver.get("https://www.flipkart.com/");
			 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(80));
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			 driver.manage().window().maximize(); 
			 obj = new POM_Class(driver);
	  }
	  @BeforeMethod
	  public void beforeMethod() throws InterruptedException 
	  {
		  obj.ClosePopup();
		  Thread.sleep(5000);
		  obj.ClickOnBanner();
		  obj.ClickOnEle();
	  }
      @Test
      public void GetAllMobOptions() 
      {
    	  obj.getMobOptions(driver);
      }
      @AfterClass
        public void CloseBrowser() 
      {
    	  driver.close();
      }


    

}
