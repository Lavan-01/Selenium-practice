import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Scope {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:/Users/ASUS/Downloads/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //to get the number of links in the page
        System.out.println(driver.findElements(By.tagName("a")).size());
        //number of links in the footer sections
        //limit the webdriver scope in this section
        WebElement footerDriver=driver.findElement(By.id("gf-BIG"));
        System.out.println(footerDriver.findElements(By.tagName("a")).size());
        //links count of first column in footer section
        WebElement coloumndriver=footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(coloumndriver.findElements(By.tagName("a")).size());
		//4- click on each link in the coloumn and check if the pages are opening-
        //clicking on all the links except the first one
		for(int i=1;i<coloumndriver.findElements(By.tagName("a")).size();i++)
		{
             //to open in new tab we need to hold the ctrl button and click the respective link
			String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000L);
		}
		Set<String> abc=driver.getWindowHandles();
		Iterator<String> it = abc.iterator(); 
		while(it.hasNext())
		{
		   driver.switchTo().window(it.next());
		   System.out.println(driver.getTitle());
		}
    }
    
}
