package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.gecko.driver", "/Users/sampathpritila/Downloads/geckodriver");
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://www.google.com/");
		
		//chromedriver
		
		System.setProperty("webdriver.chrome.driver", "/Users/sampathpritila/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://uk.linkedin.com/");
		String title = driver.getTitle();
		
		System.out.println(title);
		
		if(title.equals("LinkedIn: Log In or Sign Up")) {
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}
		

	}

}
