package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumBase1 {
	
	public static WebDriver driver;
	public static WebDriver browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\MavenProjectMain\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	public static void inputValues(WebElement element, String values) {
		element.clear();
		element.sendKeys(values);
	}
	
	public static void click(WebElement element) {
		element.click();
	}
	
	public static void dropDown(WebElement element, String text) {
		Select option = new Select(element);
		option.selectByVisibleText(text);
	}
	
	public static void getUrl(String url) {
		driver.get(url);
	}
	
	public static void demo(String s) {
		System.out.println(s);
	}
	
}
