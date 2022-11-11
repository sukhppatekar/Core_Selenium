package Css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class a {
public static void main(String[] args) {
		
		System.out.println("This is selenium");
		
		System.setProperty("webdriver.chrome.driver", "E:\\Tb_16\\chromedriver_win32\\chromedriver.exe");
		
        WebDriver  driver=new ChromeDriver();
		
        driver.get("file:///C:/Users/Shree/Downloads/index.html");

         driver.manage().window().maximize();
         
         driver.findElement(By.cssSelector("input[class$='me']")).sendKeys("abc123");
         
         driver.findElement(By.cssSelector("input[class*='as']")).sendKeys("aa123");
         
        WebElement dd= driver.findElement(By.cssSelector("select[id='browser']"));
        Select s=new Select(dd);
        s.selectByIndex(1);
        
        
        
}
}
