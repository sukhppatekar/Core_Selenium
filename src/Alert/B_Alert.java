package Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_Alert
{
	public static void main(String[] args) throws InterruptedException 
	{
		
	
	System.out.println("This is Alert or pop up handling program");

	System.setProperty("webdriver.chrome.driver", "E:\\Tb_16\\103\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.get("https://nxtgenaiacademy.com/alertandpopup/");
	
//	driver.findElement(By.xpath("//*[@id=\"content\"]/article/div/div/div/div/section[3]/div/div/div[1]/div/div/div/div/center/button")).click();
//	
//	Thread.sleep(4000);
//	driver.switchTo().alert().accept();
//
//	
//	driver.findElement(By.xpath("//*[@id=\"content\"]/article/div/div/div/div/section[3]/div/div/div[2]/div/div/div/div/center/button")).click();
//	Thread.sleep(4000);
//	driver.switchTo().alert().dismiss();
//	
    driver.findElement(By.xpath("//*[@id=\"content\"]/article/div/div/div/div/section[3]/div/div/div[3]/div/div/div/div/center/button")).click();
    Thread.sleep(4000);
  String msg=  driver.switchTo().alert().getText();
  System.out.println(msg);
  
 
  Thread.sleep(2000);
  driver.switchTo().alert().sendKeys("yes");
  driver.switchTo().alert().accept();
  
}
}