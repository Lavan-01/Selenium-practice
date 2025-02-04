
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class DynamicDropdown{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/ASUS/Downloads/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        //using linktext
       // driver.findElement(By.linkText("Bengaluru (BLR)")).click();
       //using xpath
       //driver.findElement(By.xpath("//a[@value ='BLR']")).click();
       //using xpath with parent-child relationship
       driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click();
       //as it takes some time to open to dropdown automatically
       Thread.sleep(2000);
       //as we are using dynamic dropdown we cannot use same xpath for to dropdown as it matches with 2 elements so we need to wrap the xpath and give the index to choose the second xpath element from to dropdown.
       //driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
       //using xpath with parent-child relationship for second dropdown using syntax:- parentxpath childxpath
       driver.findElement(By.xpath("//div[@id = 'glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

       //driver.close();
       


    }
}