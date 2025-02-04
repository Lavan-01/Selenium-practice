import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


class A1CheckBoxesExercise {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/ASUS/Downloads/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
        Assert.assertEquals(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected(), true);
        System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
        driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
        System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
        // to print the number of checkboxes
        System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
        



    }
    
}
