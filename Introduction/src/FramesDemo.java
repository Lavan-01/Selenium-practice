import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

class FramesDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/ASUS/Downloads/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        //to get the number of frames in the page as the frames should start with tagname iframe
        System.out.println(driver.findElements(By.tagName("iframe")).size());
        //as we have only 1 frame we can use index as 0 
        //driver.switchTo().frame(0);
        //there are 2 other ways:- 1. using the webelement and 2. using the frame id. Here, there is no frameid in html code.
        driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
        //now we need to create object for actions class as we need to drag and drop.
        Actions a = new Actions(driver);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        a.dragAndDrop(source, target).build().perform();
        //to move out of the frame 
        driver.switchTo().defaultContent();
    }
    
}
