import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesWithUtility {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\WebBrowserDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://pathsha.re/professional/signup");

		int k = framenumber(driver, By.xpath("//span[@id='recaptcha-anchor']/div[1]"));

		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(k));

		driver.findElement(By.xpath("//span[@id='recaptcha-anchor']/div[1]")).click();

		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		int k1 = framenumber(driver, By.xpath(".//*[@id='recaptcha-verify-button']"));
		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(k1));
		driver.findElement(By.xpath(".//*[@id='recaptcha-verify-button']")).click();

	}

	public static int framenumber(WebDriver driver, By by) {
		int size = driver.findElements(By.tagName("iframe")).size();
		int i;
		for (i=size-1; i >=0; i--) {
			driver.switchTo().defaultContent();
			driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(i));

			int presentno = driver.findElements(by).size();
			if (presentno > 0) {

				break;
			}

		}
		driver.switchTo().defaultContent();
		return i;

	}

}
