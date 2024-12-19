import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\INCAPSULATE\\Desktop\\test\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://demoqa.com/alerts");
	 
	    /*
	    driver.findElement(By.id("alertButton")).click();
	    
	    Thread.sleep(2000);
	    Alert a=driver.switchTo().alert();
	    
	    a.accept();
	    
	    
	    
	    driver.findElement(By.id("timerAlertButton")).click();
	    
	    WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(5));
	    wt.until(ExpectedConditions.alertIsPresent());
	    
	    System.out.println("Alert is accepted");
	    
	    
	    
	    driver.findElement(By.id("confirmButton")).click();
      
	    
	    Alert a=driver.switchTo().alert();
	    
	    a.dismiss();
	    
	    
	   WebElement wb=driver.findElement(By.id("confirmResult"));
	   
	   String str=wb.getText();
	   
	   System.out.println(str);	   
	   
	    */
	    
	    
	   WebElement button= driver.findElement(By.id("promtButton"));
	   
	   JavascriptExecutor js=(JavascriptExecutor)driver;
	   
	   js.executeScript("arguments[0].click()", button);
	   
	    
	    Thread.sleep(2000);
	    
	    Alert a=driver.switchTo().alert();
	    
	    a.sendKeys("Test");
	    
	    a.accept();
	    WebElement wb=driver.findElement(By.id("promptResult"));
	    
	    String str=wb.getText();
	    
	    System.out.println(str);
	    
	    
	    
	    
	    
	}

}
