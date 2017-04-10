package pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class campaign {
	
	private static WebElement element = null;
	
	WebDriver driver = new ChromeDriver();
	
	public static WebElement page_campaign (WebDriver driver){
			
		element = driver.findElement(By.xpath("//*[@id='bs-example-navbar-collapse-1']/ul/li[2]/a"));
		return element;
	}
	
	public static WebElement innerpage_campaign(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id='rightPanel']/div[1]/div/div[3]/wc-button[2]/button"));
		return element;
		
	}
	
	public static WebElement clk_start_campaign(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id='rightPanel']/div[2]/ui-view/div/div[2]/div/div"));
		return element;
	}
	
	public static WebElement Select_chkbx1(WebDriver driver){
		WebElement elementToClick = driver.findElement(By.xpath("//*[@id='rightPanel']/div[2]/ui-view/ui-view/div/div[3]/div[1]/div[2]/div[1]/label"));
		elementToClick.isSelected();
		return element;
	}
	
	public static WebElement select_chkbx2(WebDriver driver){
		WebElement elementToClick = driver.findElement(By.cssSelector("div.feature_box:nth-child(2) > div:nth-child(2) > div:nth-child(1) > label:nth-child(2)"));
		elementToClick.click();
		return element;
	}

	public static WebElement Click_next(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id='rightPanel']/div[1]/div/div[3]/wc-button[2]/button"));
		return element;
	}

	public static WebElement campaign_name(WebDriver driver) {
		element = driver.findElement(By.name("campaignName"));
		return element;
	}

	public static WebElement open_calendar(WebDriver driver){
		WebElement selectdate = driver.findElement(By.xpath("//*[@id='rightPanel']/div[2]/ui-view/ui-view/div/div[3]/div/div[2]/wc-form/form/ng-include/div/div[3]/div/div[2]/wc-fields/div/wc-calendar/div/div/div/input"));
		selectdate.click();
		return selectdate;
	}	
		
	public static WebElement click_start_date(WebDriver driver){
		
        List<WebElement> allDates=driver.findElements(By.xpath("//*[@id='rightPanel']/div[2]/ui-view/ui-view/div/div[3]/div/div[2]/wc-form/form/ng-include/div/div[3]/div/div[2]/wc-fields/div/wc-calendar/div/div/div/ul//td"));
		
		for(WebElement ele:allDates)
		{
			String date=ele.getText();
			if(date.equalsIgnoreCase("28"))
			{
				ele.click();
				break;
			}
				}
		return element;
	  }
	
     public static WebElement click_end_date(WebDriver driver){
		
        List<WebElement> allDates=driver.findElements(By.xpath("//*[@id='rightPanel']/div[2]/ui-view/ui-view/div/div[3]/div/div[2]/wc-form/form/ng-include/div/div[3]/div/div[2]/wc-fields/div/wc-calendar/div/div/div/ul//td"));
		
		for(WebElement ele:allDates)
		{
			String date=ele.getText();
			if(date.equalsIgnoreCase("28"))
			{
				ele.click();
				break;
			}
				}
		return element;
	  }


	
}