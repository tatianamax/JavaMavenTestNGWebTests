import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test4Test {
//    Подтвердите, что на странице по ссылке
//    http://www.99-bottles-of-beer.net/abc.html , первый пункт подменю называется 0-9
//
//    Шаги:
//            1. Открыть вебсайт на странице
//2. Считать название первого подзаголовка
//3. Подтвердить, что название подменю соответствует ожидаемому
//4. Закрыть браузер

    @Test
    public void testLastMenuItemSubtitleBrowseLanguages(){
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Applications/ChromeDriver/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "0-9";

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement menuBrowseLanguages = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']" +
                                "/ul[@id='menu']/li/a[@href='/abc.html']"));

        menuBrowseLanguages.click();

         WebElement menuItemSubtitleBrowseLanguages = driver.findElement(
                 By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='submenu']" +
                         "/li/a[@href='0.html']"));

        menuItemSubtitleBrowseLanguages.click();

        String actualResult = "0-9";

        Assert.assertEquals(actualResult,expectedResult);

        driver.quit();

    }

}
