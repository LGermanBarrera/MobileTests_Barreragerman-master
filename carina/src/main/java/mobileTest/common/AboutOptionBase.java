package mobileTest.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class AboutOptionBase extends AbstractPage {
    public AboutOptionBase(WebDriver driver) {
        super(driver);
    }

    public abstract String getAboutTitle();

    public abstract String getWebPageTitle();

    public abstract MenuScreenBase clickOnMenu();

    public abstract void clickOnWebPageLink();

}
