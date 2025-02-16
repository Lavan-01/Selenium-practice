
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

class A3Wait {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:/Users/ASUS/Downloads/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("password")).sendKeys("learning");
        driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
        w.until(ExpectedConditions.elementToBeClickable(By.id("okayBtn")));
        driver.findElement(By.id("okayBtn")).click();
        WebElement dropdown = driver.findElement(By.cssSelector("select[data-style*='btn-info']"));
        Select dropdownElements = new Select(dropdown);
        dropdownElements.selectByIndex(0); 
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("signInBtn")).click();
        //Thread.sleep(5000);
        w.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
        List<WebElement> elements = driver.findElements(By.cssSelector("button[class='btn btn-info']"));
        for(int i=0;i<elements.size();i++){
            elements.get(i).click();

        }


    }
    
}
