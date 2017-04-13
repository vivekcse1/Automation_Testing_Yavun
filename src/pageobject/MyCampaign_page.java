package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyCampaign_page {
	
	private static WebElement element = null;

	public static WebElement click_mycampaign(WebDriver driver) throws InterruptedException {
		
		//element = driver.findElement(By.xpath(".//*[@id='leftNav']/div/div[2]/div[2]/ul/li[2]"));
		//return element;
		driver.findElement(By.xpath("html/body/div[1]/ui-view/div[2]/div/div[1]/div/div[2]/div[1]/div[2]/div"));
		return element;
	}
	
public static WebElement click_mycampaign2(WebDriver driver) {
	
		element = driver.findElement(By.xpath(".//*[@id='leftNav']/div/div[2]/div[2]/ul/li[2]"));
		
		return element;
	}
}
