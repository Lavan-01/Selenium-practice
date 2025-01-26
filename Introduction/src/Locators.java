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
		//using ID locator
		driver.findElement(By.id("inputUsername")).sendKeys("LAVAN");
		//using name locator
		driver.findElement(By.name("inputPassword")).sendKeys("LavanAndhavarapu");
		//to click on signin button using classname locator
		driver.findElement(By.className("signInBtn")).click();
		//using css selector using tagname.classname
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		//using linktext locator 
		driver.findElement(By.linkText("Forgot your password?")).click();
		//script will pause for 1sec
		Thread.sleep(1000);
		//using xpath locator with //tagname[@attribute=value]
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
		//using css selector locator with //tagname[attribute='value']
		driver.findElement(By.cssSelector("input[placeholder = 'Email']")).sendKeys("random@gmail.com");
		//xpath locator using index 
		driver.findElement(By.xpath("//input[@type = 'text'][2]")).clear();
		//Css selector using index
		driver.findElement(By.cssSelector("input[type = 'text']:nth-child(3)")).sendKeys("random123@gmail.com");
		//xpath selector traversing from parent to child
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9999999999");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		//css selector traversing from parent to child
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		//creating xpath for parent and traverse the child through that
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000);
		//using css selector using tagname#id same as #id
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("LAVAN");
		//using regular expression with css selector
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		//using regular exp with xpath
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		driver.close();
		
				 

	}

}
 