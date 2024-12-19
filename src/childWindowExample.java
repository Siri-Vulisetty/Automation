import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class childWindowExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\INCAPSULATE\\Desktop\\test\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/browser-windows");
		
		driver.findElement(By.id("windowButton")).click();
	
		String parent=driver.getWindowHandle();
		
		Set<String> s=driver.getWindowHandles();
		 
		Iterator<String> it=s.iterator();
		
		while(it.hasNext()) {
			String child=it.next();
			if(!parent.equals(child)) {
				driver.switchTo().window(child);
				WebElement wb=driver.findElement(By.id("sampleHeading"));
				System.out.println(wb.getText());
				
			}
			
		}
	Thread.sleep(1500);
		driver.quit();
	}

}
