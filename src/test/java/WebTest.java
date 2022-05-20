import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTest {
//Тест кейс:
    //1. Открыть страницу http://www.99-bottles-of-beer.net/
    //2. Нажать пункт меню Browse Languages
    //3. Нажать пункт меню Start
    //4. Подтвердить, что пользователь видит заголовок "Welcome to 99 Bottles of Beer"
    //5. Закрыть браузер

    @Test
    public void testMenuStartTitle() throws InterruptedException {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Applications/ChromeDriver/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "Welcome to 99 Bottles of Beer";

//        System.setProperty(chromeDriver, driverPath);
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement menuBrowseLanguages = driver.findElement(By.xpath("//body/div[@id='wrap']/div[@id='navigation']"
                + "/ul[@id='menu']/li/a[@href='/abc.html']"));
        menuBrowseLanguages.click();

        WebElement menuStart = driver.findElement(By.xpath("//body/div[@id='wrap']/div[@id='navigation']" +
                "/ul[@id='menu']/li/a[@href='/']"));
        menuStart.click();

        WebElement h2 = driver.findElement(By.xpath("//body/div[@id='wrap']/div[@id='main']/h2"));
        String actualResult = h2.getText();
        //sleep(2000);

        Assert.assertEquals(actualResult, expectedResult);

        driver.quit();
    }

    //    Подтвердите, что на странице по базовой ссылке в правом верхнем углу
    //    пользователь видит заголовок 99 Bottles of Beer
    //
    //    Шаги:
    //            1. Открыть вебсайт на базовой странице
    //2. Считать заголовок в правом верхнем углу
    //3. Подтвердить, что текст заголовка соответствует ожидаемому
    //4. Закрыть браузер

    @Test
    public void testReadHeader() {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "src/main/resources/chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "99 Bottles of Beer";

        System.setProperty(chromeDriver, driverPath);

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement h1 = driver.findElement(By.xpath("//body/div[@id='wrap']/div[@id='header']/h1"));

        String actualResult = h1.getText();
        Assert.assertEquals(actualResult, expectedResult);
        driver.quit();
    }


    //    Подтвердите, что на странице по базовой ссылке последний пункт меню называется Submit new Language
    //
    //    Шаги:
    //            1. Открыть вебсайт на базовой странице
    //2. Считать название последнего пункта меню
    //3. Подтвердить, что название последнего пункта меню соответствует ожидаемому
    //4. Закрыть браузер

    @Test
    public void testMenuSubmitNewLanguage() {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "src/main/resources/chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "Submit new Language";

        System.setProperty(chromeDriver, driverPath);

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement menuSubmitNewLanguage = driver.findElement(By.xpath("//body/div[@id='wrap']" +
                "/div[@id='navigation']/ul[@id='menu']"
                + "/li/a[@href='/submitnewlanguage.html']"));
        menuSubmitNewLanguage.click();
        String actualResult = "Submit new Language";

        Assert.assertEquals(actualResult, expectedResult);

        driver.quit();
    }


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

        WebElement menuSubmitNewLanguage = driver.findElement(By.xpath("//body/div[@id='wrap']" +
                "/div[@id='navigation']/ul[@id='menu']"
                + "/li/a[@href='/submitnewlanguage.html']"));
        menuSubmitNewLanguage.click();

        WebElement menuItemSubtitleSubmitNewLanguage = driver.findElement(By.xpath("//body/div[@id='wrap']" +
                "/div[@id='navigation']"
                + "/ul[@id='submenu']/li/a[@href='./submitnewlanguage.html']"));
        menuItemSubtitleSubmitNewLanguage.click();

        String actualResult = "Submit new Language";

        Assert.assertEquals(actualResult, expectedResult);

        driver.quit();
    }
    //    Подтвердите, что на странице по ссылке
    //    http://www.99-bottles-of-beer.net/abc.html , первый пункт подменю называется 0-9
    //
    //    Шаги:
    //            1. Открыть вебсайт на странице
    //2. Считать название первого подзаголовка
    //3. Подтвердить, что название подменю соответствует ожидаемому
    //4. Закрыть браузер

    @Test
    public void testLastMenuItemSubtitleBrowseLanguages() {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Applications/ChromeDriver/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "0-9";

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement menuBrowseLanguages = driver.findElement(By.xpath("//body/div[@id='wrap']/div[@id='navigation']"
                + "/ul[@id='menu']/li/a[@href='/abc.html']"));

        menuBrowseLanguages.click();

        WebElement menuItemSubtitleBrowseLanguages = driver.findElement(By.xpath("//body/div[@id='wrap']" +
                "/div[@id='navigation']/ul[@id='submenu']"
                + "/li/a[@href='0.html']"));

        menuItemSubtitleBrowseLanguages.click();

        String actualResult = "0-9";

        Assert.assertEquals(actualResult, expectedResult);

        driver.quit();

    }

//    Подтвердите, что имена создателей сайта:
    //    Oliver Schade
//    Gregor Scheithauer
//    Stefan Scheler
//    Шаги:
//            1. Открыть вебсайт на базовой странице
//2. Считать название первого подзаголовка первого пункта меню
//3. Подтвердить, что имена создателей сайта:
//    Oliver Schade
//    Gregor Scheithauer
//    Stefan Scheler
//4.Подтвердить, что имена создателей соответстсвуют ожидаемому результату
//4. закрыть сайт
    @Test
    public void confirmTheNamesOfTheCreatorsOfTheSite() {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Applications/ChromeDriver/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult1 = "Oliver Schade";
        String expectedResult2 = "Gregor Scheithauer";
        String expectedResult3 = "Stefan Scheler";

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement menuStart = driver.findElement(By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']/li/a[@href='/']"));
        menuStart.click();

        WebElement menuSubMenuStartTeam = driver.findElement(By.xpath("//body/div[@id='wrap']/div[@id='navigation']" + "/ul[@id='submenu']/li/a[@href='team.html']"));

        menuSubMenuStartTeam.click();

        WebElement OliverSchade = driver.findElement(By.xpath("//body/div[@id='wrap']/div[@id='main']/h3"));
        String actualResult1 = OliverSchade.getText();

        WebElement GregorScheithauer = driver.findElement(By.xpath("//*[@id='main']/h3[2]"));
        String actualResult2 = GregorScheithauer.getText();

        WebElement StefanScheler = driver.findElement(By.xpath("//*[@id=\'main\']/h3[3]"));
        String actualResult3 = StefanScheler.getText();

        Assert.assertEquals(actualResult1, expectedResult1);
        Assert.assertEquals(actualResult2, expectedResult2);
        Assert.assertEquals(actualResult3, expectedResult3);
        driver.quit();
    }
}



