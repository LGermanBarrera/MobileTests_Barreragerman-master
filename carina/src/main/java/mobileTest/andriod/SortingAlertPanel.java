package mobileTest.andriod;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import mobileTest.common.SortingAlertPanelBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = SortingAlertPanelBase.class)
public class SortingAlertPanel extends SortingAlertPanelBase {
    public SortingAlertPanel(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/menuNameAscIV")
    private ExtendedWebElement nameAscendingOrder;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/nameDesCL")
    private ExtendedWebElement nameDescendingOrder;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/menuPriceDscIV")
    private ExtendedWebElement priceDescending;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/menuPriceAscIV")
    private ExtendedWebElement priceAscending;

    @Override
    public void clickOnAscendingName() {
        nameAscendingOrder.click();
    }

    @Override
    public void clickOnDescendingName() {
        nameDescendingOrder.click();
    }

    @Override
    public void clickOnPriceAscendingOrder() {
        priceAscending.click();
    }

    @Override
    public void clickOnPriceDescendingOption() {
        priceDescending.click();
    }
}
