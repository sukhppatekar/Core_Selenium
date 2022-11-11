package MultipleWindowHandling;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RahulshettyAcademy11
{

	public static void main(String[] args) throws InterruptedException 
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
    
	for(int i=1; i<count3 ; i++ )
	{
		System.out.println("in for loop");
		String clicklink= Keys.chord(Keys.CONTROL, Keys.ENTER);
		pfdriver.findElements(By.tagName("a")).get(i).sendKeys(clicklink);
		
	}
	
	//to fetch key value on console
	Set<String> s= driver.getWindowHandles();
	System.out.println(s);
	
	//to convert set into arraylist
	
	ArrayList<String> al= new ArrayList<String>(s);
	Iterator<String> itr=al.iterator();
	while(itr.hasNext())
	{
		
		driver.switchTo().window(itr.next());
		String title= driver.getTitle();
		System.out.println("title :-" + " " + title);
	    Thread.sleep(6000);
	
	
	if(title.equalsIgnoreCase("REST API Tutorial"))
	{
	System.out.println("in if condition");
	//driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/ul/ul/li[1]/a")).click();
	
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/ul/li[4]/a")).click();
	}
	
}
}
}