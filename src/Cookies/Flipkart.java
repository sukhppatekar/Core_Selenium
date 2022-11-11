package Cookies;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart 
{
public static void main(String[] args) 
{
	System.out.println("This is Calender program");

	System.setProperty("webdriver.chrome.driver", "E:\\Tb_16\\103\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.get("https://www.flipkart.com/");
	
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	
	//count total cookies
	Set<Cookie> cookies =driver.manage().getCookies();
	int count=cookies.size();
    System.out.println(count);	
    
//    for(Cookie cookie : cookies)  
//    {
//    	System.out.println("Name of cookies" + cookie.getName());
//    	System.out.println("Class of cookies" + cookie.getClass());
//    	System.out.println("Domain of cookies" + cookie.getDomain());
//    	System.out.println("Value of cookies" + cookie.getValue());
//    	System.out.println("Path of cookies" + cookie.getName());
//    	System.out.println("Expiry of cookies" + cookie.getExpiry());
//    	System.out.println("Ishttponly of cookies" + cookie.isHttpOnly());
//    	System.out.println("IsSecure of cookies" + cookie.isSecure());
//    	System.out.println("*********************");
//    	
//    }
    //to delete cookie
    
    driver.manage().deleteCookieNamed("_px3");
     Set<Cookie> cook1=driver.manage().getCookies();
	 int count1=cook1.size();
     System.out.println(count1);
     
     //to add cookie
     
     Cookie un=new Cookie("user", "Cjc");
     driver.manage().addCookie(un);
     
     }
}
