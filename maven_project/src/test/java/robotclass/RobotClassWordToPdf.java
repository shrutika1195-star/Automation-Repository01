package robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dynamic_code.BaseClass;

public class RobotClassWordToPdf extends BaseClass {

	public static void main(String[] args) throws AWTException {
		launchbrowser("chrome");
		
		Hiturl("https://www.ilovepdf.com/word_to_pdf");
		
		RobotClass(By.xpath("//a[@class=\"uploader__btn tooltip--left active\"]"), "\"C:\\Users\\hp\\Downloads\\SAFAL 2025-26 Assessment Conduction Manual.docx\"");

	}

}
