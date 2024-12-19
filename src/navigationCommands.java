import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\INCAPSULATE\\Desktop\\test\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String url="https://google.com";
		driver.navigate().to(url);
		
		
		WebElement w=driver.findElement(By.name("q"));
		
		if(w.isEnabled()==true) {
			w.sendKeys("selenium");
		}
		
		
				
	
	}

}
