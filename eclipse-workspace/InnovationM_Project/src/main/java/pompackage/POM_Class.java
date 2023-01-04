package pompackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Class 
{	
	@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")private WebElement popupButton;
    @FindBy(xpath="(//img[@class='kJjFO0 _3DIhEh'])[2]")private WebElement banner;
    @FindBy(xpath="//span[text()='Electronics']")private WebElement EleButton;
    
	public  POM_Class(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void ClosePopup() throws InterruptedException
	{
		Thread.sleep(6000);
		popupButton.click();
	}
	public void ClickOnBanner() throws InterruptedException 
	{
		Thread.sleep(8000);
		banner.click();
	}
	public void ClickOnEle() 
	{
		EleButton.click();
	}
	public void getMobOptions(WebDriver driver) 
	{
		for(int i=2;i<=18;i++)
		{
			String text = driver.findElement(By.xpath("(//div[@class='_1fwVde']//a)["+i+"]")).getText();
			System.out.println(text);
		}
	}
}
