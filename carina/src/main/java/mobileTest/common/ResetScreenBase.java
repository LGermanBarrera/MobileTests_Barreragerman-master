package mobileTest.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class ResetScreenBase extends AbstractPage {
    public ResetScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract void clickOnOKButton();

    public abstract void clickOnRestAppButton();

    public abstract String getMessageOk();
}
