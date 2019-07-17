import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Calender {
	
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\WebBrowserDrivers\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		

	
	
		driver.findElement(By.cssSelector("span.lbl_input.latoBold.appendBottom10")).click();
		Thread.sleep(2000);
		int count =driver.findElements(By.cssSelector("div.dateInnerCell")).size();
		
		
		while (!driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div[1]/div[1]")).getText().contains("July")) {
			driver.findElement(By.cssSelector(".DayPicker-NavButton.DayPicker-NavButton--next")).click();
			Thread.sleep(2000);
			
		}
		
		
		
		for (int i=1;i<count;i++) {
		
			
			
			String text= driver.findElements(By.cssSelector("div.dateInnerCell")).get(i).getText();
			
			if (text.equals("24")) {
			
					driver.findElements(By.cssSelector("div.dateInnerCell")).get(i).click();
					break;
					
			}
				
			
		}
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		FileUtils.copyFile(src,new File("C:\\Users\\bsingh06\\Desktop\\first.png"));
		
	}

	private static Object driver() {
		// TODO Auto-generated method stub
		return null;
	}

}
