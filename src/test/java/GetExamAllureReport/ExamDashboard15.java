package GetExamAllureReport;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import GetExam.GetStudentReportExam;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExamDashboard15 {
	 WebDriver driver;
	 Logger log = Logger.getLogger(GetStudentReportExam.class);
	 
	 @BeforeClass
	  public void setup()
	  {
		  WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		    log.info("Launching chrome browser");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			driver.get("https://sp-jain-playground-adminportal.ken42.com/app/admin-management/exam\\r\\n");
			log.info("Launching the FrontEnd portal");
			driver.manage().window().maximize();
			log.info("Maximize the Browser");
	  }
	 @Test(priority=1)
	 public void portalVerify() throws InterruptedException {
		 driver.findElement(By.xpath("//span[.='Sign In']")).click();
			log.info("Sign in the portal");
         Thread.sleep(2000);
     	driver.findElement(By.xpath("//*[name()='svg'and@class='MuiSvgIcon-root jss104']")).click();
     	log.info("open the Drawer on portal");
     	Thread.sleep(1000);
         driver.findElement(By.xpath("//span[.='Exam Management']")).click();
         log.info("Select Exam Managemnet Moudle");
         Thread.sleep(1000);
         driver.findElement(By.xpath("//span[.='Dashboard']")).click();
         log.info("Select DashBoard");
        Thread.sleep(2000);
       driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div/div[3]/div/div[1]/div[2]/div/div/div[2]/div")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[2]")).click();
        Thread.sleep(2000);
        log.info("Select the Filter For upcomming exam");
         driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div/div[3]/div/div[1]/div[3]/button")).click();
         Thread.sleep(2000);
         List<WebElement> row = driver.findElements(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div/div[3]/div/div[2]/div/table/tbody/tr"));
        System.out.println("The number of Record  is from Portal on 15 days Filletr "+ row.size());
	 }
	 @Test(priority=2)
	 public void loginWorkbench() {
		 driver.get("https://workbench.developerforce.com/login.php?startUrl=%2FrestExplorer.php");
			log.info("Launching the WorkBench URL");
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[2]/p[1]/select")).click();
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[2]/p[1]/select/option[2]")).click();
			driver.findElement(By.id("termsAccepted")).click();
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[5]/div[2]/input")).click();
			log.info("Login to the WorkBench");
	 }
	 @Test(priority=3)
	 public void loginsalesforce() {
		 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/div[1]/div/input[1]")).sendKeys(" implementations@ken42.spj.playground");
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[2]")).sendKeys("Test@123456");
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[3]")).click();
			log.info("Connect Workbench & salesforce integrate");
	 }
	 @Test(priority=4)
	 public void ApiCheckProcess() throws InterruptedException {
		 WebElement l = driver.findElement(By.id("urlInput"));
			l.sendKeys("/services/data/v54.0");
			l.clear();
			Thread.sleep(2000);
			log.info("Clear the Extra API On the URI ");
			 driver.findElement(By.xpath("/html/body/div[2]/form/input[2]")).sendKeys("/services/apexrest/ExamData/?completedIn=15");
			  log.info("on the api Testing Here We fillter the Exam Complete the 15 days");
				driver.findElement(By.xpath("/html/body/div[2]/form/input[3]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"responseList\"]/li[3]")).click();
				Thread.sleep(10000);
				driver.findElement(By.xpath("//*[@id=\"codeViewPortToggler\"]")).click();
				log.info("To show the Response came from Salesforce & the record count 11");
				log.info("The 15 days exam record count on front end  = the record which was get on reponse On api");
	 }
	 @AfterMethod
	 public void afterMethods(ITestResult result) throws Exception {
		  if(result.getStatus()==ITestResult.FAILURE) {
			  TakesScreenshot tc = (TakesScreenshot)driver;
			File src=  tc.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File(result.getName()+".png"));
		  }
			  
	  }
}
