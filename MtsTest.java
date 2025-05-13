import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class MtsTest {

    private static WebDriver driver;

    @BeforeAll
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.mts.by/");
    }

    @DisplayName("Проверка названия блока")
    @Test
    void checkTitle(){
        WebElement title = driver.findElement(By.xpath("//h2[contains(., 'Онлайн пополнение')]"));
        Assertions.assertEquals("Онлайн пополнение без комиссии",title.getText());

    }

    @DisplayName("Проверка наличия логотипов платёжных систем")
    @Test
    void checkLogos(){
        List<WebElement> logos = driver.findElements(By.cssSelector("#pay-section .pay__partners"));
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
        //Проверка кнопки "Продолжить" до ввода текста
        WebElement button = driver.findElement(By.xpath("//*[@id='pay-connection']/button") );
        Assertions.assertFalse(button.isEnabled(), "Кнопка не активна без ввода текста");

        // Ввод номера телефона
        WebElement input = driver.findElement(By.name("phone"));
        input.sendKeys("297777777");

        //Проверка кнопки "Продолжить" после ввода текста"
        Assertions.assertTrue(button.isEnabled(), "Кнопка кликабельна после ввода номера");
        button.click();

        //Проверка появления поля суммы
        WebElement connectionSum = driver.findElement(By.id("connection-sum"));
        Assertions.assertTrue(connectionSum.isDisplayed(), "Отсутствует поле суммы платежа");
    }

    @AfterAll
    public static void teardown (){
        driver.quit();
    }

}
