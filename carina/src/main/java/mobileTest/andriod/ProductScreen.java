package mobileTest.andriod;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import mobileTest.common.ProductDetailsScreenBase;
import mobileTest.common.ProductScreenBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE,parentClass = ProductScreen.class)
public class ProductScreen extends ProductScreenBase {
    public ProductScreen(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Lab Back Packs\"]")
    private ExtendedWebElement backPack;

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

    @Override
    public ProductDetailsScreenBase clickOnBackPack() {
        backPack.click();
        return initPage(getDriver(),ProductDetailsScreenBase.class);
    }

    @Override
    public ProductDetailsScreenBase clickOnBikeLight() {
        lightBike.click();
        return initPage(getDriver(),ProductDetailsScreenBase.class);
    }

    @Override
    public ProductDetailsScreenBase clickOnBoltTShirt() {
        boltTshirt.click();
        return initPage(getDriver(),ProductDetailsScreenBase.class);
    }

    @Override
    public ProductDetailsScreenBase clickOnFleeceTShirt() {
        fleeceTShirt.click();
        return initPage(getDriver(), ProductDetailsScreen.class);
    }

    @Override
    public ProductDetailsScreenBase clickOnOnesieTShirt() {
        onesieTShirt.click();
        return initPage(getDriver(), ProductDetailsScreen.class);
    }

    @Override
    public ProductDetailsScreenBase clickOnTestTShirt() {
        testTShirt.click();
        return initPage(getDriver(), ProductDetailsScreen.class);
    }
}
