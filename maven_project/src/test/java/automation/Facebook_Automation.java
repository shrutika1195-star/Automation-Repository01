package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Automation {

	private static final String WebElement = null;

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		email.click();
		email.sendKeys("abs@123");
		Thread.sleep(2000);

		WebElement pass = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		pass.click();
		pass.sendKeys("12345");
		Thread.sleep(2000);
		WebElement showpass = driver.findElement(By.xpath("//div[@class=\"_9lsb _9ls8\"]"));
		showpass.click();
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.xpath("//button[@value=\"1\"]"));

		System.out.println("The text present on login button is-" + login.getText());
		System.out.println("The text entered is " + login.getAttribute("value"));
		System.out.println("value is as " + email.getAttribute("input"));
		System.out.println("The x coordinate of " + login.getLocation().x);
		System.out.println("The y coordinate of " + login.getLocation().y);
		System.out.println("size of login button is " + login.getSize());
		System.out.println("Tagname of login is " + login.getTagName());
		System.out.println("Login button is displayed as " + login.isDisplayed());
        System.out.println("Login button is enabled as " + login.isEnabled());
		System.out.println("Login button is selected as " + login.isSelected());
		login.click();
		driver.navigate().back();
		Thread.sleep(2000);
//		driver.navigate().forward();
//		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		WebElement forgot_pw = driver.findElement(By.xpath("//a[text()=\"Forgotten password?\"]"));
		forgot_pw.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
//		driver.navigate().forward();
//		Thread.sleep(2000);
		// System.out.println("The x coordinate of "+forgot_pw.getLocation().x);

		// System.out.println("The y coordinate of "+forgot_pw.getLocation().y);

		// System.out.println("size of login button is "+forgot_pw.getSize());
		WebElement create_new = driver.findElement(By.xpath("//a[contains(@data-testid,\"open-registration-form-button\")]"));
		create_new.click();
		System.out.println("The x coordinate of " + create_new.getLocation().x);
		System.out.println("The y coordinate of " + create_new.getLocation().y);
		System.out.println("size of login button is " + create_new.getSize());
		Thread.sleep(2000);
		driver.quit();
		
	}

}
