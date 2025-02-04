
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

class UpdatedDropdown{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/ASUS/Downloads/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        //using assertFalse method to proceed the execution if the inner condition is false and throws error when inner condition is true
        Assert.assertFalse(driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).isSelected());
        //to verify whether the checkbox is selected or not using xpath regular expression
        //System.out.println(driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).isSelected());
        driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).isSelected());
       // System.out.println(driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).isSelected());
       // System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
        System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
        if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("1"))
        {
        System.out.println("its enabled");
        Assert.assertTrue(true);
        }
        else
        {
        Assert.assertTrue(false);
        }

        //to get the count of checkboxes present in the screen
        System.out.println(driver.findElements(By.cssSelector("*[type='checkbox']")).size());
        driver.findElement(By.id("divpaxinfo")).click();
        //as the UI takes some time to open the dropdown
        Thread.sleep(2000);
        //for selecting 5 adults from the dropdown
        for(int i=0;i<4;i++){
        driver.findElement(By.id("hrefIncAdt")).click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        //using assertEquals method to validate the actual and expected results 
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult");
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        //driver.close();
        

        
    }
}