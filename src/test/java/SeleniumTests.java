import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SeleniumTests {
    private final By A_FROM = By.id("afrom");
    private final By B_FROM = By.id("bfrom");
    private final By GO_GO_GO_BTN = By.xpath(".//span[@class='gogogo']");
    private final By NAME_INPUT = By.id("name");

    private final By SELECTED_AIRPORT = By.xpath(".//span[@class = 'bTxt']");
    private final String NAME = "Alex";

    private final String URL = "http://qaguru.lv:8089/tickets/";
    private final String DEPARTURE_AIRPORT = "RIX";
    private final String ARRIVAL_AIRPORT = "MEL";


    @Test
    public void test() {
        //open and maximize browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //open homePage
        driver.get(URL);

        //select departure airport
        WebElement fromDropDown = driver.findElement(A_FROM);
        Select departureSelect = new Select(fromDropDown);
        departureSelect.selectByValue(DEPARTURE_AIRPORT);

        //select arrival airport
        WebElement arrivalDropDown = driver.findElement(B_FROM);
        Select arrivalSelect = new Select(arrivalDropDown);
        arrivalSelect.selectByValue(ARRIVAL_AIRPORT);

        //find and click on GO
        driver.findElement(GO_GO_GO_BTN).click();

        //check is selected airport appears
         List<WebElement> selectedAirport = driver.findElements(SELECTED_AIRPORT);

        //fill in passenger personal info
        WebElement userNameInputField = driver.findElement(NAME_INPUT);
        userNameInputField.clear();
        userNameInputField.sendKeys(NAME);

    }
}
