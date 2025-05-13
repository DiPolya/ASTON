package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MtsPage;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class MtsTest {

    private static WebDriver driver;
    private static MtsPage mts;

    @BeforeAll
    static void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.mts.by/");
        mts = new MtsPage(driver);
    }

    @DisplayName("Проверка заголовка блока")
    @Test
    void checkTitle() {
        assertEquals("Онлайн пополнение без комиссии", mts.getTitleBlock().getText().replace("\n", " "));
    }

    @DisplayName("Проверка наличия логотипов платёжных систем")
    @Test
    void checkLogos() {
        assertFalse(mts.getPayment().isEmpty(), "Логотипы не найдены");
    }

    @DisplayName("Проверка работы ссылки")
    @Test
    void checkLink() {
        WebElement link = mts.getServiceLink();
        assertTrue(link.isDisplayed());
        link.click();
        assertTrue(driver.getCurrentUrl().contains("about"));
        driver.navigate().back();
    }

    @DisplayName("Проверка ввода номера и кнопки")
    @Test
    void checkNumber(){
        WebElement button = mts.getContinueButton();
        assertFalse(button.isEnabled());

        mts.getPhoneInput().sendKeys("297777777");
        assertTrue(button.isEnabled());

        button.click();
        assertTrue(mts.getConnectionSumField().isDisplayed());

        WebElement modal = mts.getPaymentModal();
        assertTrue(modal.isDisplayed());

        assertEquals("297777777", mts.getModalPhone().getText().replaceAll("[^0-9]", ""));
        assertTrue(mts.getModalSumButton().getText().contains("р."));

        // Проверка пустых полей карты
        assertEquals("", mts.getCardNumberField().getAttribute("value"));
        assertEquals("", mts.getCardExpField().getAttribute("value"));
        assertEquals("", mts.getCardCvvField().getAttribute("value"));

        //Проверка иконок
        assertFalse(mts.getPaymentIconsOnModal().isEmpty(),"Отсутствуют иконки платёжных систем");
    }

    @DisplayName("Проверка надписей в незаполненных полях оплаты")
    @Test
    void checkPlaceholders(){
        String[][] tabsAndFields = {
                {"Услуги связи","phone"},
                {"Домашний интернет","ls"},
                {"Рассрочка","ls"},
                {"Задолженность","ls"},
        };
        for (String[] pair : tabsAndFields){
            mts.getTab(pair[0]).click();
            WebElement input = mts.getPlaceholderByName(pair[1]);
            String placeholder = input.getAttribute("placeholder");
            assertNotNull(placeholder, "Нет placeholder в " + pair[0]);
        }
    }

    @AfterAll
    static void teardown(){
        driver.quit();
    }
}
