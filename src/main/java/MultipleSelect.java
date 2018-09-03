import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;

public class MultipleSelect {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sanne\\IdeaProjects\\MyFirstSeleniumProject\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseURL = "http://demo.guru99.com/test/newtours/register.php";

        driver.get(baseURL);

        Select drpCountry = new Select(driver.findElement(By.name("country")));
        drpCountry.selectByVisibleText("ANTARCTICA");

        //Selecting Items in a Multiple SELECT elements
        driver.get("http://jsbin.com/osebed/2");
        Select fruits = new Select(driver.findElement(By.id("fruits")));
        fruits.selectByVisibleText("Banana");
        fruits.selectByVisibleText("Apple");
        fruits.selectByIndex(2);
    }
}
