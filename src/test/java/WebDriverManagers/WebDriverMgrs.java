package WebDriverManagers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class WebDriverMgrs {

	private WebDriver driver;

	public WebDriver launchBrowser(String browserName) {

		if (browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "src/test/resources/drivers/msedgedriver.exe");
			EdgeOptions ed = new EdgeOptions();
			ed.addArguments("--remote-allow-origins=*");
			driver = new EdgeDriver(ed);
		}

		else if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
			ChromeOptions cd = new ChromeOptions();
			cd.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(cd);
		} else
			System.out.println("Invalid Browser Name");

		driver.manage().window().maximize();
		return driver;
	}
}
