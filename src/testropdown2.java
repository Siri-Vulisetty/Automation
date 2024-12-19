import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testropdown2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\INCAPSULATE\\Desktop\\test\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		Select s=new Select(driver.findElement(By.xpath("//option[@value='AFG']//parent::select")));
		
		List<WebElement> op=s.getOptions();
		
		for(int i=0;i<op.size();i++) {
			String str=op.get(i).getText();
		System.out.println(str);
		}
		
	}

}
