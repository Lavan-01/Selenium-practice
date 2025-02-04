
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class AutoSuggestiveDropdown{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/ASUS/Downloads/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        
        driver.findElement(By.id("autosuggest")).sendKeys("am");
        Thread.sleep(3000);
        
        //storing all the options after entering the text am in the dropdown using parent child traverse by css selector.
        List<WebElement> options =  driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        //looping the options and click the cambodia option.
        for(WebElement option : options){
            if(option.getText().equalsIgnoreCase("Cambodia")){
                option.click();
                break;

            }
        }
       // System.out.print(driver.findElement(By.id("autosuggest")).getText());
        
       



        
    }
}