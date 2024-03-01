package mobileTest;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.zebrunner.agent.core.annotation.TestLabel;
import io.appium.java_client.AppiumDriver;
import mobileTest.common.*;
import mobileTest.andriod.service.SortingProductName;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class MyDemoAppTests implements IAbstractTest {
    private static final Logger LOGGER = LogManager.getLogger(MyDemoAppTests.class);


    /*
      In order to test the app here are the products available:
      "BackPacks","BoltTShirt","FleeceTShirt","OnesieTShirt","AllThingsTShirt"
     */

    @Test
    @MethodOwner(owner = "barreraGerman")
    @TestLabel(name = "testTappingOnDifferentProducts", value = {"mobile", "practice"})
    public void testTappingOnDifferentProducts() {
        /*
          In order to test the app here are the products available:
          "BackPacks","BoltTShirt","FleeceTShirt","OnesieTShirt","AllThingsTShirt"
         */

        CatalogHomeScreenBase homePage = initPage(getDriver(), CatalogHomeScreenBase.class);
        Assert.assertTrue(homePage.isPageOpened(), "Catalog screen isn't opened");

        homePage.selectProduct("BackPacks");
        MenuScreenBase menu = homePage.clickOnMenu();
        menu.clickOnCatalogOption();
        homePage.selectProduct("BoltTShirt");
        homePage.clickOnMenu();
        menu.clickOnCatalogOption();
        homePage.selectProduct("FleeceTShirt");
        homePage.clickOnMenu();
        menu.clickOnCatalogOption();

    }

    //Sauce Lab Back Packs
    @Test
    @MethodOwner(owner = "barreraGerman")
    @TestLabel(name = "testAddAndRemoveAProductFromCart", value = {"mobile", "practice"})
    public void testAddAndRemoveAProductFromCart() {
        /*
          In order to test the app here are the products available:
          "BackPacks","BoltTShirt","FleeceTShirt","OnesieTShirt","AllThingsTShirt"
         */
        CatalogHomeScreenBase homePage = initPage(getDriver(), CatalogHomeScreenBase.class);
        Assert.assertTrue(homePage.isPageOpened(), "Catalog screen isn't opened");
        ProductDetailsScreenBase product = homePage.selectProduct("BoltTShirt");
        product.swipeUp();
        product.clickOnProductPlusButton();
        String amountOfAddedItems = product.getProductAmount();
        product.clickAddToCartButton();
        CartScreenBase cart = homePage.clickGoToCart();
        NoItemScreenBase noItemScreen = cart.clickOnRemove();

        noItemScreen.clickOnGoShoppingButton();
        String catalogTitle = homePage.getCatalogTitle();

        assertEquals(amountOfAddedItems, "2", "The products were not added");
        assertEquals(catalogTitle, "Products", "Catalog screen was not opened");

    }

    @Test
    @MethodOwner(owner = "barreraGerman")
    @TestLabel(name = "testSubmittingReviewButton", value = {"mobile", "practice"})
    public void testSubmittingReviewButton() {
        /*
          In order to test the app here are the products available:
          "BackPacks","BoltTShirt","FleeceTShirt","OnesieTShirt","AllThingsTShirt"
         */
        CatalogHomeScreenBase homePage = initPage(getDriver(), CatalogHomeScreenBase.class);
        Assert.assertTrue(homePage.isPageOpened(), "Catalog screen isn't opened");
        ProductDetailsScreenBase product = homePage.selectProduct("BoltTShirt");
        AlertScreenBase alertScreen = product.clickOnSubmitStar();

        String alertText = alertScreen.getAlertText();
        alertScreen.clickContinueAlert();
        MenuScreenBase menu = homePage.clickOnMenu();
        menu.clickOnCatalogOption();

        assertEquals(alertText,
                "Thank you for submitting your review!", "The button was not tap");
    }

    @Test
    @MethodOwner(owner = "barreraGerman")
    @TestLabel(name = "testAddPlusItemProduct", value = {"mobile", "practice"})
    public void testAddPlusItemProduct() {
        /*
          In order to test the app here are the products available:
          "BackPacks","BoltTShirt","FleeceTShirt","OnesieTShirt","AllThingsTShirt"
         */

        CatalogHomeScreenBase homePage = initPage(getDriver(), CatalogHomeScreenBase.class);
        Assert.assertTrue(homePage.isPageOpened(), "Catalog screen isn't opened");
        ProductDetailsScreenBase product = homePage.selectProduct("BoltTShirt");
        product.swipeUp();
        product.clickOnProductPlusButton();
        String numberOfItems = product.getProductAmount();
        MenuScreenBase manu = homePage.clickOnMenu();
        manu.clickOnCatalogOption();

        assertEquals(numberOfItems, "2", "The button was not tap");

    }

    @Test
    @MethodOwner(owner = "barreraGerman")
    @TestLabel(name = "testMinusButton", value = {"mobile", "practice"})
    public void testMinusButton() {
        /*
          In order to test the app here are the products available:
          "BackPacks","BoltTShirt","FleeceTShirt","OnesieTShirt","AllThingsTShirt"
         */
        CatalogHomeScreenBase homePage = initPage(getDriver(), CatalogHomeScreenBase.class);
        Assert.assertTrue(homePage.isPageOpened(), "Catalog screen isn't opened");
        ProductDetailsScreenBase product = homePage.selectProduct("BackPacks");
        product.swipeUp();
        product.clickOnProductPlusButton();
        product.clickOnProductPlusButton();
        product.clickAddToCartButton();
        CartScreenBase cart = homePage.clickGoToCart();
        cart.clickOnMinusButton();
        String numberOfItem = cart.getNumberOfItem();
        MenuScreenBase menu = homePage.clickOnMenu();
        menu.clickOnCatalogOption();

        assertEquals(numberOfItem, "2", "The button does not work");

    }


    @Test
    @MethodOwner(owner = "barreraGerman")
    @TestLabel(name = "testWebViewButton", value = {"mobile", "practice"})
    public void testWebViewButton() {
        /*
          In order to test the app here are the products available:
          "BackPacks","BoltTShirt","FleeceTShirt","OnesieTShirt","AllThingsTShirt"
         */
        CatalogHomeScreenBase homePage = initPage(getDriver(), CatalogHomeScreenBase.class);
        Assert.assertTrue(homePage.isPageOpened(), "Catalog screen isn't opened");
        MenuScreenBase menu = homePage.clickOnMenu();
        WebViewOptionsBase webView = menu.clickOnWebViewOption();
        String title = webView.getScreenTitle();
        webView.clickOnMenu();
        menu.clickOnCatalogOption();

        assertEquals(title, "Webview", "The screen is not opened");

    }

    @Test
    @MethodOwner(owner = "barreraGerman")
    @TestLabel(name = "testQRScannerButton", value = {"mobile", "practice"})
    public void testQRScannerButton() {
        /*
          In order to test the app here are the products available:
          "BackPacks","BoltTShirt","FleeceTShirt","OnesieTShirt","AllThingsTShirt"
         */
        CatalogHomeScreenBase homePage = initPage(getDriver(), CatalogHomeScreenBase.class);
        Assert.assertTrue(homePage.isPageOpened(), "Catalog screen isn't opened");
        MenuScreenBase menu = homePage.clickOnMenu();

        QRCodeScannerBase qrScreen = menu.clickOnQRScannerOption();
        String title = qrScreen.getQRText();
        qrScreen.clickOnMenu();
        menu.clickOnCatalogOption();

        assertEquals(title, "QR Code Scanner", "The screen was not opened");

    }

    @Test
    @MethodOwner(owner = "barreraGerman")
    @TestLabel(name = "testDrawingButton", value = {"mobile", "practice"})
    public void testDrawingButton() {
        /*
          In order to test the app here are the products available:
          "BackPacks","BoltTShirt","FleeceTShirt","OnesieTShirt","AllThingsTShirt"
         */
        CatalogHomeScreenBase homePage = initPage(getDriver(), CatalogHomeScreenBase.class);
        Assert.assertTrue(homePage.isPageOpened(), "Catalog screen isn't opened");


        MenuScreenBase menu = homePage.clickOnMenu();

        DrawingOptionBase drawingScreen = menu.clickOnDrawingOption();
        String title = drawingScreen.getDrawingText();
        drawingScreen.clickOnMenu();
        menu.clickOnCatalogOption();

        assertEquals(title, "Drawing", "The screen is not opened");
    }


    @Test
    @MethodOwner(owner = "barreraGerman")
    @TestLabel(name = "testGeoLocationButton", value = {"mobile", "practice"})
    public void testGeoLocationButton() {
        /*
          In order to test the app here are the products available:
          "BackPacks","BoltTShirt","FleeceTShirt","OnesieTShirt","AllThingsTShirt"
         */
        CatalogHomeScreenBase homePage = initPage(getDriver(), CatalogHomeScreenBase.class);
        Assert.assertTrue(homePage.isPageOpened(), "Catalog screen isn't opened");

        MenuScreenBase menu = homePage.clickOnMenu();
        GeoLocationOptionBase geoLocation = menu.clickOnGeoLocalizationOption();

        String title = geoLocation.getGeoLocationTitle();
        geoLocation.clickOnMenu();
        menu.clickOnCatalogOption();

        Assert.assertEquals(title, "Geo Location", "The page was not opened");

    }

    @Test
    @MethodOwner(owner = "barreraGerman")
    @TestLabel(name = "testAboutButton", value = {"mobile", "practice"})
    public void testAboutButton() {
        /*
          In order to test the app here are the products available:
          "BackPacks","BoltTShirt","FleeceTShirt","OnesieTShirt","AllThingsTShirt"
         */
        CatalogHomeScreenBase homePage = initPage(getDriver(), CatalogHomeScreenBase.class);
        Assert.assertTrue(homePage.isPageOpened(), "Catalog screen isn't opened");

        MenuScreenBase menu = homePage.clickOnMenu();
        AboutOptionBase aboutScreen = menu.clickOnAboutOption();
        String title = aboutScreen.getAboutTitle();
        aboutScreen.clickOnWebPageLink();

        assertEquals(title, "About", "The Screen is not opened");

    }

    @Test
    @MethodOwner(owner = "barreraGerman")
    @TestLabel(name = "testResetButton", value = {"mobile", "practice"})
    public void testResetAppButton() {

        CatalogHomeScreenBase homePage = initPage(getDriver(), CatalogHomeScreenBase.class);
        Assert.assertTrue(homePage.isPageOpened(), "Catalog screen isn't opened");

        MenuScreenBase menu = homePage.clickOnMenu();
        ResetScreenBase resetScreen = menu.clickOnResentAppOption();
        resetScreen.clickOnRestAppButton();
        String messageText = resetScreen.getMessageOk();
        resetScreen.clickOnOKButton();

        assertEquals(messageText, "App State has been reset.", "The button was not clicked");
    }

    @Test
    @MethodOwner(owner = "barreraGerman")
    @TestLabel(name = "testLoginButton", value = {"Mobile", "Practice"})
    public void testLoginButton() {

        CatalogHomeScreenBase homepage = initPage(getDriver(), CatalogHomeScreenBase.class);
        Assert.assertTrue(homepage.isPageOpened(), "Catalog screen isn't opened");

        MenuScreenBase menu = homepage.clickOnMenu();
        LoginOptionBase login = menu.clickOnLoginOption();
        String title = login.getLoginText();
        login.setUsername("bod@example.com");
        login.setPassword("10203040");
        CatalogHomeScreenBase catalog = login.clickLogin();
        String catalogTitle = catalog.getCatalogTitle();
        LOGGER.info("Here the assertions are done");
        assertEquals(title, "Login", "The page was not opened");
        assertEquals(catalogTitle, "Products", "The catalog is not opened");
    }

    @Test
    @MethodOwner(owner = "barreraGerman")
    @TestLabel(name = "Check  the name ascending order button", value = {"Mobile", "Practice"})
    public void testAscendingNameOrderButton() {
/**As a precondition the main catalog must be in descending name order
 * */
        CatalogHomeScreenBase homePage = initPage(getDriver(), CatalogHomeScreenBase.class);
        Assert.assertTrue(homePage.isPageOpened(), "Catalog screen isn't opened");

        SortingProductName sort = new SortingProductName(getDriver());
        SortingAlertPanelBase panel = homePage.clickOnSortingItem();
        panel.clickOnAscendingName();
        List<WebElement> listedProducts = sort.gettingProductsName();
        List<String> parsedElementsToStrings = sort.parsingWebElementToString(listedProducts);

        List<String> expectedList = new ArrayList<>();
        expectedList.add("Sauce Lab Back Packs");
        expectedList.add("Sauce Lab Bike Light");
        expectedList.add("Sauce Lab Bolt T-Shirt");
        expectedList.add("Sauce Lab Fleece T-Shirt");


        Assert.assertEquals(parsedElementsToStrings, expectedList, "The products were not sorted by Ascending name");
    }

    @Test
    @MethodOwner(owner = "barreraGerman")
    @TestLabel(name = "Check  the name descending order button", value = {"Mobile", "Practice"})
    public void testDescendingNameOrderButton() {

        CatalogHomeScreenBase homePage = initPage(getDriver(), CatalogHomeScreenBase.class);
        Assert.assertTrue(homePage.isPageOpened(), "Catalog screen isn't opened");

        SortingProductName sort = new SortingProductName(getDriver());
        SortingAlertPanelBase panel = homePage.clickOnSortingItem();
        panel.clickOnDescendingName();
        System.out.println("Entrando al thread...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Obteniendo lista...descendente");
        List<WebElement> productsName = sort.gettingProductsName();
        List<String> reversedElements = sort.reverseOrderProductTextFunction(productsName);

        List<String> expectedProductList = new ArrayList<>();
        expectedProductList.add("Test.sllTheThings() T-Shirt");
        expectedProductList.add("Sauce Lab Onesie");
        expectedProductList.add("Sauce Lab Fleece T-Shirt");
        expectedProductList.add("Sauce Lab Bolt T-Shirt");

        Assert.assertEquals(reversedElements, expectedProductList, "The list was not sorted in descending name");

    }

    @Test
    @MethodOwner(owner = "barreraGerman")
    @TestLabel(name = "check Price Descending name button", value = {"Mobile", "Practice"})
    public void testDescendingPriceButton() {
//
//        CatalogHomeScreenBase homepage = initPage(getDriver(), CatalogHomeScreenBase.class);
//      //  Assert.assertTrue(homepage.isPageOpened(), "The home page was not opened");
//
//        SortingAlertPanelBase panel = homepage.clickOnSortingItem();
//        panel.clickOnPriceDescendingOption();
//
//        SortingProductName sort = new SortingProductName(getDriver());
//        List<WebElement> priceList = sort.gettingPriceListFunctional().get();
//        for (WebElement data : priceList) {
//            System.out.println(data.getText());
//        }
//
//        System.out.println("Number without dollar symbol");
//        List<String> numberPrice = sort.removeDollarSymbol(priceList);
//        for (String data : numberPrice) {
//            System.out.println(data.toString());
//        }
//
//        List<String> expectedPrices = new ArrayList<>();
//        expectedPrices.add("49.99");
//        expectedPrices.add("29.99");
//        expectedPrices.add("15.99");
//        expectedPrices.add("15.99");
//
//        Assert.assertEquals(numberPrice, expectedPrices, "The prices were not sorted in descendent order");
    }

        System.out.println("Number without dollar symbol");
        List<String> numberPrice = sort.removeDollarSymbol(priceList);
        for (String data:numberPrice) {
            System.out.println(data.toString());
        }

        List<String> expectedPrices = new ArrayList<>();
        expectedPrices.add("49.99");
        expectedPrices.add("29.99");
        expectedPrices.add("15.99");
        expectedPrices.add("15.99");

        Assert.assertEquals(numberPrice,expectedPrices,"The prices were not sorted in descendent order");
    }
    @Test
    @MethodOwner(owner = "barreraGerman")
    @TestLabel(name = "check Price Ascending  button", value = {"Mobile", "Practice"})
    public void testAscendingPriceButton() {

        CatalogHomeScreenBase homepage = initPage(getDriver(), CatalogHomeScreenBase.class);
        Assert.assertTrue(homepage.isPageOpened(), "The home page was not opened");
        SortingAlertPanelBase panel = homepage.clickOnSortingItem();
        panel.clickOnPriceAscendingOrder();

        SortingProductName sort = new SortingProductName(getDriver());
        List<WebElement> priceList = sort.gettingPriceList();
        for (WebElement data : priceList) {
            System.out.println(data.getText());
        }

        System.out.println("Number without dollar symbol");
        List<String> numberPrice = sort.removeDollarSymbol(priceList);
        for (String data : numberPrice) {
            System.out.println(data.toString());
        }
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("7.99");
        expectedResult.add("9.99");
        expectedResult.add("15.99");
        expectedResult.add("15.99");

        Assert.assertEquals(numberPrice, expectedResult, "The price was not sorted");

    }

}