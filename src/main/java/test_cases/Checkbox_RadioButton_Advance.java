package test_cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.Driver_Setup;
import pageObject.Checkbox_RadioButtton_Verify;

public class Checkbox_RadioButton_Advance extends Driver_Setup {
	public static String baseUrl = "https://jqueryui.com/checkboxradio";

	@Test
	public static void checkBoxAndRadioButtonInIFrame() throws InterruptedException {
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();

		Thread.sleep(5000);
		// Switch to Frame
		driver.switchTo().frame(0);

		// Operate Elements

		Checkbox_RadioButtton_Verify learningPageObject = new Checkbox_RadioButtton_Verify(driver);
		learningPageObject.clickRadioButton();
		Thread.sleep(1000);
		learningPageObject.clickCheckBox();
		learningPageObject.clickCheckBox2();
		Thread.sleep(1000);

		// Back to page
		driver.switchTo().defaultContent();
		// Close site
		driver.close();
	}
}
