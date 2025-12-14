package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		//id
		driver.findElement(By.id("nav-top"));
		driver.findElement(By.id("navbar-main"));
		
		//name
		driver.findElement(By.name("encrypted-slate-token"));
		driver.findElement(By.name("flow-closure-id"));
		
		//classname
		driver.findElement(By.className("navLeftFooter nav-sprite-v1"));
		driver.findElement(By.className("nav-footer-line"));
		
		//linktext
		driver.findElement(By.linkText("Customer Service"));
		driver.findElement(By.linkText("MX Player"));
		
		//partialLinktext
		driver.findElement(By.partialLinkText("Today's Deals"));
		driver.findElement(By.partialLinkText("Kindle E-Readers & eBooks"));
		
		//tagname
		driver.findElement(By.tagName("div"));
		driver.findElement(By.tagName("script"));
		
		//cssselector
		//tagname and id value
		driver.findElement(By.cssSelector("div#lvlZeroBottomDiv"));
		driver.findElement(By.cssSelector("a#nav-top"));
		
		//tagname and value of class
		driver.findElement(By.cssSelector("div.a-container alm-category-outside-desktop"));
		driver.findElement(By.cssSelector("div._store-subnav-desktop_style_subnav-node-container__1Pwms"));
		
		//tagname and attribute
		driver.findElement(By.cssSelector("meta[name=\"description\"]"));
		driver.findElement(By.cssSelector("link[rel=\"canonical\"]"));
		
		//tagname and multiple attribute
		driver.findElement(By.cssSelector("input[id=\"glowDestinationType\"][name=\"glow-destination-type\"]"));
		driver.findElement(By.cssSelector("div[id=\"navbar\"][cel_widget_id=\"Navigation-desktop-navbar\"]"));
		
		//contains*
		driver.findElement(By.cssSelector("form[id*=\"nav-search-bar-form\"]"));
		driver.findElement(By.cssSelector("header[id*=\"navbar-main\"]"));
		
		//startswith^
		driver.findElement(By.cssSelector("div[id^=\"nav-shop\"]"));
		driver.findElement(By.cssSelector("nav[id^=\"shortcut-menu\"]"));
		
		//endswith$
		driver.findElement(By.cssSelector("link[rel$=\"canonical\"]"));
		driver.findElement(By.cssSelector("meta[name$=\"flow-closure-id\"]"));
		
		//pseudoclass
		//firstchild
		driver.findElement(By.cssSelector("select[aria-describedby=\"searchDropdownDescription\"] :first-child"));
		//last child
		driver.findElement(By.cssSelector("select[aria-describedby=\"searchDropdownDescription\"] :last-child"));
		//nth child
		driver.findElement(By.cssSelector("select[aria-describedby=\"searchDropdownDescription\"] :nth-child(5)"));
		driver.findElement(By.cssSelector("select[aria-describedby=\"searchDropdownDescription\"] :nth-child(4)"));
		//nth-last-child
		driver.findElement(By.cssSelector("select[aria-describedby=\"searchDropdownDescription\"] :nth-last-child(6)"));
		driver.findElement(By.cssSelector("select[aria-describedby=\"searchDropdownDescription\"] :nth-last-child(5)"));

         //x-path
		//relative xpath
		//tagname and attribute
		driver.findElement(By.xpath("//meta[@name=\"msvalidate.01\"]"));
		driver.findElement(By.xpath("//img[@alt=\"Uber\"]"));
		
		//tagname and multiple attribute
		driver.findElement(By.xpath("//div[@class=\"a-carousel-col a-carousel-right celwidget\"][@style=\"visibility: visible; z-index: 10;\"]"));
		driver.findElement(By.xpath("//div[@data-a-card-type=\"basic\"][@id=\"CardInstanceIdSUdF93YG8v55moaDrBBQ\""));
		
		//tagname multiple attribute with and
		driver.findElement(By.xpath("//div[@id=\"gw-content-grid\"and@class=\"a-section a-spacing-large\"]"));
		driver.findElement(By.xpath("//div[@data-flow-dir=\"v\"and@data-order-ws=\"4\"]"));
		
		//tagname multiple attribute with or
		driver.findElement(By.xpath("//div[@class=\"navLeftFooter nav-sprite-v1\"and@id=\"navFooter\"]"));
		driver.findElement(By.xpath("//div[@id=\"a-popover-root\"or@style=\"z-index:-1;position:absolute;\"]"));
		
		//contains
		driver.findElement(By.xpath("//div[contains(@class,\"a-section a-spacing-none gw-card-layout\")]"));
		driver.findElement(By.xpath("//span[contains(@id,\"nav-link-accountList-nav-line-1\")]"));
		
		//starts-with
		driver.findElement(By.xpath("//meta[starts-with(@http-equiv,\"x-dns-prefetch-control\")]"));
		driver.findElement(By.xpath("//meta[starts-with(@name,\"description\")]"));
		
		//text
		driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
		driver.findElement(By.xpath("//a[text()=\"Bestsellers\"]"));
		
		//parent and child relation
		driver.findElement(By.xpath("//select[@aria-describedby=\"searchDropdownDescription\"]//option[@selected=\"selected\"]"));
		
		//current node or self node
		driver.findElement(By.xpath("//option[@value=\"search-alias=nowstore\"]//self::option"));
		driver.findElement(By.xpath("//option[@value=\"search-alias=mobile-apps\"]//self::option"));
		
		//select parent node from child
		driver.findElement(By.xpath("//option[@value=\"search-alias=mobile-apps\"]//parent::select"));
		
		//select child node from parent
		driver.findElement(By.xpath("(//select[@name=\"url\"]//child::option)[6]"));
		driver.findElement(By.xpath("(//select[@name=\"url\"]//child::option)[12]"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
