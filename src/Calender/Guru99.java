package Calender;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99
{
 
	public static void main(String[] args)
	{
		System.out.println("Calender program");
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\Tb_16\\\\103\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		WebElement dateBox = driver.findElement(By.xpath("//form//input[@name='bdaytime']"));
		dateBox.sendKeys("19061996");
		
		 dateBox.sendKeys(Keys.TAB);
         
		 dateBox.sendKeys("1245PM");
		 
		 
		 //to click on submit button
		 
		 driver.findElement(By.xpath("/html/body/form/input[2]")).click();
		
	}
}
