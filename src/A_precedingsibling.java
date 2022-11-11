import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A_precedingsibling 
{
public static void main(String[] args)
{
	System.out.println("Its preceding sibling program");
	 System.setProperty("webdriver.chrome.driver", "E:\\\\Tb_16\\\\103\\\\chromedriver.exe");
	 
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	 
	// driver.manage().window().maximize();
	 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ABC");
	 
	 driver.findElement(By.xpath("//div/child :: div/div/div/div//input[@name='lastname']")).sendKeys("EFG");
     
	 
	 driver.findElement(By.xpath("//div[@class='hidden_elem']/preceding-sibling:: div[@class='mbm _a4y']/div/div/input")).sendKeys("5555555555");
     
	 
	 driver.findElement(By.xpath("//div[@class='_58mq _5dbb']/preceding-sibling:: div[@class='mbm _br- _a4y']/div/div/input")).sendKeys("anhjhdjhd@12");

    WebElement dd= driver.findElement(By.xpath("//select[@name='birthday_month']/preceding-sibling:: select"));
    Select s=new Select(dd);
    s.selectByIndex(1);
    
    WebElement dd1= driver.findElement(By.xpath("//select[@name='birthday_year']/preceding-sibling:: select[@name='birthday_month']"));
    Select ss=new Select(dd1);
    //ss.selectByValue("May");
    ss.selectByIndex(5);
    
    WebElement dd2=driver.findElement(By.xpath("//select[@aria-label='Month']/following-sibling:: select[@name='birthday_year']"));
    Select sss=new Select(dd2);
    //sss.selectByIndex(1996);
    sss.selectByValue("1996");

}
}
