package Automation_framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageobject.Login_pg;
import pageobject.Manage_page;
import pageobject.MyCampaign_page;
import pageobject.campaign;

public class Yavun_TC03 {

	private static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Seenium3.0.1\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://yavun.webcontentor.com/app/#/app/login");	
		Login_pg.txtbx_UserName(driver).sendKeys("vivek@fusioninfosys.com");
		Login_pg.txtbx_Password(driver).sendKeys("123456");
		Login_pg.btn_LogIn(driver).click();
		//driver.manage().window().maximize();
		Thread.sleep(3000);
		campaign.page_campaign(driver).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		MyCampaign_page.click_mycampaign(driver).click();
		MyCampaign_page.click_mycampaign2(driver).click();
	}

}
