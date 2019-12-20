package forumAutomation;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utlities.constantValue;
import utlities.redExcelData;

public class LoginDriver {
	
	
	public static WebDriver driver;
	
		@Test
		public static void main(String[] args) throws Exception {
		 //Declaring the path of the Excel file with the name of the Excel file
		 String sPath = constantValue.Path_Testdata ;
		 //Here we are passing the Excel path and SheetName as arguments to connect with Excel file
		 
		 
		 redExcelData.setExcelFile(sPath,"Test Steps");
		 
		 for (int iRow=1;iRow<=8;iRow++)
		 {
		 String keywords = redExcelData.getCellData(iRow, 3); 
		 //Comparing the value of Excel cell with all the keywords in the "Actions" class
		 if(keywords.equals("openBrowser"))
		 { 
		 //This will execute if the excel cell value is 'openBrowser'    
		 //Action Keyword is called here to perform action
			 objectKeywords.openBrowser();
		 }
		 else if(keywords.equals("navigate"))
		 {
			 objectKeywords.navigate();
		 }
		 else if(keywords.equals("input_id"))
		 {
			 objectKeywords.input_id();
		 }
		 else if(keywords.equals("input_pw"))
		 {
			 objectKeywords.input_pw();
		 }
		 else if(keywords.equals("click_Login"))
		 {
			 objectKeywords.click_Login();
		 } 
		 else if(keywords.equals("click_dropdown"))
		 {
			 objectKeywords.click_dropdown();
		 } 
		 else if(keywords.equals("click_Logout"))
		 {
			 objectKeywords.click_Logout();
		 } 
		 
		 
		 else if(keywords.equals("closeBrowser"))
		 {
			 objectKeywords.closeBrowser();
		 } 
		 
		 
		 }
		 
		}

}
