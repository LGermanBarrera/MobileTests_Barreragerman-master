package mobileTest.andriod;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import mobileTest.common.CatalogHomeScreenBase;
import mobileTest.common.NoItemScreenBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE,parentClass = NoItemScreenBase.class)
public class NoItem extends NoItemScreenBase {
    public NoItem(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/shoppingBt")
    private ExtendedWebElement goShoppingButton;

    @Override
    public CatalogHomeScreenBase clickOnGoShoppingButton() {
        goShoppingButton.click();
        return initPage(getDriver(), CatalogHomeScreenBase.class);
    }
}
