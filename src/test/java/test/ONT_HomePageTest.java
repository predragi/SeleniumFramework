package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.ONT_HomePageObjects;

public class ONT_HomePageTest {	
	
	public static WebDriver driver;
	static String url = "https://www.192.com";
	
	public static void main(String[] args) {
		
		AllPeopleSearch();
	}
	
	public static void AllPeopleSearch() {
		
		String project_path = System.getProperty("user.dir");
		System.getProperty("webdriver.chrome.driver", project_path+"/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		ONT_HomePageObjects homePageObjects = new ONT_HomePageObjects(driver);
		
		driver.get(url);
		homePageObjects.headerallSearch("Alan Smith", "London");		
		driver.close();
		
		
		
	}

}
