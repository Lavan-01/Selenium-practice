import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/ASUS/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		driver.close();
		//driver.quit();
		
		
		
		//For firefox
		//System.setProperty("webdriver.gecko.driver","C:/Users/ASUS/Downloads/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		//for Microsoft edge
		//System.setProperty("webdriver.edge.driver","C:/Users/ASUS/Downloads/msedgedriver.exe");
		//WebDriver driver1 = new EdgeDriver();
		

	}

}
