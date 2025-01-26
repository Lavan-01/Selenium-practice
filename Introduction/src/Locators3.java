
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Locators3{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/ASUS/Downloads/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        //sibling-parent traverse using xpath
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //from parent to child traverse using siblings
        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
        //from child to parent traverse
        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[1]")).getText());
        

        
    }
}