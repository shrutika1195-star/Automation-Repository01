package dynamic_code;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;



public class BaseClass {
	public static WebDriver driver;
    public static Actions act;
	public static void launchbrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			 driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {
			 driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("edge")) {
			 driver = new EdgeDriver();

		}
		System.out.println("The broweser llaunch is -"+browser);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}
	public static void Hiturl(String url) {
		driver.get(url);
		System.out.println("The title of webpage is "+driver.getTitle());
	}

	public static void takescreenshot(String filename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("./screenshot/" + filename + ".png");
		FileHandler.copy(source, target);
	}
    //2nd ways to takescreenshot method
    public static void Screenshot(String foldername ,String filename) throws IOException   {
    	 TakesScreenshot ts1=(TakesScreenshot)driver;
    	File source1 =ts1.getScreenshotAs(OutputType.FILE);
    	File target1 =new File("./"+foldername+"/"+ filename+".png");
    	FileHandler.copy(source1, target1);

    	
    }
    public static void javaScriptExecutor(String scroll) {
    	JavascriptExecutor js =(JavascriptExecutor)driver;
    	js.executeScript(scroll);
    }
    
    public static void MouseAction(By Locator) {
    	 act =new Actions(driver);
    	WebElement element=driver.findElement(Locator);
    	act.moveToElement(element).click().build().perform();
    	//act.moveToElement(element).contextClick().build().perform();
    	//act.moveToElement(element).click().sendKeys("abc").doubleClick(element).build().perform();
    }
    
    public static void DragAndDrop(By Locator1,By Locator2, By Locator3) {
    	WebElement IF = driver.findElement(Locator1);
    	driver.switchTo().frame(IF); 
    	act =new Actions(driver);
    	WebElement drag = driver.findElement(Locator2);
        WebElement drop = driver.findElement(Locator3);
        //act.moveToElement(drag).clickAndHold().moveToElement(drop).release().build().perform();
        act.dragAndDrop(drag, drop).build().perform();
        //act.clickAndHold().release(drop).build().perform();
	}
    
    public static void Slider(By Locator4,By Locator5) {
    	WebElement IF = driver.findElement(Locator4);
        driver.switchTo().frame(IF);
    
      act = new Actions(driver);
        WebElement slider = driver.findElement(Locator5);
        
        act.moveToElement(slider).clickAndHold().moveByOffset(400, 0).release().build().perform();
       
        act.clickAndHold().moveByOffset(-150, 0).release().build().perform();
        
    }
    public static void RobotClass (By Locator5 , String path) throws AWTException{
    	
		
		WebElement selectPDF = driver.findElement(Locator5);
		selectPDF.click();
		
		StringSelection s =new StringSelection(path);
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
    	
    }
    
    }

