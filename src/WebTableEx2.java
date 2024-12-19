import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\INCAPSULATE\\Desktop\\test\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']//tr"));
		
		for(WebElement r : rows)
		{
			List<WebElement> cells=r.findElements(By.tagName("td"));
			
			for(WebElement c : cells) {
				
				System.out.println(c.getText());
			}
		}
		
	
	}

}
