import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\WebBrowserDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.findElement(By.id("fromPlaceName")).click();
		driver.findElement(By.id("fromPlaceName")).sendKeys("BENG");
		Thread.sleep(2000);
//		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
//		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
//		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
		System.out.println(driver.findElement(By.id("fromPlaceName")).getText());
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		String script= "return document.getElementById(\"fromPlaceName\").value;";
		String text=(String) js.executeScript(script);
		
		for (;!text.equals("BENGALURU INTERNATION AIRPORT");) {
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
			text=(String) js.executeScript(script);	
//			if (i>10) {
//				break;
//			}
			
			
		}
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ENTER);

		
		

	}

}
