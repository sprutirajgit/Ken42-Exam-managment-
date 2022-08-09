package GetStudent;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.Step;

public class GetStudentReport {
	 WebDriver driver;

  @BeforeClass
  public void setup()
  {
	  WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://workbench.developerforce.com/login.php?startUrl=%2FrestExplorer.php");
		driver.manage().window().maximize();
  }
  @Test(priority=1)
  public void LoginWorkBecnh() {
	  driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[2]/p[1]/select")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[2]/p[1]/select/option[2]")).click();
		driver.findElement(By.id("termsAccepted")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[5]/div[2]/input")).click();
  }
  @Test(priority=2)
  public void loginsalesforce() {
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/div[1]/div/input[1]")).sendKeys(" implementations@ken42.spj.playground");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[2]")).sendKeys("Test@123456");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[3]")).click();
  }
  @Test(priority=3)
  public void clearURI() {
	  WebElement l = driver.findElement(By.id("urlInput"));
		l.sendKeys("/services/data/v54.0");
		l.clear();
  }
  @Test(priority=4)
  public void EnterAPI() throws InterruptedException {
	  driver.findElement(By.xpath("/html/body/div[2]/form/input[2]")).sendKeys("/services/apexrest/StudentData/?nameOrRollNum=SPJ12345");
		driver.findElement(By.xpath("/html/body/div[2]/form/input[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div/ul/li[1]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/a[3]")).click();
  }
  @Test(priority=5)
  public void loginSalesforceValidate() throws InterruptedException {
	  Thread.sleep(2000);
		driver.get("https://test.salesforce.com/");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/div[1]/div/input[1]")).sendKeys(" implementations@ken42.spj.playground");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[1]")).sendKeys("Test@123456");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[2]")).click();
  }
  @Test(priority=6)
  public void  NavigateToObjectFindRecord() throws InterruptedException {
	  driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[1]/one-appnav/div/div/div/div/one-app-launcher-header/button/div")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[1]/div[1]/one-app-launcher-menu/div/one-app-launcher-search-bar/lightning-input/div/input")).sendKeys("Contacts");
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[1]/div[1]/one-app-launcher-menu/div/div[2]/one-app-launcher-menu-item/a/div/lightning-formatted-rich-text/span/p")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/div/div/div[1]/div[1]/div[1]/div/div/div/div/div/div[1]/h1/span[2]")).click();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[1]/div/div/div/div/div[1]/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/div/div/div[1]/div[2]/div[2]/force-list-view-manager-search-bar/div/lightning-input/div/input")).sendKeys("SPJ12345");
	    driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/div/div/div[1]/div[2]/div[2]/force-list-view-manager-search-bar/div/lightning-input/div/input")).click();
		
  }
  @Test(priority=7)
  @Step("Verification Response from WorkBecnh")
  @Description("the Response of the Student status was 1 record")
  public void VerfiyREsponse() throws InterruptedException {
		Reporter.log("the Response of the Student status was 2 record ",true);
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
         driver.findElement(By.className("MuiInputBase-input")).sendKeys("SPJ12345");
         driver.findElement(By.className("MuiIconButton-label")).click();
         Thread.sleep(2000);
         List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr"));
         System.out.println("The number of Record  is from Portal "+ row.size());
  }
  @AfterMethod
  public void afterMethod(ITestResult result) throws Exception {
	  log.info("If faail");
	  if(result.getStatus()==ITestResult.FAILURE) {
		  TakesScreenshot tc = (TakesScreenshot)driver;
		File src=  tc.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File(result.getName()+".png"));
	  }
  
  
  }
  
}
