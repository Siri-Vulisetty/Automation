import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchChrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\INCAPSULATE\\Desktop\\test\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String url="https://www.google.com";
		driver.get(url);
		
		String pageTitle=driver.getTitle();
		
		System.out.println(pageTitle);
		
		int n=pageTitle.length();
		
		System.out.println(n);
		
		
		
		/*
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.toolsqa.com");
	 driver.close();

		driver.quit();
		*/

	}

}
