package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AddToCartPage;
import pages.ViewCartPage;

public class ViewCartTest extends BaseTest {

   ViewCartPage viewCartPage ;
    @BeforeMethod
    public void testAddToCart() {
        AddToCartPage addToCartPage = new AddToCartPage(driver);
        ViewCartPage viewCartPage = addToCartPage.addProductsToCart();

         //To check product on cart
        Assert.assertEquals(viewCartPage.getAllProductOnCart(), 1);
    }

    @Test(priority = 0)
    public void testViewCartDetails() {
        ViewCartPage viewCartPage=new ViewCartPage(driver);

        //To check title of table
        Assert.assertEquals(viewCartPage.getTitleItem(), "Item");
        Assert.assertEquals(viewCartPage.getTitleDescription(), "Description");
        Assert.assertEquals(viewCartPage.getTitlePrice(), "Price");
        Assert.assertEquals(viewCartPage.getTitleQuantity(), "Quantity");
        Assert.assertEquals(viewCartPage.getTitleTotal(), "Total");
        Assert.assertEquals(viewCartPage.getTitleRemove(), "Remove");
    }

    @Test(priority = 1)
    public void testTotalOfQuantity() {
        ViewCartPage viewCartPage=new ViewCartPage(driver);

        //To check total of Quantity
        Assert.assertEquals(viewCartPage.checkTotalOfQuantity(), "1");
    }

}
