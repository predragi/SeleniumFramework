package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {
	
	WebDriver driver = null;
		
	//list of objects on page
	By textbox_search = By.name("q");	
	By button_search = By.name("btnK");
	
	//class constructor
	public GoogleSearchPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	//list of actions for objects on webpage
	public void setTextInSearchBox(String text) {
		driver.findElement(textbox_search).sendKeys(text);
	}
	public void clickSearchButton() {
		driver.findElement(button_search).sendKeys(Keys.RETURN);
	}
}
