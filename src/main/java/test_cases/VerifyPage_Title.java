package test_cases;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.Driver_Setup;

public class VerifyPage_Title extends Driver_Setup {
public String baseUrl="http://automationpractice.com/index.php";
	
	@Test(priority=1)
	public void VerifyPageTitle_shouldPass() throws InterruptedException {
		
		driver.get(baseUrl);
		
		new WebDriverWait (driver, Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
	String foundTitleFromWebsite = driver.getTitle();
		
		SoftAssert softly = new SoftAssert();
		softly.assertEquals(foundTitleFromWebsite,"My Store");
		
		softly.assertAll();
	}
	@Test(priority=2)
	public static void isWebSiteSecured() {
		String url = driver.getCurrentUrl();
		
		if(url.contains("https")) {
			System.out.println("Site is secured");
		}else {
			System.out.println("Site is not secured");
		}
	}
	


	
}
