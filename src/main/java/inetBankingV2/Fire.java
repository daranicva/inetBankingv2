package inetBankingV2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fire {

	public static void main(String[] args) {
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\Siva Shankar Drarni\\Downloads\\geckodriver-v0.29.1-win32//geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
			driver.get("https://www.amazon.in/");

	}

}
