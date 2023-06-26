import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTests {
    private final By A_FROM = By.id("afrom");
    private final By B_FROM = By.id("bfrom");

    private final String URL = "http://qaguru.lv:8089/tickets/";
    private final String DEPARTURE_AIRPORT = "RIX";
    private final String ARRIVAL_AIRPORT = "MEL";

    @Test
    public void test(){
        //open and maximize browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //open homePage
        driver.get(URL);




    }
}
