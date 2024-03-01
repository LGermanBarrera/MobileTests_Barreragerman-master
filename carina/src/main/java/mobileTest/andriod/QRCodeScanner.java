package mobileTest.andriod;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import mobileTest.common.MenuScreenBase;
import mobileTest.common.QRCodeScannerBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = QRCodeScannerBase.class)
public class QRCodeScanner extends QRCodeScannerBase {


    @FindBy(id = "com.saucelabs.mydemoapp.android:id/qrCodeTV")
    private ExtendedWebElement qrGetText;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/menuIV")
    private ExtendedWebElement menuIcon;

    public QRCodeScanner(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getQRText() {
        return qrGetText.getText();
    }

    @Override
    public MenuScreenBase clickOnMenu() {
       menuIcon.click();
        return initPage(getDriver(), MenuScreenBase.class);
    }
}
