package mobileTest.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CartScreenBase extends AbstractPage {
    public CartScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract NoItemScreenBase clickOnRemove();
    public abstract void clickToCheckOut();
    public abstract String getNumberOfItem();
    public abstract CatalogHomeScreenBase clickOnGoShoppingButton();
    public abstract String getNoItemTitle();

    public abstract void clickOnMinusButton();
}
