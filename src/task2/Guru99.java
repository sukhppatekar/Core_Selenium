package task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99 {
public static void main(String[] args) {
	System.out.println("Basic selenium");
	
	  System.setProperty("webdriver.chrome.driver", "E:\\Tb_16\\chromedriver_win32\\chromedriver.exe");
		
    WebDriver  driver=new ChromeDriver();
    
    driver.get("https://demo.guru99.com/test/newtours/index.php");
    
    WebElement un= driver.findElement(By.name("userName"));
	un.sendKeys("QQQQ");
	
	WebElement pw= driver.findElement(By.name("password"));
	pw.sendKeys("qqqq");
	
	driver.findElement(By.name("submit")).click();
	
}
}
