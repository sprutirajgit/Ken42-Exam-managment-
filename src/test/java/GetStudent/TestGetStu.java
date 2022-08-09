package GetStudent;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestGetStu {
	@Test
	public void GetStudentAPi() throws Throwable
	{
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		driver.get("https://workbench.developerforce.com/login.php?startUrl=%2FrestExplorer.php");
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[2]/p[1]/select")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[2]/p[1]/select/option[2]")).click();
		driver.findElement(By.id("termsAccepted")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[5]/div[2]/input")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/div[1]/div/input[1]")).sendKeys(" implementations@ken42.spj.playground");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[2]")).sendKeys("Test@123456");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[3]")).click();
		
		WebElement l = driver.findElement(By.id("urlInput"));
		l.sendKeys("/services/data/v54.0");
		l.clear();
		
	    driver.findElement(By.xpath("/html/body/div[2]/form/input[2]")).sendKeys("/services/apexrest/StudentData/?campus=Pune&course=BBAQTT310-Decision+Making&eligibilityStatus=Not+eligible");
		driver.findElement(By.xpath("/html/body/div[2]/form/input[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div/ul/li[1]")).click();
		//driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div/ul/li[2]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/a[3]")).click();
		
		
		Thread.sleep(2000);
		driver.get("https://test.salesforce.com/");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/div[1]/div/input[1]")).sendKeys(" implementations@ken42.spj.playground");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[1]")).sendKeys("Test@123456");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[2]")).click();
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[1]/one-appnav/div/div/div/div/one-app-launcher-header/button/div")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[1]/div[1]/one-app-launcher-menu/div/one-app-launcher-search-bar/lightning-input/div/input")).sendKeys("Exam Connection");
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[1]/div[1]/one-app-launcher-menu/div/div[2]/one-app-launcher-menu-item/a/div/lightning-formatted-rich-text/span/p")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/div/div/div[1]/div[1]/div[1]/div/div/div/div/div/div[1]/h1/span[2]")).click();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[1]/div/div/div/div/div[1]/div/ul/li[2]/a")).click();
 }
}

