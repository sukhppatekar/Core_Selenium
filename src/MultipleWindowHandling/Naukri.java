package MultipleWindowHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri 

{
	public static void main(String[] args) 
	{
		
	
	System.out.println("This is Calender program");

	System.setProperty("webdriver.chrome.driver", "E:\\Tb_16\\103\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.get("https://www.naukri.com/");
	
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	
	
	List<WebElement>l1=driver.findElements(By.tagName("a"));
	int count1=l1.size();
	System.out.println(count1);
	
	WebElement footerdrive= driver.findElement(By.xpath("//*[@id=\"Footer\"]"));
	List<WebElement>l2= footerdrive.findElements(By.tagName("a"));
	int count2= l2.size();
	System.out.println(count2);
	
	WebElement footerdrive1 = driver.findElement(By.xpath("//*[@id=\"Footer\"]/div[1]/div/div/div[2]"));
	List<WebElement> l3= footerdrive1.findElements(By.tagName("a"));
	int count3= l3.size();
	System.out.println(count3);
	
	
	WebElement footerdrive2 = driver.findElement(By.xpath("//*[@id=\"Footer\"]/div[1]/div/div/div[3]"));
	List<WebElement> l4= footerdrive2.findElements(By.tagName("a"));
	int count4= l4.size();
	System.out.println(count4);
	
	
	WebElement footerdrive3 = driver.findElement(By.xpath("//*[@id=\"Footer\"]/div[1]/div/div/div[4]"));
	List<WebElement> l5= footerdrive3.findElements(By.tagName("a"));
	int count5= l5.size();
	System.out.println(count5);
	
	
	
	}
}