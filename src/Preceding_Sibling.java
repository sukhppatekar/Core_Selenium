import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Preceding_Sibling
{
 public static void main(String[] args)
 {
 
	 System.out.println("Its preceding sibling program");
	 System.setProperty("webdriver.chrome.driver", "E:\\\\Tb_16\\\\103\\\\chromedriver.exe");
	 
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://demo.guru99.com/test/newtours/register.php");
	 
	 driver.manage().window().maximize();
	 
	// driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]")).click();
	 
	 driver.findElement(By.xpath("//td/following-sibling :: td/input[@name='address1']")).sendKeys("karveNagar");
	 
	 driver.findElement(By.xpath("//tr/preceding-sibling:: tr/td/input[@name='city']")).sendKeys("Pune");
	 
	 driver.findElement(By.xpath("//tr/preceding-sibling:: tr/td/input[@name='state']")).sendKeys("Maharashtra");
	 
	WebElement dd= driver.findElement(By.xpath("//tr/preceding-sibling:: tr/td/select[@name='country']"));
    Select s=new Select(dd);
    s.selectByValue("INDIA");
    
    
 
 }
}
