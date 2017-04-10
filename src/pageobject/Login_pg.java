package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_pg {

	 private static WebElement element = null;
	 
	  public static WebElement txtbx_UserName(WebDriver driver){
		  
	         element = driver.findElement(By.name("email"));
	 
	         return element;
	 
	         }
	 
	     public static WebElement txtbx_Password(WebDriver driver){
	 
	         element = driver.findElement(By.name("password"));
	 
	         return element;
	 
	         }
	 
	     public static WebElement btn_LogIn(WebDriver driver){
	    	 
	    	// element = driver.findElement(By.linkText("Submit"));
	 
	         element = driver.findElement(By.xpath("/html/body/div/ui-view/div/div/div/div/div[2]/wc-form/form/div/wc-button/button"));
	 
	         return element;
	 
	         }
	
	
}
