import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

class Calender {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:/Users/ASUS/Downloads/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        String month = "5";
        String day = "17";
        String year ="2028";
        String[] dateWeWant = {month,day,year};
        driver.findElement(By.cssSelector(".react-date-picker__calendar-button")).click();
        driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText")).click();
        driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText")).click();
       // driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText")).click();
        driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
        int m = Integer.parseInt(month);
        driver.findElements(By.xpath("//div[@class='react-calendar__year-view__months']/button")).get(m-1).click();
        driver.findElement(By.xpath("//abbr[text()='"+day+"']")).click();
        List<WebElement> actualList = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
        for(int i =0; i<actualList.size();i++){
            System.out.println(actualList.get(i).getDomAttribute("value"));
            Assert.assertEquals(actualList.get(i).getDomAttribute("value"), dateWeWant[i]);
        }


    }
}
