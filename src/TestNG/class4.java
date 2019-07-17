package TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class class4 {

	WebDriver driver;

	@Test
	public void globalData() throws IOException {

		Properties prop = new Properties();
		FileInputStream fil = new FileInputStream(
				"C:\\Users\\bsingh06\\eclipse-workspaceNew\\Introduction\\src\\TestNG\\DataDriver.properties");
		prop.load(fil);

		if (prop.getProperty("browser").contains("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\WebBrowserDrivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			System.setProperty("webdriver.firefox.driver",
					"C:\\WebBrowserDrivers\\firefoxdriver_win32\\firefoxdriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get(prop.getProperty("URL"));

	}

}
