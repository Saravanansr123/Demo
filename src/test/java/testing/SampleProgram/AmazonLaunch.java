package testing.SampleProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import WebDriverManagers.WebDriverMgrs;
import io.cucumber.java.en.*;

public class AmazonLaunch {

	public WebDriver driver;
	
	@Given("user launch browser")
	public void user_launch_browser() {
		//Calling Browser from WebDriverMgrs
		WebDriverMgrs WebMg = new WebDriverMgrs();
		//Select Browser
		driver = WebMg.launchBrowser("chrome");
		//Open Amazon
		driver.get("https://www.amazon.in");
		System.out.println("Amazon opened");
	    
	}

	@When("user search product")
	public void user_search_product() {
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		Select selectObject = new Select(dropdown);
		selectObject.selectByValue("search-alias=mobile-apps");
	}

	@Then("user close browser")
	public void user_close_browser() {
		
	  // driver.quit();
	}
}
