package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import dynamic_code.BaseClass;

public class StaticWithSelectTagname extends BaseClass {

	public static void main(String[] args) {
		launchbrowser("chrome");
		Hiturl("https://practice.expandtesting.com/dropdown");
		WebElement SD = driver.findElement(By.xpath("//select[@id=\"dropdown\"]"));

		Select s = new Select(SD);
		WebElement opt1 = driver.findElement(By.xpath("//select[@id=\"dropdown\"]//option[@value=\"1\"]"));
		
		Select s1 = new Select(opt1);
		s1.selectByIndex(2);
		
//		WebElement DOB = driver.findElement(By.xpath("//select[@class=\"form-control\"]"));
//		Select s2 = new Select(DOB);
//		
//		s2.selectByVisibleText(null)
//		
		WebElement CS = driver.findElement(By.xpath("//select[@id=\"country\"]"));
		Select s2 = new Select(CS);
		s2.selectByVisibleText("India");

	}

}
