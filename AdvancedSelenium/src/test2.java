import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver2 = new ChromeDriver();
		driver2.get("http://www.facebook.com");
		
		  Actions act = new Actions(driver2);
		  act.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform();
	}

}
