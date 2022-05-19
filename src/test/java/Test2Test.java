import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2Test {

//    Подтвердите, что на странице по базовой ссылке последний пункт меню называется Submit new Language
//
//    Шаги:
//            1. Открыть вебсайт на базовой странице
//2. Считать название последнего пункта меню
//3. Подтвердить, что название последнего пункта меню соответствует ожидаемому
//4. Закрыть браузер

    @Test
    public void testMenuSubmitNewLanguage(){
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "src/main/resources/chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "Submit new Language";

        System.setProperty(chromeDriver, driverPath);

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement menuSubmitNewLanguage = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']" +
                        "/li/a[@href='/submitnewlanguage.html']")
        );
        menuSubmitNewLanguage.click();
        String actualResult = "Submit new Language";

        Assert.assertEquals(actualResult,expectedResult);

        driver.quit();
    }

}
