import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;

public class DemoCheckbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dmytryi\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.alfaplan.com.ua/");
		Select s = new Select(driver.findElement(By.id("property_id_136")));
		s.selectByValue("72");
		Select ss = new Select(driver.findElement(By.xpath("//*[@id=\"property_id_143\"]")));
		ss.selectByVisibleText("1");
		

	}

}
