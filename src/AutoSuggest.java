import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dmytryi\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		WebElement window_from=driver.findElement(By.xpath("//div[@class=\"fsw_inputBox searchCity inactiveWidget \"] //input[@id='fromCity']"));
		window_from.sendKeys("mum");
		Thread.sleep(2000);
		driver.findElement(By.id("react-autowhatever-1-section-0-item-0")).click();
		// WebElement window_to=driver.findElement(By.id("toCity"));
		// window_to.clear();
		// window_to.sendKeys("");
		
		
	}

}
