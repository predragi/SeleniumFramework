package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearch {
	
	public static void main(String[] args) {
		googleSearch();
	}
	
	public static void googleSearch() {
		
		String project_path = System.getProperty("user.dir");
		System.getProperty("webdriver.chrome.driver", project_path+"/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//goto google.com
		driver.get("https://google.com");
		
		//enter text in search box
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		
		//click on search button
        //driver.findElement(By.name("btnk")).click();
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		//close browser
		driver.close();
		
		System.out.println("test completed");
	}

}
