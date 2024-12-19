import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import name.finsterwalder.fileutils.FileUtils;

public class testScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\INCAPSULATE\\Desktop\\test\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://google.com");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File Src=ts.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\INCAPSULATE\\Desktop\\screenshot\\test1.jpeg");
		
		FileUtils.copyFile(Src,dest);
		
		
		
	}

}
