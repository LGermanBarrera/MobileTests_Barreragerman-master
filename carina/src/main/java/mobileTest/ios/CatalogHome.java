package mobileTest.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import mobileTest.andriod.ProductDetailsScreen;
import mobileTest.common.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CatalogHomeScreenBase.class)
public class CatalogHome extends CatalogHomeScreenBase {

    private static final String THIS_METHOD_IS_DEFINED_ONLY_IN_ANDROID = "This method is not yet implemented for iOS";

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`name == \"Catalog-tab-item\"`]")
    private ExtendedWebElement catalog;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == \"Button\"`]")
    private ExtendedWebElement sortingButton;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`name == \"More-tab-item\"`]")
    private ExtendedWebElement menuOption;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`name == \"Cart-tab-item\"`]")
    private ExtendedWebElement goToCart;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"EnumProducts\"`]")
    private ExtendedWebElement catalogTitle;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == \"StarUnSelected Icons\"`][1]")
    private ExtendedWebElement submitButton;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"ProductItem\"`][1]")
    private ExtendedWebElement backPack;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"ProductItem\"`][2]")
    private ExtendedWebElement bikeLight;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"ProductItem\"`][3]")
    private ExtendedWebElement tShirtBolt;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"ProductItem\"`][3]")
    private ExtendedWebElement onesieShirt;

    @FindBy(xpath = "(//XCUIElementTypeOther[@name=\"ProductItem\"])[4]")
    private ExtendedWebElement fleeceTShirt;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"ProductItem\"`][4]/XCUIElementTypeImage")
    private ExtendedWebElement allThingsShirt;


    public CatalogHome(WebDriver driver) {
        super(driver);
    }

    @Override
    public AlertScreenBase clickOnContinueOK() {
        return null;
    }

    @Override
    public void clickAddToCart() {

    }

    @Override
    public MenuScreenBase clickOnMenu() {
        menuOption.click();
        return initPage(getDriver(), MenuScreenBase.class);
    }

    @Override
    public CartScreenBase clickGoToCart() {
        goToCart.click();
        return initPage(getDriver(), CartScreenBase.class);
    }

    @Override
    public CatalogHomeScreenBase clickOnCatalog() {
        catalog.click();
        return initPage(getDriver(), CatalogHomeScreenBase.class);
    }

    @Override
    public SortingAlertPanelBase clickOnSortingItem() {
        sortingButton.click();
        return initPage(getDriver(), SortingAlertPanelBase.class);
    }

    @Override
    public void clickOnOptionMenu() {
        throw new UnsupportedOperationException(THIS_METHOD_IS_DEFINED_ONLY_IN_ANDROID);
    }

    @Override
    public ResetScreenBase clickOnResetApp() {
        return null;
    }

    @Override
    public String getCatalogTitle() {
        return catalogTitle.getText();
    }

    @Override
    public String checkSubmitButton() {
        return submitButton.getText();
    }

    @Override
    public ProductDetailsScreenBase selectProduct(String product) {
        switch (product) {
            case "BackPacks":
                backPack.click();
                return initPage(getDriver(), ProductDetailsScreenBase.class);

            case "BikeLight":
                System.out.println("This product crash the app");
                bikeLight.click();
                return initPage(getDriver(), ProductDetailsScreenBase.class);

            case "BoltTShirt":
                tShirtBolt.click();
                return initPage(getDriver(), ProductDetailsScreenBase.class);

            case "FleeceTShirt":
                fleeceTShirt.click();
                return initPage(getDriver(), ProductDetailsScreenBase.class);

            case "OnesieTShirt":
                onesieShirt.click();
                return initPage(getDriver(), ProductDetailsScreenBase.class);

            case "AllThingsTShirt":
                allThingsShirt.click();
                return initPage(getDriver(), ProductDetailsScreenBase.class);

        }
        return new ProductDetailsScreen(getDriver());
    }


    @Override
    public boolean isPageOpened() {
        return menuOption.isElementPresent();
    }

    @Override
    public void swipeUp() {

    }

    @Override
    public boolean swipe(ExtendedWebElement element) {
        return false;
    }


}
