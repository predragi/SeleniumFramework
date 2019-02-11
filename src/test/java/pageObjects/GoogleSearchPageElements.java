package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPageElements {
	
	private static WebElement element = null;
	
	public static WebElement textbox_search(WebDriver driver) {
		element = driver.findElement(By.name("q"));
		return element;
	}
	
	public static WebElement button_search(WebDriver driver) {
		element = driver.findElement(By.name("btnk"));
		return element;
	}
	
	public static WebElement button_lucky(WebDriver driver) {
		element = driver.findElement(By.name("btnI"));
		return element;
	}
	
	public static WebElement link_advertisment(WebDriver driver) {
		element = driver.findElement(By.linkText("Advertising"));
		return element;		
	}
	
	public static WebElement link_business(WebDriver driver) {
		element = driver.findElement(By.linkText("Business"));
		return element;		
	}

}
