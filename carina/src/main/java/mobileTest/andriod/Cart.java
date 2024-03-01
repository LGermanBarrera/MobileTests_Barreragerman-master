package mobileTest.andriod;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import mobileTest.common.CartScreenBase;
import mobileTest.common.CatalogHomeScreenBase;
import mobileTest.common.NoItemScreenBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CartScreenBase.class)
public class Cart extends CartScreenBase {
    public Cart(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/noTV")
    private ExtendedWebElement numberOfItem;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/removeBt")
    private ExtendedWebElement removeButton;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/minusIV")
    private ExtendedWebElement minusButton;

    @Override
    public NoItemScreenBase clickOnRemove() {
        removeButton.click();
        return initPage(getDriver(), NoItemScreenBase.class);
    }

    @Override
    public void clickToCheckOut() {

    }

    @Override
    public String getNumberOfItem() {
        return numberOfItem.getText();
    }

    @Override
    public CatalogHomeScreenBase clickOnGoShoppingButton() {
        return null;
    }

    @Override
    public String getNoItemTitle() {
        return null;
    }

    @Override
    public void clickOnMinusButton() {
    minusButton.click();
    }
}
