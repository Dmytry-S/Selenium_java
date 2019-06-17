import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lottery {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dmytryi\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://unl.ua/uk/");
		driver.findElement(By.linkText("Результати")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div[2]/div[2]/div[1]/div[3]")).click();
	
	}

}
