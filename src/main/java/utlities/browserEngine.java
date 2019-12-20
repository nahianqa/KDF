package utlities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browserEngine {
public static WebDriver driver;
	
	public static WebDriver getBrowser(String browserType) {
		switch (browserType) {
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			return driver = new FirefoxDriver();
		case "chrome":
			WebDriverManager.chromedriver().setup();
			return driver = new ChromeDriver();
		case "IE":
			WebDriverManager.iedriver().setup();
			return	driver = new InternetExplorerDriver();
		default:
			System.out.println("browser : " + browserType + " is invalid, Launching Firefox as browser of choice..");
			return driver = new FirefoxDriver();
		}
	}

}
