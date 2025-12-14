package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.BaseClass;

public class Slider extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		launchbrowser("chrome");
		Thread.sleep(2000);
		Hiturl("https://jqueryui.com/slider/");
		Thread.sleep(2000);
       
       WebElement IF = driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
       driver.switchTo().frame(IF);
       Thread.sleep(2000);
       Actions act = new Actions(driver);
       WebElement slider = driver.findElement(By.xpath("//span[@tabindex=\"0\"]"));
       
       act.moveToElement(slider).clickAndHold().moveByOffset(400, 0).release().build().perform();
       Thread.sleep(2000);
       act.clickAndHold().moveByOffset(-150, 0).release().build().perform();
       Thread.sleep(2000);
       
       
       
       
	}

}
