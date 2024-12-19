import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\INCAPSULATE\\Desktop\\test\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://demoqa.com/frames");
	    
	    driver.switchTo().frame("frame1");
	   
	    String str=driver.findElement(By.id("sampleHeading")).getText();
	    
	    System.out.println(str);
	    
	    driver.switchTo().defaultContent();
	    
	    //System.out.println(driver.getCurrentUrl());
	    //System.out.println(driver.getTitle());
	    
	    String s=driver.findElement(By.xpath("//div[@class='main-header']")).getText();
	    
	    System.out.println(s);

	    }
	    
	    
	    
	 
	}


