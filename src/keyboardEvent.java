import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardEvent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\INCAPSULATE\\Desktop\\test\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://demoqa.com/text-box");
	    
	    Actions a=new Actions(driver);
	    
	    driver.findElement(By.id("userName")).sendKeys("testname");
	    
	    driver.findElement(By.id("userEmail")).sendKeys("abc@gmail.com");
	    
	    driver.findElement(By.id("currentAddress")).sendKeys("Hyderabad");
	    
	    a.keyDown(Keys.CONTROL);
	    
	    a.sendKeys("a");
	    
	    a.keyUp(Keys.CONTROL);
	    
	    a.build().perform();
	    
	    
        a.keyDown(Keys.CONTROL);
	    
	    a.sendKeys("c");
	    
	    a.keyUp(Keys.CONTROL);
	    
	    a.build().perform();
	    
	    a.sendKeys(Keys.TAB);
	    
	    a.build().perform();
	    
        a.keyDown(Keys.CONTROL);
	    
	    a.sendKeys("v");
	    
	    a.keyUp(Keys.CONTROL);
	    
	    a.build().perform();
	    
	    

	}

}
