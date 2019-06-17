import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Demoff {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dmytryi\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://reibert.info/forums/");
		driver.findElement(By.linkText("Ёкипировка и снар€жение")).click();
		driver.findElement(By.xpath("//*[@id=\"forums\"]/li/ol/li[3]/div/div[1]/h3/a")).click();
		
	}

}
