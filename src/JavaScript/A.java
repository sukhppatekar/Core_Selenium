package JavaScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A
{
	public static void main(String[] args) 
	{
		
	
	System.out.println("This is Calender program");

	System.setProperty("webdriver.chrome.driver", "E:\\Tb_16\\103\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.get("https://ksrtc.in/oprs-web/");
	
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	
	
	JavascriptExecutor js=  (JavascriptExecutor)driver;
	js.executeScript("scrollBy(0,300)");
	
	
	
}
}