package mobileTest.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class QRCodeScannerBase extends AbstractPage {
    public QRCodeScannerBase(WebDriver driver) {
        super(driver);
    }

    public abstract String getQRText();

    public abstract MenuScreenBase clickOnMenu();
}
