import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWaitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\INCAPSULATE\\Desktop\\test\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		
		driver.get("https://google.com");
		
		driver.findElement(By.name("q")).sendKeys("selenium",Keys.ENTER);
		
		WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(15));
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//a//h3")));
		 
		WebElement firstLink=driver.findElement(By.xpath("//a//h3"));
	
		System.out.println(firstLink.getText());
	}

}
