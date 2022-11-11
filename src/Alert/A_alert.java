package Alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_alert 
{
public static void main(String[] args) throws InterruptedException 
{
	System.out.println("This is Alert or pop up handling program");

	System.setProperty("webdriver.chrome.driver", "E:\\Tb_16\\103\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.get("http://demo.automationtesting.in/Alerts.html");

//	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	
	Thread.sleep(4000);
	
	//for OK button accept()
//	driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
//	Thread.sleep(4000);
//	driver.switchTo().alert().accept();
	
	//for cancel button dismiss()
//	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
//	Thread.sleep(4000);
//	driver.switchTo().alert().dismiss();
	
	//for gettext and sendkeys
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
	
	String s=driver.switchTo().alert().getText();
	System.out.println(s);
	
	driver.switchTo().alert().sendKeys("Sukhada");
	driver.switchTo().alert().accept();
	
	
	
	
}
}
