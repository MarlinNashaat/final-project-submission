package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;
import java.time.Duration;
import java.util.List;

public class BasePage {

    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public WebElement locateElement(By elementLocated)
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocated));
        wait.until(ExpectedConditions.elementToBeClickable(elementLocated));
        return driver.findElement(elementLocated);
    }

    public List<WebElement> locateListOfElement (By elementsLocator)
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementsLocator));
        wait.until(ExpectedConditions.elementToBeClickable(elementsLocator));
        return driver.findElements(elementsLocator);
    }

    public void clickElement(By elementLocated)
    {
        locateElement(elementLocated).click();
    }

    public void clickElementUsingEnterKey(By elementLocated)
    {
        locateElement(elementLocated).sendKeys(Keys.ENTER);
    }
    public void typeOnInputField(By elementLocated, String text)
    {
        locateElement(elementLocated).sendKeys(text);
    }
    public String getTextOfElement(By elementLocated)
    {
        return locateElement(elementLocated).getText();
    }
    public String getAttributeOfElement (By elementLocator, String attributeKey)
    {
        return locateElement(elementLocator).getAttribute(attributeKey);
    }

    public void hoverOnElements(By elementLocator)
    {
        Actions actions=new Actions(driver);
        actions.moveToElement(locateElement(elementLocator));
        actions.perform();
    }
    public void scrollVertically (int deltaY)
    {
        Actions actions = new Actions(driver);
        actions.scrollByAmount(0, deltaY).perform();

    }
}
