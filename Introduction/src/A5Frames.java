import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class A5Frames {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:/Users/ASUS/Downloads/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Nested Frames")).click();
        Thread.sleep(3000);
        driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-top']")));
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));
        System.out.println(driver.findElement(By.id("content")).getText());

    }
    
}
