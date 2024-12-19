import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\INCAPSULATE\\Desktop\\test\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://demoqa.com/droppable");
	    
	    Actions a=new Actions(driver);
	    
	    WebElement from=driver.findElement(By.xpath("//div[@id='draggable']"));
	    
	    WebElement To=driver.findElement(By.xpath("//div[@id='droppable']"));
	    
	    a.dragAndDrop(from, To);
	    
	    a.build().perform();
	    
	    
	}

}
