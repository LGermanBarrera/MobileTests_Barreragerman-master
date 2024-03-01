package mobileTest.andriod;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import mobileTest.common.DrawingOptionBase;
import mobileTest.common.MenuScreenBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE,parentClass = DrawingOptionBase.class)
public class DrawingOption extends DrawingOptionBase {
    public DrawingOption(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/drawingTV")
    private ExtendedWebElement drawingTitle;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/menuIV")
    private ExtendedWebElement menuIcon;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/clearBtn")
    private ExtendedWebElement clearButton;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/saveBtn")
    private ExtendedWebElement saveButton;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/signature_pad")
    private ExtendedWebElement padToDraw;

    @Override
    public String getDrawingText() {
        return drawingTitle.getText();
    }

    @Override
    public MenuScreenBase clickOnMenu() {
        menuIcon.click();
        return initPage(getDriver(), MenuScreenBase.class);
    }

    @Override
    public void drawLine() {
        padToDraw.click();
    }

    @Override
    public void clickOnClear() {
        clearButton.click();
    }

    @Override
    public void clickOnSave() {
        saveButton.click();
    }
}
