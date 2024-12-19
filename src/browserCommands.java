import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\INCAPSULATE\\Desktop\\test\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/text-box");
		String Title=driver.getTitle();
		System.out.println(Title);
		driver.findElement(By.xpath("//*[@id='item-1']")).click();
		String CurrentURL=driver.getCurrentUrl();
		System.out.println(CurrentURL);
		String str=driver.getPageSource();
		System.out.println(str);
		driver.close();

	}
	

}
