import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC1101Test {
//    Подтвердите, что на странице по базовой ссылке в правом верхнем углу
//    пользователь видит заголовок 99 Bottles of Beer
//
//    Шаги:
//            1. Открыть вебсайт на базовой странице
//2. Считать заголовок в правом верхнем углу
//3. Подтвердить, что текст заголовка соответствует ожидаемому
//4. Закрыть браузер

    @Test
    public void testReadHeader(){
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "src/main/resources/chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "99 Bottles of Beer";

        System.setProperty(chromeDriver, driverPath);

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement h1 = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='header']/h1")
        );

        String actualResult = h1.getText();
        Assert.assertEquals(actualResult,expectedResult);
        driver.quit();
    }
}
