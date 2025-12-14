package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.BaseClass;

public class DragAndDrop extends BaseClass {

	public static void main(String[] args) {
		launchbrowser("chrome");
		Hiturl("https://jqueryui.com/droppable/");
		WebElement IF = driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
        driver.switchTo().frame(IF); 
        Actions act =new Actions(driver);
        WebElement drag = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
        WebElement drop = driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
        //act.moveToElement(drag).clickAndHold().moveToElement(drop).release().build().perform();
        act.dragAndDrop(drag, drop).build().perform();
        //act.clickAndHold().release(drop).build().perform();
	}

}
