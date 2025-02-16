import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


class TableScrolling {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/ASUS/Downloads/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //intializing the driver into javascript
        JavascriptExecutor js = (JavascriptExecutor)driver;
        //to scroll the window down
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);
        //to scroll the table with css selector placed inside it using DOM js
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
        String valueInString= driver.findElement(By.cssSelector(".totalAmount")).getText();
        int value=Integer.parseInt(valueInString.split(" ")[3].trim());
        //calculating the sum for the 4th column

        List<WebElement>  amounts= driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
        int sum=0;
        for(int i=0;i<amounts.size();i++){
            sum+=Integer.parseInt(amounts.get(i).getText());
        }
        System.out.println(sum);
        System.out.println(value);
        Assert.assertEquals(sum,value);
        
        
    }
    
}
