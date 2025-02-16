import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class A4Windows {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/ASUS/Downloads/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Multiple Windows")).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Click Here")));
        driver.findElement(By.linkText("Click Here")).click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentID = it.next();
        String childID = it.next();
        driver.switchTo().window(childID);
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/h3")));
        System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
        driver.switchTo().window(parentID);
        System.out.println(driver.findElement(By.cssSelector("div h3")).getText());

        


        
    }
    
}
