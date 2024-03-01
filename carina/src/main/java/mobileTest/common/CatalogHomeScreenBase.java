package mobileTest.common;

import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CatalogHomeScreenBase extends AbstractPage implements IMobileUtils {

    public CatalogHomeScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract AlertScreenBase clickOnContinueOK();

    public abstract void clickAddToCart();

    public abstract MenuScreenBase clickOnMenu();

    public abstract CartScreenBase clickGoToCart();

    public abstract CatalogHomeScreenBase clickOnCatalog();

    public abstract SortingAlertPanelBase clickOnSortingItem();

    public abstract void clickOnOptionMenu();

    public abstract ResetScreenBase clickOnResetApp();

    public abstract String getCatalogTitle();

    public abstract String checkSubmitButton();

    // public abstract ProductDetailsScreenBase productFactory(EnumProducts product) throws ProductNotFoundException;

    public abstract ProductDetailsScreenBase selectProduct(String product);

    public abstract boolean isPageOpened();

    public abstract void swipeUp();

}
