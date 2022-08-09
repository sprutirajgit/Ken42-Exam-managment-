/**
 * 
 */
/**
 * @author ADMIN
 *
 */
package StudentStatus;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Students{
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		org.openqa.selenium.WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://sp-jain-playground-adminportal.ken42.com/app/admin-management/exam\\r\\n");
		driver.findElement(By.xpath("//span[.='Sign In']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[name()='svg' and @class='MuiSvgIcon-root jss175'")).click();
		Thread.sleep(1000);
        driver.findElement(By.xpath("/span[.='Exam Management'")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span.[='Student Status']")).click();
		
	}
}