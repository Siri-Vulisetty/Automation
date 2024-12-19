import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\INCAPSULATE\\Desktop\\test\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://demoqa.com/text-box");
	    
	    Actions a=new Actions(driver);
	    
	    WebElement w=driver.findElement(By.id("userName"));
	    
	    a.contextClick(w).build().perform();
	    
	}

}
