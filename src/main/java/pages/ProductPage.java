package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends  BasePage{

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    //Locators

    //Get product page Message
    private By allProductMsg=By.cssSelector(".title");

    //search about product
    private By searchField =By.id("search_product");
    private By searchBtn=By.cssSelector(".btn-lg");

    //Get search product message
    private By searchProductMsg=By.cssSelector(".title");


    //Operation
    public String getAllProductMsg()
    {
        return getTextOfElement(allProductMsg);
    }
    public void searchProductField(String searchProduct)
    {
        typeOnInputField(searchField,searchProduct);
        clickElement(searchBtn);
    }
    public void pressEnterToSearchProduct(String searchProduct)
    {
        typeOnInputField(searchField,searchProduct);
        clickElementUsingEnterKey(searchField);
    }

    public String getSearchProductMsg()
    {
        return getTextOfElement(searchProductMsg);
    }

}
