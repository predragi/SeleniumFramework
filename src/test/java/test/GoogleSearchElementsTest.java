package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.GoogleSearchPageElements;


public class GoogleSearchElementsTest {
	
	static WebDriver driver = null;
	
	public static void main(String[] args) {
		googleSearch();
	}
	
	public static void googleSearch() {
		String project_path = System.getProperty("user.dir");
		System.getProperty("webdriver.chrome.driver", project_path+"/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		//goto google.com
		driver.get("https://google.com");		
		//enter text in search box
		GoogleSearchPageElements.textbox_search(driver).sendKeys("Automation Step by Step");		
		//click on search button
		GoogleSearchPageElements.textbox_search(driver).sendKeys(Keys.RETURN);
		//close browser
		driver.close();		
		System.out.println("Test completed");
	}

}
