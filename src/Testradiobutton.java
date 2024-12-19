import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testradiobutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\INCAPSULATE\\Desktop\\test\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");
		
		WebElement wb1=driver.findElement(By.xpath("//*[@name='q']"));
		
		//String str=wb1.getAttribute("maxlength");
		
		//Dimension size=wb1.getSize();
		Point p=wb1.getLocation();
		
		
		
	
		int Xcoordinate=p.x;
		int Ycoordinate=p.y;
		
		System.out.println(Xcoordinate+" "+Ycoordinate);
		
			}

}
