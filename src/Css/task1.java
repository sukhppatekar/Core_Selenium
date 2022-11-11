package Css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class task1 {
   
	public static void main(String[] args) {
		
		System.out.println("This is selenium");
		
		System.setProperty("webdriver.chrome.driver", "E:\\Tb_16\\chromedriver_win32\\chromedriver.exe");
		
        WebDriver  driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Shree/Downloads/index.html");
		
		driver.findElement(By.cssSelector("input.username")).sendKeys("Sukhada@123");
		
		driver.findElement(By.cssSelector("input.pass")).sendKeys("1234aaa");
		
		WebElement dd= driver.findElement(By.cssSelector("select[id= 'browser']"));
		Select s=new Select(dd);
		s.selectByIndex(1);
		
		driver.findElement(By.cssSelector("input.rem")).click();
		
		driver.findElement(By.cssSelector("button.login")).click();
		
		
	}
}
