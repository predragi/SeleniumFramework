package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ONT_PeopleBGRPageObjects {
	
	WebDriver driver = null;
	
	By name = By.id("name");
	By forename = By.id("forename");
	By middlename = By.id("middlename");
	By surname = By.id("surname");
	By location = By.id("location");
	By postcode = By.id("postcode");
	By search_button = By.id("js-ont-bg-form-submit");
	By cancel_button = By.id("js-ont-btn-cancel");
	By exact_address = By.id("js-ont-bg-postcode-link");
	By sample_report = By.xpath("//a[@title='View sample record']");
	
	
	public ONT_PeopleBGRPageObjects(WebDriver driver){
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
	public void exactSearch(String firstname, String middle_name, String secondname, String post_code) {
		driver.findElement(exact_address).click();
		driver.findElement(forename).sendKeys(firstname);
		driver.findElement(middlename).sendKeys(middle_name);
		driver.findElement(surname).sendKeys(secondname);
		driver.findElement(postcode).sendKeys(post_code);
	}
	
}
