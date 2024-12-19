import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testtextbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\INCAPSULATE\\Desktop\\test\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/text-box");
	WebElement Textbox1=	driver.findElement(By.id("userName"));
	Textbox1.sendKeys("Test123");
	WebElement Textbox2=driver.findElement(By.id("userEmail"));
	Textbox2.sendKeys("test@gmail.com");
	WebElement TextArea1=driver.findElement(By.id("currentAddress"));
	TextArea1.sendKeys("Hyderabad");
	WebElement TextArea2=driver.findElement(By.id("permanentAddress"));
	TextArea2.sendKeys("Hyderabad");
	//Textbox1.clear();
	driver.findElement(By.id("submit")).submit();
		
	}

}
