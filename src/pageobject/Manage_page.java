package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Manage_page {
	
		private static WebElement element = null;
		
		public static WebElement Click_manage(WebDriver driver){
			
		WebElement element = driver.findElement(By.xpath("html/body/div[1]/ui-view/div[1]/header/div/div[1]/ul/li[3]/a"));
			
		return element;
		}
	
		public static WebElement Click_create_btn(WebDriver driver){
			// We can use this method for both Next & Save button.
			element = driver.findElement(By.xpath("html/body/div[1]/ui-view/div[2]/div/div[2]/div[1]/div/div[3]/wc-button/button"));
			return element;
		}
		
		public static WebElement Name_textfld(WebDriver driver){
			element = driver.findElement(By.name("name"));
			return element;
		}
		
		
}