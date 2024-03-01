package mobileTest.andriod;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import mobileTest.common.GeoLocationOptionBase;
import mobileTest.common.MenuScreenBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = GeoLocationOptionBase.class)
public class GeoLocation extends GeoLocationOptionBase {

    public GeoLocation(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/locationTV")
    private ExtendedWebElement geoTitle;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/menuIV")
    private ExtendedWebElement menuIcon;


    @Override
    public String getGeoLocationTitle() {
        return geoTitle.getText();
    }

    @Override
    public MenuScreenBase clickOnMenu() {
        menuIcon.click();
        return initPage(getDriver(), MenuScreenBase.class);
    }
}
