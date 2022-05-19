import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test3Test {

//    Подтвердите, что на странице по базовой ссылке последний пункт меню имеет подзаголовок Submit new Language
//
//    Шаги:
//            1. Открыть вебсайт на базовой странице
//2. Нажать на пункт меню Submit new Language
//3. Считать название подзаголовка последнего пункта меню
//4. Подтвердить, что название подзаголовка последнего пункта меню соответствует ожидаемому
//5. Закрыть браузер

    @Test
    public void testLastMenuItemSubtitleSubmitNewLanguage() {
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

        WebElement menuItemSubtitleSubmitNewLanguage = driver.findElement(By.xpath("//body/div[@id='wrap']/div[@id='navigation']" +
                "/ul[@id='submenu']/li/a[@href='./submitnewlanguage.html']")
        );
        menuItemSubtitleSubmitNewLanguage.click();

        String actualResult = "Submit new Language";

        Assert.assertEquals(actualResult, expectedResult);

        driver.quit();
    }
}


