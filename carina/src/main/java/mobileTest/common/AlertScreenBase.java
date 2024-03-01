package mobileTest.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class AlertScreenBase extends AbstractPage {
    public AlertScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract String getAlertText();

    public abstract void clickContinueAlert();
}
