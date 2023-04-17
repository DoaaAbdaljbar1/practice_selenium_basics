import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreatAccountBooking {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\my chrome driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https:\\www.booking.com");

		driver.findElement(By.xpath(
				"//header[@class='bui-header bui-header--logo-large bui-u-hidden-print bui-header--rounded-tabs ']//div[5]//a[1]"))
				.click();

		driver.findElement(By.id("username")).sendKeys("doooaaahjklaa@gmail.com");
		
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/div[3]/button")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"new_password\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"new_password\"]")).sendKeys("ffffffff202");
		driver.findElement(By.xpath("//*[@id=\"confirmed_password\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"confirmed_password\"]")).sendKeys("ffffffff202");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/button")).click();








	}

}
