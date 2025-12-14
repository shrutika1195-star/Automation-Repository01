package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.BaseClass;

public class MouseAction extends BaseClass{

	public static void main(String[] args) {
		launchbrowser("chrome");
		Hiturl("https://www.instagram.com/?hl=en");
        Actions act = new Actions(driver);
        WebElement email = driver.findElement(By.xpath("//input[@aria-label=\"Phone number, username, or email\"]"));
	    act.moveToElement(email).click().build().perform();
	    act.sendKeys("abc").build().perform();
	
	}

}
