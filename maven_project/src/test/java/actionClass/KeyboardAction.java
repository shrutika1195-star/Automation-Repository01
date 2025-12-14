package actionClass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.BaseClass;

public class KeyboardAction extends BaseClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		launchbrowser("chrome");
		Thread.sleep(2000);
		takescreenshot("chrome_screenshot1");
		Hiturl("https://www.flipkart.com/");
		Thread.sleep(2000);
		takescreenshot("chrome_screenshot1");
		Actions act =new Actions (driver);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(2000);
        takescreenshot("chrome_screenshot1");
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		takescreenshot("chrome_screenshot1");
		act.keyDown(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
		takescreenshot("chrome_screenshot1");
		act.keyDown(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
		takescreenshot("chrome_screenshot1");
		WebElement searchbar =driver.findElement(By.xpath("//input[@class=\"Pke_EE\"]"));
		searchbar.click();
		Thread.sleep(2000);
		takescreenshot("chrome_screenshot1");
		searchbar.sendKeys("abcd");
		Thread.sleep(2000);
		takescreenshot("chrome_screenshot1");
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		takescreenshot("chrome_screenshot1");
		driver.quit();
		

	}

}
