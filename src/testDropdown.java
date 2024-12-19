import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\INCAPSULATE\\Desktop\\test\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/INCAPSULATE/Desktop/radio.html");
		
		Select s=new Select(driver.findElement(By.id("cars")));
		
				System.out.println(s.isMultiple());
				
				s.selectByIndex(1);
				s.selectByValue("volvo1");
				//s.deselectByVisibleText("Saab");
				//s.deselectByIndex(1);
				s.deselectByValue("volvo1");
	}

}
