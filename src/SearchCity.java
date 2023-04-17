import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchCity {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		driver =new ChromeDriver();
		
		driver.get("https://www.booking.com/");
		driver.manage().window().maximize();
	JavascriptExecutor js = (JavascriptExecutor) driver;  
	
		js.executeScript("window.scrollBy(0,400)");	
	Thread.sleep(2000);
		driver.findElement(By.xpath(" //*[@id=\":Ra9:\"]")).click();
	Keys Arrow=Keys.ARROW_DOWN;
	Keys Enter=Keys.ENTER;
		driver.findElement(By.xpath(" //*[@id=\":Ra9:\"]")).sendKeys("Amman"+Enter);		
//	driver.findElement(By.xpath(" //*[@id=\"indexsearch\"]/div[2]/div/div/form/div[1]/div[1]/div/div/div[2]/ul/li[3]/div/div/div/div[1]")).click();
	}

}
