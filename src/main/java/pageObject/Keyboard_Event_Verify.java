package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Keyboard_Event_Verify {
	WebDriver driver = null;

	// constructor

	public Keyboard_Event_Verify(WebDriver driver) {
		this.driver = driver;

	}
	By keyboard = By.xpath("//input[@id='search_query_top'");



public void clickKeyboardEvent() {
	// TODO Auto-generated method stub
	 driver.findElement(keyboard).click();	
}
}
