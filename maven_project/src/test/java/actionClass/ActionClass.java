package actionClass;

import java.io.IOException;

import org.openqa.selenium.By;

import dynamic_code.BaseClass;

public class ActionClass extends BaseClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		launchbrowser("chrome");
		 takescreenshot("chrome_screenshot");
		 Thread.sleep(2000);
		Hiturl("https://www.instagram.com/?hl=en");
		takescreenshot("loginpage_screenshot");
		Thread.sleep(2000);
		MouseAction(By.xpath("//input[@type=\"text\"]"));
		act.sendKeys("abc").build().perform();
		takescreenshot("act1_screenshot");
		Thread.sleep(2000);

		Hiturl("https://jqueryui.com/slider/");
		takescreenshot("slider_screenshot");
		Thread.sleep(2000);
		Slider(By.xpath("//iframe[@class=\"demo-frame\"]"), By.xpath("//span[@tabindex=\"0\"]"));
		takescreenshot("act2_screenshot");
		Thread.sleep(2000);

		Hiturl("https://jqueryui.com/droppable/");
		takescreenshot("dropable_screenshot");
		Thread.sleep(2000);
		DragAndDrop(By.xpath("//iframe[@class=\"demo-frame\"]"), By.xpath("//div[@id=\"draggable\"]"),
				By.xpath("//div[@id=\"droppable\"]"));
		takescreenshot("act3_screenshot");
		Thread.sleep(2000);

	}

}
