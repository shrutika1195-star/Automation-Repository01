package robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dynamic_code.BaseClass;

public class RobotclasspdfToWord extends BaseClass{

	public static void main(String[] args) throws AWTException {
		launchbrowser("chrome");
		Hiturl("https://www.ilovepdf.com/pdf_to_word");
		WebElement selectPDF = driver.findElement(By.xpath("//a[@class=\"uploader__btn tooltip--left active\"]"));
		selectPDF.click();
		StringSelection s =new StringSelection("\"C:\\Users\\hp\\Downloads\\SAFAL 2025-26 Assessment Conduction Manual.pdf\"");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		Robot r =new Robot();
		 
		r.delay(3000);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		//enter button
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement convertToWord = driver.findElement(By.xpath("//button[@id=\"processTask\"]"));
		convertToWord.click();
		
		WebElement download = driver.findElement(By.xpath("//a[@slot=\"downloadUrl\"]"));
		download.click();

	}

}
