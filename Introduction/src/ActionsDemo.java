import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

class ActionsDemo{
    public static void main(String[] args) { 
        System.setProperty("webdriver.chrome.driver","C:/Users/ASUS/Downloads/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
       // driver.findElement(By.cssSelector("input[data-action-type='DISMISS']")).click();
       //Actions is the class in selenium which helps us to mouseover,doubleclick,uppercase,etc....
        Actions a = new Actions(driver);
        WebElement signin = driver.findElement(By.cssSelector("#nav-link-accountList"));
        //mouseover the signin webelement and .build().perform() is to execute the action.
        a.moveToElement(signin).build().perform();
        //keysdown the shift button to convert lowercase letters to capital letters and doubleclick() to select the input field.
        a.moveToElement(driver.findElement(By.cssSelector("#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
    
    }
    
}
