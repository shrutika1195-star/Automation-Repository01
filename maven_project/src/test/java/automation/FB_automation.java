package automation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import dynamic_code.BaseClass;

public class FB_automation extends BaseClass {

	public static void main(String[] args) throws InterruptedException, IOException {
		launchbrowser("chrome");
		takescreenshot("chrome_screenshot");
		Hiturl("https://www.facebook.com/");
		takescreenshot("loginpage_screenshot");
		WebElement email = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		email.click();
		Thread.sleep(2000);
		takescreenshot("clickemailfield_screenshot");
		email.sendKeys("abs@123");
		Thread.sleep(2000);
		takescreenshot("sendkeys_screenshot");
		WebElement pass = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		pass.click();
		takescreenshot("clickpassfield_screenshot");
		pass.sendKeys("12345");
		Thread.sleep(2000);
		takescreenshot("Password_screenshot");
		WebElement showpass = driver.findElement(By.xpath("//div[@class=\"_9lsb _9ls8\"]"));
		showpass.click();
		takescreenshot("clickshowPass_screenshot");
		WebElement login = driver.findElement(By.xpath("//button[@value=\"1\"]"));
		System.out.println("The text present on login button is-" + login.getText());
		System.out.println("The text entered is " + login.getAttribute("value"));
		System.out.println("value is as " + email.getAttribute("input"));
		System.out.println("The x coordinate of " + login.getLocation().x);
		System.out.println("The y coordinate of " + login.getLocation().y);
		System.out.println("size of login button is " + login.getSize());
		System.out.println("Tagname of login is " + login.getTagName());
		System.out.println("Login button is displayed as " + login.isDisplayed());
		System.out.println("Login button is enabled as " + login.isEnabled());
		System.out.println("Login button is selected as " + login.isSelected());
		login.click();
		Thread.sleep(2000);
		takescreenshot("clicklogin_screenshot");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		WebElement forgetpass = driver.findElement(By.xpath("//a[text()=\"Forgotten password?\"]"));
		forgetpass.click();
		takescreenshot("forgetpass_screenshot");
		driver.navigate().back();
		Thread.sleep(2000);
		WebElement createnew = driver.findElement(By.xpath("(//a[@role=\"button\"])[2]"));
		createnew.click();
		Thread.sleep(2000);
		takescreenshot("createNewAcc_screenshot");
		//TakeScreenshot("TakeScreenshot", "createNewAcc_screenshot");
		driver.quit();
	

	}

}
