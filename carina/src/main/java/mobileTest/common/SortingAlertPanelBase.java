package mobileTest.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class SortingAlertPanelBase extends AbstractPage {
    public SortingAlertPanelBase(WebDriver driver) {
        super(driver);
    }

    public abstract void clickOnAscendingName();
    public abstract void clickOnDescendingName();
    public abstract void clickOnPriceAscendingOrder();
    public abstract void clickOnPriceDescendingOption();
}
