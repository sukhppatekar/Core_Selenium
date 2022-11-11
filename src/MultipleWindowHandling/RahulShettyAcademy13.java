package MultipleWindowHandling;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RahulShettyAcademy13 
{
	 public static void main(String[] args)
	 {
	 System.out.println("Multiple windo handling : second hyperlink");
	 
	 System.setProperty("webdriver.chrome.driver", "E:\\Tb_16\\103\\chromedriver.exe");
	 
	 WebDriver driver= new ChromeDriver();
	 
	 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	 //driver.manage().window().maximize();
	 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
     
	 List<WebElement> l1=driver.findElements(By.tagName("a"));
	 int count1= l1.size();
	 System.out.println("Total Links: " + count1);
	 
	 WebElement fdriver=driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]"));
	 List<WebElement> l2=fdriver.findElements(By.tagName("a"));
	 int count2=l2.size();
	 System.out.println("Footer links : " + count2);
	 
	 WebElement pfdriver =driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[3]/ul"));
	 List<WebElement> l3= pfdriver.findElements(By.tagName("a"));
	 int count3=l3.size();
	 System.out.println("3rd particular link : "+ count3);
	 
	 
	 for(int i=1; i< count3; i++)
	 {
		 System.out.println("for loop");
		String clicklink= Keys.chord(Keys.CONTROL ,Keys.ENTER);
		pfdriver.findElements(By.tagName("a")).get(i).sendKeys(clicklink);
	 }
	 
Set<String>	s= driver.getWindowHandles();
	 System.out.println(s);
	 
	 
Iterator<String> itr=	 s.iterator();
	 
    while(itr.hasNext())
   {
	System.out.println("In while loop");
	driver.switchTo().window(itr.next());
//	String title =driver.getTitle();
//	System.out.println("Title : "+ title);
	
	String url=driver.getCurrentUrl();
	
	if(url.equalsIgnoreCase("https://rahulshettyacademy.com/AutomationPractice/#"))
	{
		System.out.println("if condition");
	WebElement dd=	driver.findElement(By.xpath("//*[@id=\"dropdown-class-example\"]"));
	Select s1=new Select(dd);
	s1.selectByIndex(2);
	}
   }
	}
}
