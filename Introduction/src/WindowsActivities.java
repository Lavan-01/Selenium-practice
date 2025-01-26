
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class WindowsActivities{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/ASUS/Downloads/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        //to maximise the test webpage
        driver.manage().window().maximize();
        driver.get("http://google.com");
        //navigate to rahulshetty page with no syncronized wait(better to use get method)
        driver.navigate().to("https://rahulshettyacademy.com");
        //to go back to google.com page
        driver.navigate().back();
        //again goes back to rahulshetty page
        driver.navigate().forward();
    }

}