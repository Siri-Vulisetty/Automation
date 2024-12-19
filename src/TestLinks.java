import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\INCAPSULATE\\Desktop\\test\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/radio-button");
		
		//driver.findElement(By.id("simpleLink")).click();
		
		WebElement radiobutton=driver.findElement(By.xpath("//*[@id='yesRadio']"));
		
		Boolean b=radiobutton.isSelected();
		
		System.out.println(b);
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		if(b==false) 
			//radiobutton.click();	
			js.executeScript("arguments[0].click();", radiobutton);
			
		
		
		Boolean c=radiobutton.isSelected();
System.out.println(c);

WebElement w=driver.findElement(By.xpath("//*[@id='noRadio']"));
System.out.println(w.isEnabled());
//System.out.println(radiobutton.isDisplayed());
	}

}
