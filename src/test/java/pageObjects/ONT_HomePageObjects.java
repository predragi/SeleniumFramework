package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ONT_HomePageObjects {
	
	WebDriver driver = null;
	
	//list of web page objects
	By all_dropdown_menu = By.id("js-ont-header-search-form-combo");
	By all_peopleBusinesses_name = By.id("peopleBusinesses_name");
	By all_where_location = By.id("where_location");
	By all_search_button = By.id("searchBtn");
	By all_option_people = By.xpath("//li[contains(text(),'People')]");
	By all_option_businesses = By.xpath("//li[contains(text(),'Businesses')]");
	By all_option_places = By.xpath("//li[contains(text(),'Places')]");
	By all_option_er = By.xpath("//li[contains(text(),'Electoral Roll')]");
	By all_option_directors = By.xpath("//li[contains(text(),'Directors')]");
	By header_home = By.linkText("Home");
	By header_people = By.linkText("People");
	By header_businesses = By.linkText("Businesses");
	By header_places = By.linkText("Places");
	By header_schools = By.linkText("Schools");
	By header_help = By.linkText("Help");
	By header_signin_register = By.linkText("Sign In | Register");
	By people_search_name = By.id("name");
	By people_search_location = By.id("location");
	By people_advanced = By.linkText("Advanced People Search");
	By people_search_button = By.name("submitBtn");
	By business_search_name = By.id("businessesLookingFor");
	By business_search_location = By.id("businessesLocation");
	By business_advanced = By.linkText("Advanced Business Search");
	By business_search_button = By.id("businessSubmitBtn");
	By er_findout_more = By.xpath("//a[@title='Find people in the 2018 - 2019 Electoral Roll']");
	By pr_findout_more = By.xpath("//a[@title=\"Phil Spencer's Property Report\"]");
	By dir_findout_more = By.xpath("//a[@title='Search directory for free']");
	By bgr_find_out_more = By.xpath("//a[@title='Background Reports']");
	By footer_cookies = By.xpath("//a[contains(text(),'Cookie Policy')]");
	By footer_terms = By.xpath("//a[@title='Read our terms & conditions']");
	By footer_privacy = By.xpath("//a[@title='Read our privacy policy']");
	By footer_international = By.xpath("//a[@title='Search our directory of white pages and yellow pages worldwide']");
	By footer_blog = By.xpath("//a[@title='192.com blog']");
	By footer_people_atoz = By.xpath("//a[@title='Browse people A-Z']");
	By footer_business_atoz = By.xpath("//a[@title='Browse businesses A-Z']");
	By footer_about = By.xpath("//a[@title='About 192.com']");
	By footer_partner = By.xpath("//a[@title='Partner with 192.com']");
	By footer_facebook = By.xpath("//a[@title='Find us on facebook']");
	By footer_twitter = By.xpath("//a[@title='Find us on Twitter']");
	By footer_gplus = By.xpath("//a[@title='Find us on Google+']");
	
	//class constructor
	public ONT_HomePageObjects(WebDriver driver) {
		this.driver = driver; 	
	}
	
	
	//list of actions for objects on page
	public void headerallSearch(String who, String where) {
		driver.findElement(all_peopleBusinesses_name).sendKeys(who);
		driver.findElement(all_where_location).sendKeys(where);
		driver.findElement(all_search_button).click();
	}
	public void headerPeopleSearch(String who, String where) {
		driver.findElement(all_dropdown_menu).click();
		driver.findElement(all_option_people).click();
		driver.findElement(all_peopleBusinesses_name).sendKeys(who);
		driver.findElement(all_where_location).sendKeys(where);
		driver.findElement(all_search_button).click();
	}
	public void headerBusinessesSearch(String who, String where) {
		driver.findElement(all_dropdown_menu).click();
		driver.findElement(all_option_businesses).click();
		driver.findElement(all_peopleBusinesses_name).sendKeys(who);
		driver.findElement(all_where_location).sendKeys(where);
		driver.findElement(all_search_button).click();
	}
	public void headerPlacesSearch(String where) {
		driver.findElement(all_dropdown_menu).click();
		driver.findElement(all_option_places).click();
		driver.findElement(all_where_location).sendKeys(where);
		driver.findElement(all_search_button).click();
	}
	public void headerERSearch(String who, String where) {
		driver.findElement(all_dropdown_menu).click();
		driver.findElement(all_option_er).click();
		driver.findElement(all_peopleBusinesses_name).sendKeys(who);
		driver.findElement(all_where_location).sendKeys(where);
		driver.findElement(all_search_button).click();
	}
	public void headerDirectorsSearch(String who, String where) {
		driver.findElement(all_dropdown_menu).click();
		driver.findElement(all_option_directors).click();
		driver.findElement(all_peopleBusinesses_name).sendKeys(who);
		driver.findElement(all_where_location).sendKeys(where);
		driver.findElement(all_search_button).click();
	}
	
}
