import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Edge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  EdgeOptions edgeOptions = new EdgeOptions();

	        //chromeOptions.addArguments("headless");

	        edgeOptions.addArguments("--start-minimized");

	        edgeOptions.addArguments("--disable-notifications");


	       WebDriver driver = new EdgeDriver(edgeOptions);

	        driver.get("https://capgemini.tekstac.com/login/index.php");

	        System.out.println("Title of the page is "+driver.getTitle() );

	}

}
