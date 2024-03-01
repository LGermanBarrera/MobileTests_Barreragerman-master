package mobileTest.andriod;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import mobileTest.common.AboutOptionBase;
import mobileTest.common.MenuScreenBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE,parentClass = AboutOptionBase.class)
public class AboutScreen extends AboutOptionBase {
    public AboutScreen(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Container for fragments\"]/android.view.ViewGroup/android.widget.TextView[1]")
    private ExtendedWebElement aboutTitle;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/webTV")
    private ExtendedWebElement webPageLink;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/menuIV")
    private ExtendedWebElement meniIcon;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Home\"]")
    private ExtendedWebElement webTitle;

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Web View\"]")
    private WebElement loadingWebPage;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Home\"]")
    private WebElement webVisibility;

    @Override
    public String getAboutTitle() {
        return aboutTitle.getText();
    }

    @Override
    public String getWebPageTitle() {
        return webTitle.getText();
    }

    @Override
    public MenuScreenBase clickOnMenu() {
        meniIcon.click();
        return initPage(getDriver(), MenuScreenBase.class);
    }

    @Override
    public void clickOnWebPageLink() {

    }
}
