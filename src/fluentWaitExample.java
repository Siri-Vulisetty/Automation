import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluentWaitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\INCAPSULATE\\Desktop\\test\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		
		driver.get("https://google.com");
	
		Wait<WebDriver> wt=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
	
		
		WebElement wb=(WebElement)wt.until(new Function<WebDriver,WebElement>()
				{
			public WebElement apply(WebDriver driver) {
				
				WebElement link=driver.findElement(By.linkText("Gmail"));
				
				if(link.isEnabled()) {
					System.out.println("Element is found");
				}
				return link;
			}
				}
				);
		wb.click();
		
		
		
		
		
		
	}

}
