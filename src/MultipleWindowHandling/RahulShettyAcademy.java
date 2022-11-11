package MultipleWindowHandling;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RahulShettyAcademy 
{
	public static void main(String[] args) 
	{
		
	
	System.out.println("This is Calender program");

	System.setProperty("webdriver.chrome.driver", "E:\\Tb_16\\103\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	
	//Total hyperlink
	
	List<WebElement>totalhyperlink=driver.findElements(By.tagName("a"));
	int count1=totalhyperlink.size();
	System.out.println("Total page hyperlinks " + count1);
	
	//Total footer hyperlink
	
	WebElement footerdriver=driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]"));
	
	List<WebElement>footerhyperlink = footerdriver.findElements(By.tagName("a"));
	int count2=footerhyperlink.size();
	System.out.println("footer hyperlink " +  count2 );
	
	//hyper link comes under 1st Particular Hyperlink
	
	WebElement pfdriver =driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]"));
	List<WebElement> pfhyperlink= pfdriver.findElements(By.tagName("a"));
	int count3=pfhyperlink.size();
	System.out.println("particular footer hyperlink " + count3);
	
	
	//for 2nd Particular Hyperlink
	
	WebElement pfdriver1=	driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[2]"));
	List<WebElement> pfhyperlink1= pfdriver1.findElements(By.tagName("a"));
	int count4 = pfhyperlink1.size();
	System.out.println("particular footer hyperlink for 2 :- " + count4);
	
	//for 3rd Particular Hyperlink
	
		WebElement pfdriver2=	driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[3]"));
		List<WebElement> pfhyperlink2= pfdriver2.findElements(By.tagName("a"));
		int count5 = pfhyperlink2.size();
		System.out.println("particular footer hyperlink for 3 :- " + count5);
		
		
		//for 4th Particular Hyperlink
		
			WebElement pfdriver3=	driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[4]"));
			List<WebElement> pfhyperlink3= pfdriver3.findElements(By.tagName("a"));
			int count6 = pfhyperlink3.size();
			System.out.println("particular footer hyperlink for 4:- " + count6);
			
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}