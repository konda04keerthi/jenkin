import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HtmlUnitDriver driver = new HtmlUnitDriver();
		driver.get("https://www.amazon.in");
		System.out.println("Title is : "+driver.getTitle());
		System.out.println("hi");
		System.out.println("hii");

	}

}
