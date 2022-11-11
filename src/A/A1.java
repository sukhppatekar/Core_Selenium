package A;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1 {
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("This is Alert or pop up handling program");

		System.setProperty("webdriver.chrome.driver", "E:\\Tb_16\\106\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

//		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@class='nav_a']")).click();

}
}