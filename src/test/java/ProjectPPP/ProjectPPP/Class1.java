package ProjectPPP.ProjectPPP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohan\\Downloads\\selenium things\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.apple.com/in/");
		driver.findElement(By.xpath("//section[2]/div[1]/div/div/div[1]/div/a[2]")).click();
	}

}
