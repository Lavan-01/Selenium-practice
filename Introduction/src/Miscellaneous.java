import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Miscellaneous {
    public static void main(String[] args) throws IOException{
        System.setProperty("webdriver.chrome.driver","C:/Users/ASUS/Downloads/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        //maximize the webpage 
        driver.manage().window().maximize();
        //to delete all the cookies
        driver.manage().deleteAllCookies();
        //delete one cookie when we know the name of the cookie
        driver.manage().deleteCookieNamed("sessionKey");
        driver.get("https://www.google.com/");
        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\ASUS\\OneDrive\\Desktop\\lllavan\\ss.png"));



    }
    
}
