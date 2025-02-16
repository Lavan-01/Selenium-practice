import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class ParentAndChildWindow {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/ASUS/Downloads/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
        driver.findElement(By.cssSelector(".blinkingText")).click();
        //storing all the window ids in set through getWindowHandles() method
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentID = it.next();
        String childID = it.next();
        //moving the driver to child page 
        driver.switchTo().window(childID); 
        String username=driver.findElement(By.cssSelector(".im-para.red")).getText().split(" ")[4];
        //again moving to parent page
        driver.switchTo().window(parentID);
        driver.findElement(By.id("username")).sendKeys(username);      
    }
    
}
