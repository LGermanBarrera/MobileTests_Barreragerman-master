package mobileTest.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.annotations.Predicate;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import mobileTest.common.AlertScreenBase;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = AlertScreenBase.class)
public class AlertScreen extends AlertScreenBase {
    public AlertScreen(WebDriver driver) {
        super(driver);
    }

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"Thank you for submitting your review!\"`]")
    private ExtendedWebElement alertText;

    @ExtendedFindBy(iosPredicate = "lalalala")
    @Predicate
    private  ExtendedWebElement lala;

    @Override
    public String getAlertText() {
        return alertText.getText();
    }

    @Override
    public void clickContinueAlert() {

    }
}
