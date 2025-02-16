import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class A6 {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:/Users/ASUS/Downloads/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();
        String value = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
        WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
        Select s = new Select(dropdown);
        s.selectByContainsVisibleText(value);
        driver.findElement(By.id("name")).sendKeys(value);
        driver.findElement(By.id("alertbtn")).click();
        String validation=driver.switchTo().alert().getText();
        //System.out.println(validation);
        if(validation.split(" ")[1].split(",")[0].equals(value)){
            System.out.println("success");
        }
        

    }
    
}
