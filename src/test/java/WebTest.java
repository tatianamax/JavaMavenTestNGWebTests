import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Ignore;
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

        WebElement menuBrowseLanguages = driver.findElement(By.xpath("//body/div[@id='wrap']/div[@id='navigation']" + "/ul[@id='menu']/li/a[@href='/abc.html']"));
        menuBrowseLanguages.click();

        WebElement menuStart = driver.findElement(By.xpath("//body/div[@id='wrap']/div[@id='navigation']" + "/ul[@id='menu']/li/a[@href='/']"));
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

        WebElement menuSubmitNewLanguage = driver.findElement(By.xpath("//body/div[@id='wrap']" + "/div[@id='navigation']/ul[@id='menu']" + "/li/a[@href='/submitnewlanguage.html']"));
        menuSubmitNewLanguage.click();
        String actualResult = "Submit new Language";

        Assert.assertEquals(actualResult, expectedResult);

        driver.quit();
    }


    //    Подтвердите, что на странице по базовой ссылке последний пункт
    //    меню имеет подзаголовок Submit new Language
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

        WebElement menuSubmitNewLanguage = driver.findElement(By.xpath("//body/div[@id='wrap']" + "/div[@id='navigation']/ul[@id='menu']" + "/li/a[@href='/submitnewlanguage.html']"));
        menuSubmitNewLanguage.click();

        WebElement menuItemSubtitleSubmitNewLanguage = driver.findElement(By.xpath("//body/div[@id='wrap']" + "/div[@id='navigation']" + "/ul[@id='submenu']/li/a[@href='./submitnewlanguage.html']"));
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

        WebElement menuBrowseLanguages = driver.findElement(By.xpath("//body/div[@id='wrap']/div[@id='navigation']" + "/ul[@id='menu']/li/a[@href='/abc.html']"));

        menuBrowseLanguages.click();

        WebElement menuItemSubtitleBrowseLanguages = driver.findElement(By.xpath("//body/div[@id='wrap']" + "/div[@id='navigation']/ul[@id='submenu']" + "/li/a[@href='0.html']"));

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
    public void testConfirmTheNamesOfTheCreatorsOfTheSite() {
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

        WebElement OliverSchade = driver.findElement(By.xpath("//body/div[@id='wrap']/div[@id='main']/h3[1]"));
        String actualResult1 = OliverSchade.getText();

        WebElement GregorScheithauer = driver.findElement(By.xpath("//div[@id='main']/h3[2]"));
        String actualResult2 = GregorScheithauer.getText();

        WebElement StefanScheler = driver.findElement(By.xpath("//div[@id='main']/h3[3]"));
        String actualResult3 = StefanScheler.getText();

        Assert.assertEquals(actualResult1, expectedResult1);
        Assert.assertEquals(actualResult2, expectedResult2);
        Assert.assertEquals(actualResult3, expectedResult3);
        driver.quit();
    }

//    Придумайте и автоматизируйте свой собственный тест кейс
//    на сайте http://www.99-bottles-of-beer.net/
//
//    Шаги:
//            1. Открыть вебсайт на базовой странице
//2. Считать название второго подзаголовка первого пункта меню
//3. Подтвердить, что пользователь видит на странице заголовок «Lyrics of the song 99 Bottles of Beer»
//            4. Закрыть сайт


    @Test
    public void testValidateTitleOnPageSongLyrics() {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Applications/ChromeDriver/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "Lyrics of the song 99 Bottles of Beer";

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement menuStart = driver.findElement(By.xpath("//body/div[@id='wrap']/div[@id='navigation']" + "/ul[@id='menu']/li/a[@href='/']"));
        menuStart.click();

        WebElement SubmenuSongLyrics = driver.findElement(By.xpath("//div[@id='navigation']" + "/ul[@id='submenu']/li[2]/a"));
        SubmenuSongLyrics.click();

        WebElement h2 = driver.findElement(By.xpath("//div[@id='main']/h2"));
        String actualResult = h2.getText();

        Assert.assertEquals(actualResult, expectedResult);
        driver.quit();
    }

//    Подтвердите, что если на странице
//    по ссылке http://www.99-bottles-of-beer.net/submitnewlanguage.html ,
//    пользователь нажмет кнопку Submit Language,
//    не заполнив информацию в обязательных полях, будет показана ошибка
//
//    Error: Precondition failed - Incomplete Input.
//
//    Шаги:
//            1. Открыть вебсайт на странице
//2. Нажать на кнопку Submit Language
//3. Подтвердить, что на странице показана ошибка
//4. Подтвердить, что текст ошибки соответствует ожидаемому
//5. Закрыть браузер

    @Test
    public void testErrorOnPageSubmitNewLanguage() {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Applications/ChromeDriver/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "Error: Precondition failed - Incomplete Input.";

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        WebElement menuSubmitNewLanguage = driver.findElement(By.xpath("//body/div[@id='wrap']" + "/div[@id='navigation']/ul[@id='menu']" + "/li/a[@href='/submitnewlanguage.html']"));
        menuSubmitNewLanguage.click();

        WebElement Submitanguage = driver.findElement(By.xpath("//form/p/input[@name='submitlanguage']"));
        Submitanguage.click();

        WebElement Error = driver.findElement(By.xpath("//p"));
        String actualResult = Error.getText();

        Assert.assertEquals(actualResult, expectedResult);
        driver.quit();
    }

//    Если на странице по ссылке http://www.99-bottles-of-beer.net/submitnewlanguage.html ,
//    //  пользователь нажмет кнопку Submit Language,
//    //  не заполнив информацию в обязательных полях, будет показана ошибка с текстом
//
//    Error: Precondition failed - Incomplete Input.
//
//    Подтвертите, что в тексте ошибки слова Error, Precondition,
//    Incomplete и Input написаны с большой буквы, а слово failed  написано  с маленькой буквы.
//    Так же подтвердите, что в тексте ошибки содержатся знаки :, -  и .
//
//            Шаги:
//            1. Открыть вебсайт на странице
//2. Нажать на кнопку Submit Language
//3. Считать текст ошибки
//4. Подтвердить requirenments
//5. Закрыть браузер
    @Ignore
    @Test
    public void testValidateWord() {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Applications/ChromeDriver/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/submitnewlanguage.html";
        String expectedResult1 = "Error";
        String expectedResult2 = "Precondition";
        String expectedResult3 = "Incomplete";
        String expectedResult4 = "Input";
        String expectedResult5 = "failed";
        String expectedResult6 = ":";
        String expectedResult7 = "-";
        String expectedResult8 = ".";


        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        WebElement menuSubmitNewLanguage = driver.findElement(By.xpath("//body/div[@id='wrap']" + "/div[@id='navigation']/ul[@id='menu']" + "/li/a[@href='/submitnewlanguage.html']"));
        menuSubmitNewLanguage.click();

        WebElement Submitanguage = driver.findElement(By.xpath("//form/p/input[@name='submitlanguage']"));
        Submitanguage.click();

        WebElement Error = driver.findElement(By.xpath("//p"));

    }
//    Подтвердите, что на странице по ссылке
//    http://www.99-bottles-of-beer.net/submitnewlanguage.html в первом пункте списка пользователь видит текст
//
//    IMPORTANT: Take your time! The more carefully you fill out this form
//            (especially the language name and description),
//    the easier it will be for us and the faster your language will show up on this page.
//    We don't have the time to mess around with fixing your descriptions etc. Thanks for your understanding.
//
//    Шаги:
//            1. Открыть вебсайт на странице
//2. Считать текст
//3. Подтвердить, что текст соответствует ожидаемому
//4. Закрыть браузер

    @Test
    public void tetsValidateText(){
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Applications/ChromeDriver/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "IMPORTANT: Take your time! The more carefully you fill out this form " +
                "(especially the language name and description), " +
                "the easier it will be for us and the faster your language will show up on this page." +
                " We don't have the time to mess around with fixing your descriptions etc." +
                " Thanks for your understanding.";

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement menuSubmitNewLanguage = driver.findElement(By.xpath("//body/div[@id='wrap']"
                + "/div[@id='navigation']/ul[@id='menu']" + "/li/a[@href='/submitnewlanguage.html']"));
        menuSubmitNewLanguage.click();

        WebElement Submitanguage = driver.findElement(By.xpath("//form/p/input[@name='submitlanguage']"));
        Submitanguage.click();

        WebElement Text = driver.findElement(By.xpath("//div[@id='main']/ul/li[1]"));
        String actualResult = Text.getText();

        Assert.assertEquals(actualResult,expectedResult);

    }



}








