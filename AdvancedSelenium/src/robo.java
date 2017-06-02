
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class robo {

    public static void main(String[] args) {

            try {
                    Robot robot = new Robot();

       // Simulate a mouse click
                    System.setProperty("webdriver.chrome.driver","D:\\SeleniumDrivers\\chromedriver.exe");
            		WebDriver driver2 = new ChromeDriver();
            		driver2.get("http://www.facebook.com");
            		
                    robot.mousePress(InputEvent.BUTTON1_MASK);
                    robot.mouseRelease(InputEvent.BUTTON1_MASK);

      // ctrl + T & ctrl TAB  

                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_T);

                // CTRL+T is now pressed 

                robot.keyRelease(KeyEvent.VK_T);
                robot.keyRelease(KeyEvent.VK_CONTROL);

            } catch (AWTException e) {
                    e.printStackTrace();
            }
        }
}