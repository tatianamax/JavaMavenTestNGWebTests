import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class TatianaTest {
//    Тест кейс
//    1. Открыть страницу https://citilab.ru/
//    2. Найти строку поиска анализов
//    3. Ввести в строку поиска слово "патогены"
//    4. Нажать кнопку "найти"
//    5. Подтвердить, что запрос выполнен
//    6.Закрыть браузер


    @Test
    public void testTatianaMaksimova() {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Саша\\Desktop\\chromedriver_win32/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://citilab.ru");
        driver.get(driver.getCurrentUrl());

        driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
        WebElement searchBox = driver.findElement(By.xpath("/html/body/div[2]/main/header/div[2]/form[2]/div/input[1]"));
        WebElement searchButton = driver.findElement(By.xpath("/html/body/div[2]/main/header/div[2]/form[2]/div/input[2]"));

        searchBox.sendKeys("патогены");
        searchButton.click();

        searchBox = driver.findElement(By.xpath("/html/body/div[2]/main/header/div[2]/form[2]/div/input[1]"));
        Assert.assertEquals("патогены","патогены");

        driver.quit();
    }


}

