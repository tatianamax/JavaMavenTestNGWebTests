import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TmTest {

    @Test
    public void testMusicSearch(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mixcloud.com");
        driver.get(driver.getCurrentUrl());

        driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
        WebElement searchBox = driver.findElement(By.xpath("/html/body/div[1]/div/section/div[3]/div/div/div[2]/div/div/div/input"));
//        WebElement searchButton = driver.findElement("")
        searchBox.sendKeys("bass");
        searchBox.click();

        searchBox = driver.findElement(By.xpath("/html/body/div[1]/div/section/div[3]/div/div/div[2]/div/div/div/input"));
        Assert.assertEquals("bass","bass");
        driver.quit();


    }
}
