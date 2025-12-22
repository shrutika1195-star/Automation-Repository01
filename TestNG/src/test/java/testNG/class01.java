package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class class01 {
	WebDriver driver;

	@BeforeClass
	public void launchbrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println("launch browser");
	}

	@Test(priority = 0)    //firstcry
	public void Hiturl() throws InterruptedException {
		driver.get(
				"https://www.firstcry.com/?ref=afgbm_21145&utm_source=afgbm&utm_medium=aff&utm_content=afgbm&gad_source=1");
		System.out.println("Hiturl");
		Thread.sleep(2000);
	}

	@Test(priority = 1)
	public void search() {
		WebElement searchbar = driver.findElement(By.xpath("//input[@class=\"input-text L14_9e\"]"));
		searchbar.click();
		System.out.println("click on search");
		searchbar.sendKeys("jacket for girls");
		System.out.println("enter jacket for girls");
		
			}
	@Test(priority = 2)
	public void searchbutton() {
		WebElement searchbutton = driver.findElement(By.xpath("//span[@class=\"search-button\"]"));
		searchbutton.click();
		System.out.println("Click on search button");
		
	}
	@Test(priority = 3)
	public void scroll() throws InterruptedException {
		 org.openqa.selenium.JavascriptExecutor js =(org.openqa.selenium.JavascriptExecutor) driver;
		    js.executeScript("window.scrollBy(0,600)");
		    Thread.sleep(2000);
		    System.out.println("Page scroolled");

	}
	@Test(priority = 4)
	public void selectproduct() {
		WebElement selectproduct = driver.findElement(By.xpath("(//img[@data-clone=\"21493328a.jpg;21493328sz.jpg;21493328b.jpg;21493328c.jpg;\"]"));
		selectproduct.click();
		System.out.println("select product");
	}

	@Test(priority = 5)
	public void Addtocart() {
		WebElement Addtocart = driver.findElement(By.xpath("//span[@class=\"J16SB_42 cl_fff acttext\"]"));
		Addtocart.click();
		System.out.println("Add to cart");

	}
	@AfterClass
 public void closebrowser() {
	 driver.quit();
	 System.out.println("Close browser");
 }

}
