import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/ASUS/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//implicit wait - 5 seconds time-out
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("LAVAN");
		driver.findElement(By.name("inputPassword")).sendKeys("LavanAndhavarapu");
		//to click on signin button
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		//script will pause for 1sec
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
		driver.findElement(By.cssSelector("input[placeholder = 'Email']")).sendKeys("random@gmail.com");
		driver.findElement(By.xpath("//input[@type = 'text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type = 'text']:nth-child(3)")).sendKeys("random123@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9999999999");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		//creating xpath for parent and traverse the child through that
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("LAVAN");
		//using regular expression with css selector
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		//using regular exp with xpath
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
				 

	}

}
 