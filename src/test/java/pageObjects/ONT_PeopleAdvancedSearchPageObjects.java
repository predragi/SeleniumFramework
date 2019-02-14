package pageObjects;

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
	By subbuild = By.id("subbuild");
	By buildno = By.id("buildno");
	
	
	public ONT_PeopleAdvancedSearchPageObjects(WebDriver driver) {
		this.driver = driver;
	}

}
