import java.util.ArrayList;
import java.util.HashSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow2 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver",
				"C:\\WebBrowserDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerdriver= driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		WebElement columndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		for (int i=1;i<columndriver.findElements(By.tagName("a")).size();i++) {
			
			String controlClick=Keys.chord(Keys.ENTER,Keys.CONTROL);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(controlClick);
		}
		
		//String parent = driver.getWindowHandle();
		//driver.findElement(By.className("action-button")).click();
		//System.out.println(driver.getTitle());

		ArrayList<String> ids = new ArrayList<String>();
		ids = (ArrayList<String>) driver.getWindowHandles();
		
		ArrayList<String> a=new ArrayList<String>(ids);
		
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
