
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class A2Form {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/ASUS/Downloads/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.findElement(By.name("name")).sendKeys("lavan");
        driver.findElement(By.name("email")).sendKeys("lavan@gmail.com");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("lavan");
        driver.findElement(By.id("exampleCheck1")).click();
        WebElement dropdownelement = driver.findElement(By.id("exampleFormControlSelect1"));
        Select dropdown = new Select(dropdownelement);
        dropdown.selectByIndex(0);
        //dropdown.selectByContainsVisibleText("Female");
        //dropdown.selectByValue(value);
        driver.findElement(By.id("inlineRadio2")).click();
        driver.findElement(By.name("bday")).sendKeys("11-08-2001");
        driver.findElement(By.cssSelector(".btn.btn-success")).click();
        System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());

    }
    
}
