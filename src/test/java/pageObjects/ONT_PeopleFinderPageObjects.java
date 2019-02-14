package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ONT_PeopleFinderPageObjects {
	
	WebDriver driver = null;
	
	By name = By.id("name");
	By location = By.id("location");
	By advanced_people_search = By.linkText("Advanced People Search");
	By search_button = By.xpath("//input[@name='submitBtn']");
	By people_tips = By.linkText("Read the 192.com People Search Guide »");
	By search_people = By.xpath("//a[@class='ont-btn-main']");
	By new_records_link = By.xpath("//a[@title='Find people in 2019 Electoral Roll']");
	By family_records_link = By.xpath("//a[@title='Search family records']");
	By bgr_link = By.xpath("//a[@title='Background Reports']");
	
	public ONT_PeopleFinderPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	public void nameSearch(String person) {
		driver.findElement(name).sendKeys(person);
		driver.findElement(search_button).click();
	}
	public void locationSearch(String where) {
		driver.findElement(location).sendKeys(where);
		driver.findElement(search_button).click();
	}
	public void fullSearch(String person, String where) {
		driver.findElement(name).sendKeys(person);
		driver.findElement(location).sendKeys(where);
		driver.findElement(search_button).click();
	}	

}
