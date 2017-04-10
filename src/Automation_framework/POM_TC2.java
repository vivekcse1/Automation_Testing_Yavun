package Automation_framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageobject.Login_pg;
import pageobject.Manage_page;

public class POM_TC2 {

	private static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
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
		Manage_page.Click_manage(driver).click();
		Manage_page.Click_create_btn(driver).click();
		Manage_page.Name_textfld(driver).sendKeys("Vivek");
		Manage_page.Click_create_btn(driver).click();

	}

}
