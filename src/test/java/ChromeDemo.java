
 
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDemo {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

	        ChromeOptions chromeOptions = new ChromeOptions();

	        //chromeOptions.addArguments("headless");

	        chromeOptions.addArguments("--start-minimized");

	        chromeOptions.addArguments("--disable-notifications");


	       WebDriver driver = new ChromeDriver(chromeOptions);

	        driver.get("https://www.saucedemo.com/v1/");

	        System.out.println("Title of the page is "+driver.getTitle() );

	}

}		