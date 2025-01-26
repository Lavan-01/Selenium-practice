
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class StaticDropDown{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/ASUS/Downloads/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        //dropdown with select tag 
        WebElement dropdowneElement = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(dropdowneElement);
        //selecting by index
        dropdown.selectByIndex(3);
        //to display the text of the selected option
        System.out.println(dropdown.getFirstSelectedOption().getText());
        //selecting using text of the dropdown element
        dropdown.selectByContainsVisibleText("AED");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        //selecting using the value present in the line of the code
        dropdown.selectByValue("INR");
        System.out.println(dropdown.getFirstSelectedOption().getText());


        
    }
}