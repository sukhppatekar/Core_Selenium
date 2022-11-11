package Css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task2 {
public static void main(String[] args) {
		
		System.out.println("This is selenium");
		
		System.setProperty("webdriver.chrome.driver", "E:\\Tb_16\\chromedriver_win32\\chromedriver.exe");
		
        WebDriver  driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input[type^='te']")).sendKeys("AAAAAaa"); //prefix= start letter
		
	//	driver.findElement(By.cssSelector("input[type$='rd']")).sendKeys("shfuhfe12"); //suffix= last letter
		
		//driver.findElement(By.cssSelector("input[type*='bmi']")).click(); //contain=mid letter
		
		//driver.findElement(By.cssSelector("div > input")).click();
		
	//	driver.findElement(By.cssSelector("body > div:nth-child(5) > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(2) > td:nth-child(3) > form > table > tbody > tr:nth-child(4) > td > table > tbody > tr:nth-child(3) > td:nth-child(2) > input[type=password]")).sendKeys("aaa12");

    driver.findElement(By.cssSelector("td input")).sendKeys("khjh88");
}
}