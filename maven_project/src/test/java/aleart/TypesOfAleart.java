package aleart;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dynamic_code.BaseClass;

public class TypesOfAleart extends BaseClass {

	public static void main(String[] args) throws InterruptedException, IOException {
		launchbrowser("chrome");
		Thread.sleep(2000);
		takescreenshot("chrome_screenshot");
		Hiturl("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		takescreenshot("homepage_screenshot");
		//simple aleart
		driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]")).click();
		Thread.sleep(2000);
		takescreenshot("click1_screenshot");
		Alert Simplealert = driver.switchTo().alert();
		Simplealert.accept();
		Thread.sleep(2000);
		takescreenshot("ssact1_screenshot");
		//confirmation aleart
		driver.findElement(By.xpath("//a[text()=\"Alert with OK & Cancel \"]")).click();
		Thread.sleep(2000);
		takescreenshot("click2_screenshot");
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		Thread.sleep(2000);
		takescreenshot("click3_screenshot");
		Alert confirmationaleart = driver.switchTo().alert();
		confirmationaleart.accept();
		Thread.sleep(2000);
		takescreenshot("ssact2_screenshot");
		
		WebElement text = driver.findElement(By.xpath("//p[@id=\"demo\"]"));
		System.out.println("The text present is -"+text.getText());
		Thread.sleep(2000);
		takescreenshot("text_screenshot");
		
		//prompt aleart
		driver.findElement(By.xpath("//a[text()=\"Alert with Textbox \"]")).click();
		Thread.sleep(2000);
		takescreenshot("click4_screenshot");
		driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();
		Thread.sleep(2000);
		takescreenshot("click5_screenshot");
		
		Alert promptaleart = driver.switchTo().alert();
		promptaleart.accept();
		Thread.sleep(2000);
		takescreenshot("ssact3_screenshot");
	
		WebElement text1 = driver.findElement(By.xpath("//p[@id=\"demo1\"]"));
		System.out.println("The text present is -"+text1.getText());
		Thread.sleep(2000);
		takescreenshot("text1_screenshot");
		driver.quit();
		
		
	}

}
