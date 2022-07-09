package test_cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.Driver_Setup;
import pageObject.Checkbox_RadioButtton_Verify;
import pageObject.Keyboard_Event_Verify;

public class Keyboard_Event_Advance extends Driver_Setup {
	public static String baseUrl = "http://automationpractice.com/index.php";

	@Test
	public static void KeyboardEventCheck() throws InterruptedException {

		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();

		Thread.sleep(3000);
		//WebElement e=driver.findElement(By.xpath("//input[@id='search_query_top']"));
		Keyboard_Event_Verify learningPageObject = new Keyboard_Event_Verify(driver);
		learningPageObject.clickKeyboardEvent();
		Thread.sleep(1000);

		//e.sendKeys(Keys.chord(Keys.SHIFT,"tedtalk"));
		//driver.findElement(locator).sendKeys(Keys.chord(Keys.CONTROL,Keys.SHIFT,Keys.DELETE));
		Thread.sleep(3000);
		//e.sendKeys(Keys.chord(Keys.ENTER));
		Thread.sleep(3000);
		
		
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10)); 
		//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("someid")));
		
	
}
}
