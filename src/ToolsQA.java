import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/text-box");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Ravi");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("test@gmail.com");
		driver.findElement(By.cssSelector("#currentAddress")).sendKeys("test");
		driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("hyderabad");
		driver.findElement(By.xpath("//button[@id='submit']")).submit();
		

	}

}
