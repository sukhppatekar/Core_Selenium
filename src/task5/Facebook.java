package task5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) 
	   {
		  System.out.println("Basic selenium");
			
		  System.setProperty("webdriver.chrome.driver", "E:\\Tb_16\\chromedriver_win32\\chromedriver.exe");
		  
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://www.facebook.com/login/");
		  
	//	  driver.findElement(By.xpath("//div[1]/child :: input")).sendKeys("Sukh123");
		  
		//  driver.findElement(By.xpath("/html/body/form/div[10]/input[14]")).sendKeys("Sukhada");
		  
		  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Sukhada");
		  
		  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Sukhada123");
		  
		  driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
}
}
