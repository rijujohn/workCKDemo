import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class closeAll {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	String os = System.getProperty("os.name");
	if (os.contains("Windows"))
	{
		Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");
	//	System.out.println(Runtime.getRuntime().availableProcessors());
	//	System.out.println(Runtime.getRuntime().freeMemory());
	}
	
	}

}
