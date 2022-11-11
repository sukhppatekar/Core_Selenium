package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1 
{
	public static void main(String[] args) {
		
	
	 System.out.println("Basic selenium");
		
	  System.setProperty("webdriver.chrome.driver", "E:\\Tb_16\\103\\chromedriver.exe");
	  
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://demo.guru99.com/test/newtours/register.php");
	  
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.xpath("//td[2]/child :: input[@size=20]")).sendKeys("ABC"); 
	//  driver.findElement(By.xpath("//input/preceding-sibling :: td[@align='right']")).sendKeys("ABCCCCC");
       
	 driver.findElement(By.xpath("//tr/preceding-sibling:: tr/td/input[@name='lastName']")).sendKeys("aaaaa");
	  
	driver.findElement(By.xpath("//tr/preceding-sibling :: tr/td/input[@name='phone']")).sendKeys("9890360883");
	
	driver.findElement(By.xpath("//tr/following-sibling :: tr/td/input[@id='userName']")).sendKeys("abc@gmail.com");
	
	}
}