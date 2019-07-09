import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dmytryi\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://members.learntotradethemarket.com/course/");
		// driver.findElement(By.xpath("//*[@id=\"user_login\"]")).click();
		driver.findElement(By.xpath("//li[@id='am4login-8']//input[@id='user_login']")).sendKeys("Ars");
		driver.findElement(By.xpath("//li[@id='am4login-8']//input[@id='user_password']")).sendKeys("123456");
		driver.findElement(By.xpath("//li[@id='am4login-8']//input[@id='wp-submit']")).click();
		// driver.findElement(By.name("wp-submit")).click();
		System.out.println(driver.findElement(By.xpath("//li[contains(text(),'The user name or password is incorrect')]")).getText());
		

	}

}
