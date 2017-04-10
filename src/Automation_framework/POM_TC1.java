package Automation_framework;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageobject.Login_pg;
import pageobject.campaign;

public class POM_TC1 {
	
	private static WebDriver driver = null;
	public static void main (String [] args) throws InterruptedException{
		
		//driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","E:\\Seenium3.0.1\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://yavun.webcontentor.com/app/#/app/login");	
		//	
		Login_pg.txtbx_UserName(driver).sendKeys("vivek@fusioninfosys.com");
		Login_pg.txtbx_Password(driver).sendKeys("123456");
		Login_pg.btn_LogIn(driver).click();
		Thread.sleep(4000);
		driver.manage().window().maximize();
		System.out.println("Login Successfully");
		
		campaign.page_campaign(driver).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		campaign.clk_start_campaign(driver).click();
		System.out.println(" clicked on start button");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		campaign.Select_chkbx1(driver).click();
		System.out.println("checkbox  1  selected");
		Thread.sleep(4000);
		campaign.innerpage_campaign(driver).click();
		System.out.println(" inner page");
		
		//campaign.select_chkbx2(driver).click();
		//System.out.println("checkbox  2  selected");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		campaign.Click_next(driver).click();
		System.out.println(" Click next");
		campaign.campaign_name(driver).sendKeys("Vivek");
		System.out.println(" campaign name entered");
		campaign.open_calendar(driver).click();
		System.out.println(" Calendar open");
		campaign.click_start_date(driver).click();
		System.out.println("Statrt date selected");
		campaign.click_end_date(driver).click();
		System.out.println("end date selected");
		campaign.Click_next(driver).click();
		System.out.println("Next button clicked");
		
		
	}

}
