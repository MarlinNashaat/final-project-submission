package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage extends BasePage{

    public AddToCartPage(WebDriver driver) {
        super(driver);
    }

//Locators

    //Add product on cart then view cart
    private By firstProduct=By.xpath("(//div[@class=\"productinfo text-center\"])[1]");
    private By addToCart=By.xpath(("(//a[@data-product-id=\"1\"])[2]"));

    private By viewCartLink=By.xpath("(//a[@href=\"/view_cart\"])[2]");


    //Operators

    public ViewCartPage addProductsToCart()
    {
        scrollVertically(700);
        hoverOnElements(firstProduct);
        clickElement(addToCart);
        clickElement(viewCartLink);
        return new ViewCartPage(driver);
    }
}
