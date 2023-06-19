import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTests {
    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
        //driver.get("http://www.zerkalo.io/");
        driver.get("http://1a.lv");

    }
}
