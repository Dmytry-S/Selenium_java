import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dmytryi\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.majortests.com/sat/problem-solving-test01");
		/* int count=driver.findElements(By.xpath("//div[@form=\"TEST\"] //input[@name='1']")).size();
		for (int i=0; i<count; i++) {
			driver.findElements(By.xpath("//div[@form=\"TEST\"] //input[@name='1']")).get(2).click();
		} */
		// driver.findElement(By.xpath("//div[@form=\"TEST\"] //input[@value='C']")).click();
		driver.findElement(By.xpath("//p[contains(text(),'A. 2/5')] //input[@value='C']")).click();
	}
}
