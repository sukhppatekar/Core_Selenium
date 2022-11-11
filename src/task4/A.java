package task4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A {
	
	 public static void main(String[] args) 
	   {
		  System.out.println("Basic selenium");
			
		  System.setProperty("webdriver.chrome.driver", "E:\\Tb_16\\chromedriver_win32\\chromedriver.exe");
		  
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("file:///C:/Users/Shree/Downloads/index.html");
		  
		//  driver.findElement(By.xpath("/html/body/form/div[1]/input[1]")).sendKeys("CJC");
		  
		// driver.findElement(By.xpath("/html/body/form/div[1]/input[2]")).sendKeys("cjc@123");

	
		
		 //driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Cjc@123");
		 
		// driver.findElement(By.xpath("//option[1]/parent :: select ")).click();
		 
		// driver.findElement(By.xpath("//div[1]/child:: input[2]")).sendKeys("Sukhada");
		 
		WebElement dd= driver.findElement(By.xpath("//option[2]/parent :: select"));
		Select s=new Select(dd);
		s.selectByIndex(2);
		
		driver.findElement(By.xpath("//input[2]/preceding-sibling :: input")).sendKeys("Sukhdaa");
		
		driver.findElement(By.xpath("//select/preceding-sibling :: *[3]")).sendKeys("Sukhada123");
	   }
}