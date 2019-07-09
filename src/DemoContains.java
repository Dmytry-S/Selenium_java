import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoContains {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dmytryi\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.engvid.com/");
		driver.findElement(By.cssSelector("input[value*='pass']")).click();
		driver.findElement(By.cssSelector("input[name*='pw']")).sendKeys("123");
		driver.findElement(By.xpath("//input[contains(@class,'in_button')]")).click();
		
	}

}
