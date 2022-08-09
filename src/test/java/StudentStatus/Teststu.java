package StudentStatus;



import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Teststu {

	@Test
	public void student() throws Throwable
	{
		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://sp-jain-playground-adminportal.ken42.com/app/admin-management/exam\\r\\n");
	
		driver.findElement(By.xpath("//span[.='Sign In']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[name()='svg'and@class='MuiSvgIcon-root jss104']")).click();
		Thread.sleep(1000);
        driver.findElement(By.xpath("//span[.='Exam Management']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[.='Student Status']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[.='Search']")).click();
        driver.findElement(By.className("MuiInputBase-input")).sendKeys("KEN4201");
        driver.findElement(By.className("MuiIconButton-label")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiIconButton-root'])[2]")).click();
       
        	
         driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiInput-input']")).sendKeys("Attendance Shorts");
        driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiIconButton-root'])[2]")).click();
        driver.findElement(By.xpath("//span[.='Filter']")).click();
        Thread.sleep(1000);
	
        
  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div[1]/div/div[2]/div")).click();
        driver.findElement(By.xpath("//li[.='Pune']")).click();
        
        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div[2]/div/div[2]/div")).click();
        driver.findElement(By.xpath("//li[.='BEC Term 1 Master']")).click();
        
        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div[4]/div/div[2]/div")).click();
        driver.findElement(By.xpath("//li[.='BECECO101-Macroeconomics 1']")).click();
        
        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div[5]/div/div[2]/div")).click();
        driver.findElement(By.xpath("//li[.='Not Eligible']")).click();
        
        
        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[3]/button[2]/span[1]/p")).click();
        driver.findElement(By.xpath("//span[.='All Data']")).click();
        
        driver.close();
	}
        

}
