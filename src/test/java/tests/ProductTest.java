package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductPage;

public class ProductTest extends BaseTest{
    @Test(priority = 0)
    public void testSearchProductUsingBtnSearch()
    {
        ProductPage productPage=new ProductPage(driver);
        Assert.assertEquals(productPage.getAllProductMsg(),"ALL PRODUCTS");
        productPage.searchProductField("Blue");
        Assert.assertEquals(productPage.getSearchProductMsg(),"SEARCHED PRODUCTS");

    }
    @Test(priority = 1)
    public void testSearchProductUsingEnterKey()
    {
        ProductPage productPage=new ProductPage(driver);
        Assert.assertEquals(productPage.getAllProductMsg(),"ALL PRODUCTS");
        productPage.clickEnterToSearch("Blue");
        Assert.assertEquals(productPage.getSearchProductMsg(),"SEARCHED PRODUCTS");
    }
}
