package test;

import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.ResultPage;

public class DomovitaTest extends AbstractTest {
    @Test
    public void testMinFlatRent() {

        ResultPage resultPage = new HomePage().openPage()
                .chooseOperationRent()
                .chooseNumberOfRooms("1")
                .clickButtonSearch()
                .clickButtonParameters()
                .chooseDistrict()
                .clickButtonSelect()
                .clickButtonCloseParameters();
        resultPage.createAddressPriceList();
        resultPage.findSmallestPrice();
    }
}
