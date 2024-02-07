package Assisment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import WebDriverManagers.WebDriverMgrs;
import io.cucumber.java.en.*;


public class Contact_us {
	
	public WebDriver driver;
	
	@Given("user launch browser")
	public void user_launch_browser() {
		//Calling WebDriverMgrs from WebDriverManager Package
		WebDriverMgrs WebMg= new WebDriverMgrs();
		//Selecting Specific Browser to launch
	    driver = WebMg.launchBrowser("chrome");
	    driver.get("https://www.iascertification.com/");
	    System.out.println("Browser Launched");
	    
	}

	@When("user click on Contact us")
	public void user_click_on_contact_us() {
		//Click on Contact us
		driver.findElement(By.xpath("//li/a/font[text()=\"Contact us\"]")).click();
		System.out.println("Contact us column is working fine");
	   
	}

	@And("user fill details")
	public void user_fill_details() {
		//Filling Details
		driver.findElement(By.xpath("//input[@placeholder=\"Mr./Ms\"]")).sendKeys("Mr");
		driver.findElement(By.xpath("//input[@name=\"your-name\"]")).sendKeys("ABC");
		driver.findElement(By.xpath("//input[@name=\"company-name\"]")).sendKeys("IASEAS");
		driver.findElement(By.xpath("//input[@name=\"Job-Title\"]")).sendKeys("Tester");
		driver.findElement(By.xpath("//input[@name=\"country\"]")).sendKeys("India");
		driver.findElement(By.xpath("//input[@name=\"phone_no\"]")).sendKeys("9876543210");
		
	}

	
	

}
