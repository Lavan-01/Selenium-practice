
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TomatoSignInPage{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/ASUS/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://tomato-virid.vercel.app/");
        //driver.findElement(By.xpath("//button")).click();
        driver.findElement(By.cssSelector("button")).click();
        Thread.sleep(2000);
        driver.close();

    }
}