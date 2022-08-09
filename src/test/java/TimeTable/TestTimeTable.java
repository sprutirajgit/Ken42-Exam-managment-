package TimeTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestTimeTable {
	@Test
	public void TimeTable() throws Throwable
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
    driver.findElement(By.xpath("//span[.='Timetable & Seating plan']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//span[.='Generate']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//span[.='Filter']")).click();
    
    driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div[1]/div/div[2]/div")).click();
    driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div[2]/div/div[2]/div")).click();
    

 }
}
