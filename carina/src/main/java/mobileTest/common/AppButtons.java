package mobileTest.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class AppButtons extends AbstractPage {
    public AppButtons(WebDriver driver) {
        super(driver);
    }
    public abstract MenuScreenBase clickOnMenu();

    public abstract CartScreenBase clickGoToCart();

    public abstract CatalogHomeScreenBase clickOnCatalog();

    public abstract void clickOnSortingItem();

    public abstract void clickOnOptionMenu();
}
