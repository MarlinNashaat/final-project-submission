package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewCartPage extends BasePage{


    public ViewCartPage(WebDriver driver) {
        super(driver);
    }

    //Locators

    //Check product on cart
    private By productsOnCart=By.xpath("//tr[@id=\"product-1\"]");


    //check title of table
    private By item=By.className("image");
    private By description=By.className("description");
    private By price=By.className("price");
    private By quantity=By.className("quantity");
    private By total=By.className("total");
    private By remove=By.className("remove");

    //check total of quantity
    private By totalQuantity=By.className("disabled");

    //Operators
    public int getAllProductOnCart()
    {
      return locateListOfElement(productsOnCart).size();
    }

    public String getTitleItem()
    {
        return getTextOfElement(item);
    }
    public String getTitleDescription()
    {
        return getTextOfElement(description);
    }
    public String getTitlePrice()
    {
        return getTextOfElement(price);
    }
    public String getTitleQuantity()
    {
        return getTextOfElement(quantity);
    }
    public String getTitleTotal()
    {
        return getTextOfElement(total);
    }
    public String getTitleRemove()
    {
        return getTextOfElement(remove);
    }
public String checkTotalOfQuantity()
{
    return getTextOfElement(totalQuantity);
}
}
