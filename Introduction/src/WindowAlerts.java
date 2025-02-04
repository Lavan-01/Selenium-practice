import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class WindowAlerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/ASUS/Downloads/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("name")).sendKeys("lavan");
        driver.findElement(By.id("alertbtn")).click();
        //we are switching from driver to alert and getting the text from the alert.
        System.out.println(driver.switchTo().alert().getText());
        //clicking OK on the alert.
        driver.switchTo().alert().accept();
        driver.findElement(By.id("name")).sendKeys("lavan");
        driver.findElement(By.id("confirmbtn")).click();
        Thread.sleep(2000);
        //to click on cancel or no button on the alert.
        driver.switchTo().alert().dismiss();


    }
    
}
