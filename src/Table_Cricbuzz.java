import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Cricbuzz {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\WebBrowserDrivers\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		int score1 = 0;
		driver.manage().window().maximize();
		driver.get(
				"https://www.cricbuzz.com/live-cricket-scorecard/22504/ita-vs-ger-2nd-t20i-germany-v-italy-t20i-series-in-netherlands-2019");
		int count = driver.findElements(By.xpath(
				"//div[@id='innings_1'] //div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'][1] //div[@class='cb-col cb-col-8 text-right text-bold']"))
				.size();
		
		for (int i = 1; i < count; i++) {
			String score = driver.findElements(By.xpath(
					"//div[@id='innings_1'] //div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'][1] //div[@class='cb-col cb-col-8 text-right text-bold']"))
					.get(i).getText();
			score1 = score1 + Integer.parseInt(score);
		}
		int extra = Integer.parseInt(driver
				.findElement(By.xpath("(//div[@class='cb-col cb-col-60']) [1]/following-sibling::div[1]")).getText());
		int totalscore = extra + score1;
		//System.out.println(totalscore);
		int actualtotal = Integer.parseInt(driver
				.findElement(By.xpath("(//div[@class='cb-col cb-col-60']) [2]/following-sibling::div[1]")).getText());
		
		if (totalscore==actualtotal) {
			System.out.println("score matches");
		}
		
	}

}
