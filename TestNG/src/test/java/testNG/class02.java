package testNG;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class class02{
	WebDriver driver;

	@BeforeClass
	public void launchbrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println("launch browser");
	}

	@Test(priority =0)      //Amazon
	public void Hiturl() throws InterruptedException {
		driver.get("https://www.amazon.com/");     
		System.out.println("Hiturl");
		Thread.sleep(2000);

	}
	@Test(priority = 1)
	public void searchbar() {
		WebElement searchbar = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		searchbar.click();
		System.out.println("click on search");
		searchbar.sendKeys("jackets for women");

	}
	@Test(priority = 2)
	public void searchbutton() {
		WebElement searchbutton = driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]"));
		searchbutton.click();
		System.out.println("click on search button");
	}
	@Test(priority = 3)
	public void selectproduct() {
		WebElement selectproduct = driver.findElement(By.xpath("(//img[@class=\"s-image\"])[20]"));
		selectproduct.click();
	}
    @Test(priority = 4)
	public void selectsize() {
		WebElement selectproduct = driver.findElement(By.xpath("(//input[@aria-posinset=\"1\"])[2]"));
		selectproduct.click();
	}
	@AfterClass
	 public void closebrowser() {
		 driver.quit();
		 System.out.println("Close browser");
	 }
}
