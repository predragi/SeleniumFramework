package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.GoogleSearchPageObjects;

public class GoogleSearchObjectsTest {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		GoogleSearchTest();
	}
	
	public static void GoogleSearchTest() {
		String project_path = System.getProperty("user.dir");
		System.getProperty("webdriver.chrome.driver", project_path+"/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		GoogleSearchPageObjects	searchPageObj = new GoogleSearchPageObjects(driver);
		
		driver.get("https://google.com");
		
		searchPageObj.setTextInSearchBox("A b c d");
		searchPageObj.clickSearchButton();
		
		driver.close();
	}

}
