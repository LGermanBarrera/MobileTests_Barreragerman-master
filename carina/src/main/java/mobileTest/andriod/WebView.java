package mobileTest.andriod;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import mobileTest.common.MenuScreenBase;
import mobileTest.common.WebViewOptionsBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE,parentClass = WebViewOptionsBase.class)
public class WebView extends WebViewOptionsBase {
    public WebView(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/webViewTV")
    private ExtendedWebElement getScreenTitle;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/menuIV")
    private ExtendedWebElement menuButton;

    @Override
    public void sendKeyURl() {

    }

    @Override
    public void clickOnGoToSiteButton() {

    }

    @Override
    public String getScreenTitle() {
        return getScreenTitle.getText();
    }

    @Override
    public MenuScreenBase clickOnMenu() {
         menuButton.click();
         return initPage(getDriver(), MenuScreenBase.class);
    }
}
