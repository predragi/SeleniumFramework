package test;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.ONT_PeopleAdvancedSearchPageObjects;

public class ONT_AdvancedPeopleSearchTest {
	
	public static WebDriver driver;
	static String url = "https://www.192.com";
	
	public static void main(String[] args) {
		//map for person
		Map<String, String> person_params = new HashMap<>();
		person_params.put("forename", "Will");
		person_params.put("middlename", "Henry");
		person_params.put("surname", "Smith");
		person_params.put("forename_living", "Jean");
		person_params.put("surname_living", "Smith");

		//map for person
		Map<String, String> location_params = new HashMap<>();
		person_params.put("flatt", "Will");
		person_params.put("buildno", "Henry");
		person_params.put("buildname", "Smith");
		person_params.put("street", "Jean");
		person_params.put("vilage", "Smith");
		person_params.put("town", "Will");
		person_params.put("county", "Henry");
		person_params.put("postcode", "Smith");
		person_params.put("country", "Jean");
		
		AdvancedPeopleSearch(person_params, location_params);
	}
	
	public static void AdvancedPeopleSearch(Map<String, String> person_params, Map<String, String> location_params) {
		
		String project_path = System.getProperty("user.dir");
		System.getProperty("webdriver.chrome.driver", project_path+"/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		ONT_PeopleAdvancedSearchPageObjects advancedPageObjects = new ONT_PeopleAdvancedSearchPageObjects(driver);
		
		advancedPageObjects.personSearch(person_params);
		advancedPageObjects.AddressSearch(location_params);
	

	}
}
