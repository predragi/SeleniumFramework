import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class BrowserTest {
	
	public static void main(String[] args) throws InterruptedException {
		String project_path = System.getProperty("user.dir");
		
		/*System.setProperty("webdriver.gecko.driver", project_path+"/drivers/geckodriver/geckodriver.exe");
		 *WebDriver driver = new FirefoxDriver();		
		 *podesavanje propertija nije potrebno ako se u env variables path doda putanja do drajvera
		 *System.setProperty("webdriver.ie.driver", project_path+"/drivers/IEdriver/IEdriverServer.exe");
		 *WebDriver driver = new InternetExplorerDriver(); 
		 */
		
		System.setProperty("webdriver.chrome.driver", project_path+"/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com/");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("stack overflow");
		
		List<WebElement> listOfInputElements = driver.findElements(By.xpath("//input"));
		int count = listOfInputElements.size();
		System.out.print("Number of input elements: "+count);
		
		Thread.sleep(3000);
		driver.close();
	}

}
