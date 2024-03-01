package mobileTest.andriod;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import mobileTest.common.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;


@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CatalogHomeScreenBase.class)
public class CatalogHome extends CatalogHomeScreenBase {

    public CatalogHome(WebDriver driver) {
        super(driver);//  //driver.findElementsByXPath("//*[contains(@text,'/')]")
        // xpaths = driver.findElements(By.xpath("(//*[contains(@text,'/')])"));
    }


    @FindBy(id = "com.saucelabs.mydemoapp.android:id/itemTV")
    private ExtendedWebElement catalog;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/closeBt")
    private ExtendedWebElement continueButton;

    @ExtendedFindBy(androidUIAutomator = "(//*[@content-desc])")
    private List<ExtendedWebElement> xpaths;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Lab Back Packs\"]")
    private ExtendedWebElement backPackLab;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Lab Bolt T-Shirt\"]")
    private ExtendedWebElement boltTshirt;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Lab Bike Light\"]")
    private ExtendedWebElement lightBike;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Lab Fleece T-Shirt\"]")
    private ExtendedWebElement fleeceTShirt;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Lab Onesie\"]")
    private ExtendedWebElement onesieTShirt;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Test.sllTheThings() T-Shirt\"]")
    private ExtendedWebElement testTShirt;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/cartIV")
    private ExtendedWebElement goToCart;

    @FindBy(xpath = "//android.widget.ImageView[contains(text(),'Sauce')]")
    private ExtendedWebElement xpathslist;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/productTV")
    private ExtendedWebElement catalogTitle;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/menuIV")
    private ExtendedWebElement menuButton;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/header")
    private ExtendedWebElement headerScreenView;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/itemTV")
    private ExtendedWebElement resetAppButton;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/sortIV")
    private ExtendedWebElement sortingOrderButton;

    @Override
    public AlertScreenBase clickOnContinueOK() {
        return null;
    }

    @Override
    public void clickAddToCart() {

    }

    @Override
    public MenuScreenBase clickOnMenu() {
        menuButton.click();
        return initPage(getDriver(), MenuScreenBase.class);
    }

    @Override
    public CartScreenBase clickGoToCart() {
        goToCart.click();
        return initPage(getDriver(), CartScreenBase.class);
    }

    @Override
    public CatalogHomeScreenBase clickOnCatalog() {
        return null;
    }

    @Override
    public SortingAlertPanelBase clickOnSortingItem() {
        sortingOrderButton.click();
        return initPage(getDriver(),SortingAlertPanelBase.class);
    }

    @Override
    public void clickOnOptionMenu() {

    }

    @Override
    public ResetScreenBase clickOnResetApp() {
        resetAppButton.click();
        return initPage(getDriver(), ResetScreenBase.class);
    }

    @Override
    public String getCatalogTitle() {
        return catalogTitle.getText();
    }

    @Override
    public String checkSubmitButton() {
        return null;
    }

    @Override
    public ProductDetailsScreen selectProduct(String product) {

        switch (product) {
            case "BackPacks":
                backPackLab.click();
                break;
            case "BikeLight":
                System.out.println("This product crash the app");
                lightBike.click();
                break;
            case "BoltTShirt":
                boltTshirt.click();
                break;
            case "FleeceTShirt":
                fleeceTShirt.click();
                break;
            case "OnesieTShirt":
                onesieTShirt.click();
                break;
            case "AllThingsTShirt":
                testTShirt.click();
                break;
            default:
        }
        return new ProductDetailsScreen(getDriver());

    }

    @Override
    public boolean isPageOpened() {
        return headerScreenView.isElementPresent();
    }

    @Override
    public void swipeUp() {
        swipe(testTShirt);
    }




}



