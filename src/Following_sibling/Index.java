package Following_sibling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Index {
	public static void main(String[] args) {
		
	
	
	 System.out.println("Basic selenium");
		
	  System.setProperty("webdriver.chrome.driver", "E:\\Tb_16\\chromedriver_win32\\chromedriver.exe");
	  
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("file:///C:/Users/Shree/Downloads/index.html");
	  
	  driver.manage().window().maximize();
	  
	//  driver.findElement(By.xpath("//input[@type='text']/following-sibling :: input")).sendKeys("Cjc_by_kunalSir");//for pw
	  
     driver.findElement(By.xpath("//label[1]/following-sibling :: input")).sendKeys("CJC_by_kunalSir");
    
    driver.findElement(By.xpath("//label[2]/following-sibling :: input")).sendKeys("sukh123");
     
   
     
     WebElement dd= driver.findElement(By.xpath("//label[3]/preceding-sibling :: select"));
      Select s=new Select(dd);
      s.selectByIndex(2);
      
   //  driver.findElement(By.xpath("//button/preceding-sibling :: label[3]")).click();// checkbox
     
    // driver.findElement(By.xpath("//input[3][@type='checkbox']"));
      
      driver.findElement(By.xpath("//button/preceding-sibling :: label[1]")).click();
      
    driver.findElement(By.xpath("//select/following-sibling :: button")).click();
     
     driver.findElement(By.xpath("//span/preceding-sibling :: div")).click();
     
     driver.findElement(By.xpath("//div[2]/following-sibling:: a")).click();
     
}
}