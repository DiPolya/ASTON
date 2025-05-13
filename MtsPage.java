package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MtsPage {
    private WebDriver driver;

    public MtsPage (WebDriver driver){
        this.driver = driver;
    }

    public WebElement getTitleBlock(){
        return driver.findElement(By.xpath("//h2[contains(., 'Онлайн пополнение')]"));
    }

    public List<WebElement> getPayment(){
        return driver.findElements(By.cssSelector("#pay-section .pay__partners img"));
    }

    public WebElement getServiceLink(){
        return driver.findElement(By.linkText("Подробнее о сервисе"));
    }

    public WebElement getPhoneInput(){
        return driver.findElement(By.name("phone"));
    }

    public WebElement getContinueButton(){
        return driver.findElement(By.xpath("//*[@id='pay-connection']/button"));
    }

    public WebElement getConnectionSumField(){
        return driver.findElement(By.id("connection-sum"));
    }

    public WebElement getCardNumberField(){
        return driver.findElement(By.name("cardNumber"));
    }

    public WebElement getCardExpField(){
        return driver.findElement(By.name("expDate"));
    }

    public WebElement getCardCvvField(){
        return driver.findElement(By.name("cvc"));
    }

    public List<WebElement> getPaymentIconsOnModal(){
        return driver.findElements(By.cssSelector(".popup__cards img"));
    }

    //Разные виды оплаты
    public WebElement getTab(String tabText){
        return driver.findElement(By.xpath("//button[contains(.,'" + tabText + "')]"));
    }

    public WebElement getPlaceholderByName(String name){
        return driver.findElement(By.name(name));
    }

    public WebElement getPaymentModal(){
        return driver.findElement(By.cssSelector(".popup"));
    }

    public WebElement getModalPhone(){
        return driver.findElement(By.cssSelector(".popup__info .popup__phone"));
    }

    public WebElement getModalSumButton(){
        return driver.findElement(By.cssSelector(".popup__bottom .button"));
    }
}
