package mobileTest.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class WebViewOptionsBase extends AbstractPage {
    public WebViewOptionsBase(WebDriver driver) {
        super(driver);
    }

    public abstract void sendKeyURl();
    public abstract void clickOnGoToSiteButton();
    public abstract String getScreenTitle();
    public abstract MenuScreenBase clickOnMenu();

}
