package mobileTest.common;

import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class ProductDetailsScreenBase extends AbstractPage implements IMobileUtils {

    public ProductDetailsScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract String getProductTitle();

    public abstract String getProductPrice();

    public abstract void clickOnRadiobutton();

    public abstract String getValueRadioButton();

    public abstract String getProductAmount();

    public abstract void clickSubmittingMenu();

    public abstract String getProductSelectedStar();

    public abstract void clickOnProductPlusButton();

    public abstract void clickOnProductMinusButton();

    public abstract void clickAddToCartButton();

    public abstract AlertScreenBase clickOnSubmitStar();

    public abstract void swipeUp();

}
