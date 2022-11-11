package task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {
   
	public static void main(String[] args) {
		System.out.println("Basic selenium");
		
        System.setProperty("webdriver.chrome.driver", "E:\\Tb_16\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver  driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Shree/Downloads/index.html");
		
		WebElement un= driver.findElement(By.id("uid"));
		un.sendKeys("Sukhada");
		
		WebElement pw= driver.findElement(By.name("pass"));
		pw.sendKeys("Sukhada@123");
		
	WebElement us=	driver.findElement(By.tagName("select"));
	
	Select s=new Select(us);
	
	s.selectByIndex(1);
	
	driver.findElement(By.className("rem")).click();
	
	//driver.findElement(By.className("login")).click();
	
	driver.findElement(By.linkText("Password?")).click();
	
	driver.findElement(By.partialLinkText("pass"));
		
		
	//	WebElement rem =driver.findElement(By.className("rem"));
		
	//	WebElement rem =driver.findElement(By.className("login")).click();
		
		
		
	}
}
