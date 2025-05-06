import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class MtsTest {

    static WebDriver driver;

    @BeforeAll
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //driver = WebDriverManager.chromedriver().create();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.mts.by/");
    }

    @AfterAll
    public static void teardown (){
        driver.quit();
    }


    @DisplayName("Проверка названия блока")
    @Test
    void checkTitle(){
        WebElement title = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/h2"));
        Assertions.assertEquals("Онлайн пополнение без комиссии",title.getText());

    }

    @DisplayName("Проверка наличия логотипов платёжных систем")
    @Test
    void checkLogos(){
        List<WebElement> logos = driver.findElements(By.cssSelector("#pay-section > div > div > div.col-12.col-xl-8 > section > div > div.pay__partners"));
        Assertions.assertFalse(logos.isEmpty(), "Логотипы платёжных систем не найдены" );
    }

    @DisplayName("Проверка работы ссылки")
    @Test
    void checkLink(){
        WebElement link = driver.findElement(By.linkText("Подробнее о сервисе"));
        Assertions.assertTrue(link.isDisplayed(), "Ссылка не отображается" );
        link.click();
        Assertions.assertTrue(driver.getCurrentUrl().contains("about"), "Переход по ссылке не корректен");
    }

    @DisplayName("Проверка ввода номера и кнопки")
    @Test
    void checkNumber(){
        WebElement input = driver.findElement(By.name("phone"));
        input.sendKeys("297777777");

        WebElement button = driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button"));
        Assertions.assertTrue(button.isEnabled(), "Кнопка не кликабельна");
        button.click();

        WebElement connectionSum = driver.findElement(By.xpath("//*[@id=\"connection-sum\"]"));
        Assertions.assertTrue(connectionSum.isDisplayed(), "Отсутствует поле суммы платежа");
    }

}
