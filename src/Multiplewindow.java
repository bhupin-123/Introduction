import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\WebBrowserDrivers\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://support.google.com/mail/answer/56256?hl=en");
		String parent = driver.getWindowHandle();
		driver.findElement(By.className("action-button")).click();
		System.out.println(driver.getTitle());

		HashSet<String> ids = new HashSet<String>();
		ids = (HashSet<String>) driver.getWindowHandles();

		for (String child : ids) {
			//if (!parent.equals(child)) {
				driver.switchTo().window(child);
				System.out.println(driver.getTitle());
			//}

		}

//		Iterator<String> it=ids.iterator();
//		String parent= it.next();
//		String child= it.next();
//		driver.switchTo().window(child);
	//	System.out.println(driver.getTitle());

	}

}
