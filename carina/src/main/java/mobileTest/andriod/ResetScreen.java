package mobileTest.andriod;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import mobileTest.common.ResetScreenBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ResetScreenBase.class)
public class ResetScreen extends ResetScreenBase {
    public ResetScreen(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "android:id/button1")
    private ExtendedWebElement oKButton;

    @FindBy(id = "android:id/button1")
    private ExtendedWebElement resetButton;

    @FindBy(id = "android:id/message")
    private ExtendedWebElement okMessage;

    @Override
    public void clickOnOKButton() {
        resetButton.click();
    }

    @Override
    public void clickOnRestAppButton() {
        oKButton.click();
    }

    @Override
    public String getMessageOk() {
        return okMessage.getText();
    }

}
