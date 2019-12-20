package forumAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utlities.browserEngine;
import utlities.constantValue;

public class objectKeywords {
	public static WebDriver driver;
	 public static void openBrowser()
	 { 
		 driver = browserEngine.getBrowser("chrome");
	 }
	 public static void navigate()
	 { 
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	// driver.get("http://forum.digitalpoint.tech/user/index.php/login");
	 driver.get(constantValue.URL);
	 }
	 public static void input_id()
	 {
	 driver.findElement(By.name("email")).sendKeys(constantValue.email); 
	 }
	 public static void input_pw()
	 {
	 driver.findElement(By.name("password")).sendKeys(constantValue.password);
	 }
	 
	 public static void click_Login(){
		 driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div[2]/div[3]/div[2]/button")).click();
			
	 }
	 
	 
	 public static void click_dropdown(){
		 driver.findElement(By.xpath("//*[@id='navbar-right']/li/a")).click();
	 }
	 public static void click_Logout(){
		
			driver.findElement(By.xpath("//*[@id='navbar-right']/li/ul/li/a")).click();
		 
			
	 }
	 
	 public static void closeBrowser(){
	 driver.quit();
	 }
	 
	 }




