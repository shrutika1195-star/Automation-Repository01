package report;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import dynamic_code.BaseClass;

public class CreateReport extends BaseClass {

	public static void main(String[] args) throws IOException, Exception {
		String projectpath = System.getProperty("user.dir");
		ExtentSparkReporter esr = new ExtentSparkReporter(projectpath + "\\report\\ReportGenerated\\");
		esr.config().setDocumentTitle("Automation Testing");
		esr.config().setReportName("Ecommerce Report");
		esr.config().setTheme(Theme.STANDARD);

		ExtentReports er = new ExtentReports();
		er.attachReporter(esr);

		// system configuration
		er.setSystemInfo("OS", "Window");
		er.setSystemInfo("Broswer", "Chrome");
		er.setSystemInfo("Domain", "Ecommerece");
		er.setSystemInfo("Application", "Flipcart");
		er.setSystemInfo("Quality Analyst", "Shrutika Kale");

		ExtentTest et = er.createTest("Launch Browser");
		et.log(Status.INFO, "LaunchBrowser");

		ExtentTest et1 = er.createTest("Hit URL");
		et1.log(Status.PASS, "Pass hit url");

		ExtentTest et2 = er.createTest("Click on Search functionality");
		et2.log(Status.FAIL, "Searchfunctionality");

		ExtentTest et3 = er.createTest("Send Data");
		et3.log(Status.SKIP, "Send Data");

		ExtentTest et4 = er.createTest("Click on Search button");
		et4.log(Status.PASS, "Searchbutton");

		ExtentTest et5 = er.createTest("Click on Add To Cart");
		et5.log(Status.PASS, "AddToCart");

		ExtentTest et6 = er.createTest("Click on Add To Cart");
		et6.log(Status.PASS, "AddToCart");

		ExtentTest et7 = er.createTest("Click on Go To Cart");
		et7.log(Status.PASS, "GoToCart");

		launchbrowser("Chrome");
		Thread.sleep(2000);
		Screenshot("screenshot", "Launchbrowserss");
		et1.addScreenCaptureFromPath(projectpath + "\\screenshot\\Launchbrowserss" + ".png");

		Hiturl("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_8ajnwscezy_e&adgrpid=155259813353&hvpone=&hvptwo=&hvadid=674893539992&hvpos=&hvnetw=g&hvrand=578501044148096622&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9152288&hvtargid=kwd-298301461664&hydadcr=5625_2359479&gad_source=1");
		Thread.sleep(2000);
		Screenshot("screenshot", "Hiturl");
		et2.addScreenCaptureFromPath(projectpath + "\\screenshot\\Hiturl" + ".png");

		WebElement search = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		search.click();
		Thread.sleep(2000);
		Screenshot("screenshot", "searchbar");
		et3.addScreenCaptureFromPath(projectpath + "\\screenshot\\searchbar" + ".png");

		search.sendKeys("earbuds");
		Thread.sleep(2000);
		Screenshot("screenshot", "sendkeys");
		et4.addScreenCaptureFromPath(projectpath + "\\screenshot\\sendkeys" + ".png");

		WebElement searchButton = driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]"));
		searchButton.click();
		Thread.sleep(2000);
		Screenshot("screenshot", "searchbuttonclick");
		et5.addScreenCaptureFromPath(projectpath + "\\screenshot\\searchbuttonclick" + ".png");

		org.openqa.selenium.JavascriptExecutor js = (org.openqa.selenium.JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);

		WebElement Addtocart = driver.findElement(By.xpath("(//button[@name=\"submit.addToCart\"])[1]"));
		Addtocart.click();
		Thread.sleep(2000);
		Screenshot("screenshot", "addtocart");
		et6.addScreenCaptureFromPath(projectpath + "\\screenshot\\addtocart" + ".png");

		WebElement gotocard = driver.findElement(By.xpath("(//span[@aria-hidden=\"true\"])[1]"));
		gotocard.click();
		Thread.sleep(2000);
		Screenshot("screenshot", "gotocart");
		et7.addScreenCaptureFromPath(projectpath + "\\screenshot\\gotocart" + ".png");

		er.flush();

	}

}
