
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class GreenKart {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        //implicitly wait for 5 seconds
        //driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        

        //Thread.sleep(4000);
        String[] veggiesArray = {"Carrot","Tomato","Beans","Brinjal"};
        List veggiesList = Arrays.asList(veggiesArray);
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        int len = products.size();
        int len1 = veggiesList.size();
        int count =0;
        for(int i=0;i<len;i++){
            String[] namesArray=products.get(i).getText().split(" ");
            String name = namesArray[0];
            if(veggiesList.contains(name)){
                count++;
                //never depend on text to write the locator.
                driver.findElements(By.cssSelector("div[class='product-action'] button")).get(i).click();
                if(count ==len1){
                    break;
                }
            }

        }
        driver.findElement(By.xpath("//a/img[@alt='Cart']")).click();
        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.className("promoBtn")).click();
        //using explicit wait
        w.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoInfo")));
        System.out.println(driver.findElement(By.className("promoInfo")).getText());

        
    }
    
}
