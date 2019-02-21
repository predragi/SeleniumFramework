package pageObjects;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ONT_PeopleAdvancedSearchPageObjects {
	
	WebDriver driver = null;
	
	By forename = By.id("forename");
	By middlename = By.id("middlename");
	By surname = By.id("surname");
	By age = By.id("age");
	By forename_living = By.id("forename2");
	By surname_living = By.id("surname2");
	By flatt = By.id("subbuild");
	By buildno = By.id("buildno");
	By buildname = By.id("buildname");
	By street = By.id("street");
	By vilage = By.id("vilage");
	By town = By.id("town");
	By county = By.id("county");
	By postcode = By.id("postcode");
	By country = By.id("country");
	By er_records = By.id("er-all");
	By dir_records = By.id("ds-dr");
	By family_records = By.id("ds-bmd");
	By search_button = By.name("btnSearch");
	
	public ONT_PeopleAdvancedSearchPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	public void personSearch(Map<String, String> params) {
		driver.findElement(forename).sendKeys(params.get("forename"));
		driver.findElement(middlename).sendKeys(params.get("middlename"));
		driver.findElement(surname).sendKeys(params.get("surname"));
		driver.findElement(search_button).click();
	}	
	public void livingwithSearch(Map<String, String> params) {
		driver.findElement(forename_living).sendKeys(params.get("forename_living"));
		driver.findElement(surname_living).sendKeys(params.get("surname_living"));
		driver.findElement(search_button).click();
	}
	public void AddressSearch(Map<String, String> params) {
		driver.findElement(flatt).sendKeys(params.get("flatt"));
		driver.findElement(buildno).sendKeys(params.get("buildno"));
		driver.findElement(buildname).sendKeys(params.get("buildname"));
		driver.findElement(street).sendKeys(params.get("street"));
		driver.findElement(vilage).sendKeys(params.get("vilage"));
		driver.findElement(town).sendKeys(params.get("town"));
		driver.findElement(county).sendKeys(params.get("county"));
		driver.findElement(postcode).sendKeys(params.get("postcode"));
		driver.findElement(country).sendKeys(params.get("country"));
		driver.findElement(search_button).click();
	}

}
