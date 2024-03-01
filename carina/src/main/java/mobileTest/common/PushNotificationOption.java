package mobileTest.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class PushNotificationOption extends AbstractPage {
    public PushNotificationOption(WebDriver driver) {
        super(driver);
    }

    public abstract String getPushText();

    public abstract void clickBackToMenu();

}
