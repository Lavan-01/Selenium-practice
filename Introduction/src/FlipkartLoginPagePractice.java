import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLoginPagePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/ASUS/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/account/login?ret=/");
		driver.findElement(By.className("r4vIwl")).sendKeys("6303513162");
		driver.findElement(By.cssSelector("button.QqFHMw")).click();
		
		
		

	}

}
