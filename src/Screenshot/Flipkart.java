package Screenshot;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart
{
 public static void main(String[] args) throws IOException 
 {
	 System.out.println("This is screenshot program");

		System.setProperty("webdriver.chrome.driver", "E:\\Tb_16\\103\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//		File ss= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(ss,new File("E:\\Tb_16\\Screenshot_file\\flipkart.png"));
//		System.out.println("success");
			
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[5]/a/div[1]/div/img"));
        
		Actions act=new Actions(driver);
		act.moveToElement(ele).build().perform();
 
 }
}
  