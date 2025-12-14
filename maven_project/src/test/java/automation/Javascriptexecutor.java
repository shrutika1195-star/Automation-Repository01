package automation;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;

import dynamic_code.BaseClass;

public class Javascriptexecutor extends BaseClass{

	public static void main(String[] args) throws IOException, InterruptedException {
		
    launchbrowser("chrome");
    takescreenshot("sslaunchbroser");
    Thread.sleep(2000);
    Hiturl("https://www.flipkart.com/");
    takescreenshot("urlss");
    Thread.sleep(2000);
    org.openqa.selenium.JavascriptExecutor js =(org.openqa.selenium.JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,600)");
    Thread.sleep(2000);
    takescreenshot("scroll down");
    js.executeScript("window.scrollBy(400,0)");
    Thread.sleep(2000);
    takescreenshot("scroll up");
    js.executeScript("window.history.back()");
    Thread.sleep(2000);
    takescreenshot("history back");
    js.executeScript("window.history.forward()");
    Thread.sleep(2000);
    takescreenshot("history forward");
    js.executeScript("window.close()");
    Thread.sleep(2000);
    takescreenshot("close");
    
    
    
	}

}
