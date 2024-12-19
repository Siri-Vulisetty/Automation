import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://google.com");
	    
	    Actions a=new Actions(driver);
	    
	    WebElement wb=driver.findElement(By.linkText("Gmail"));
	    
	    a.doubleClick(wb);
	    
	    a.build().perform();
	    
	    WebElement w=driver.findElement(By.xpath("//a[text()='Sign in']"));
	    
	    a.clickAndHold(w);
	    
	    
	    a.build().perform();
	    
	    
	    
	    
	    

	}

}
