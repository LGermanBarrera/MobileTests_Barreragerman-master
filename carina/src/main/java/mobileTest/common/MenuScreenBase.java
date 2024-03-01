package mobileTest.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class MenuScreenBase extends AbstractPage {
    public MenuScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract AboutOptionBase clickOnAboutOption();
    public abstract String getAboutText();

    public abstract WebViewOptionsBase clickOnWebViewOption();

    public abstract ResetScreenBase clickOnResentAppOption();

    public abstract QRCodeScannerBase clickOnQRScannerOption();

    public abstract PushNotificationOption clickOnPushNotificationOption();

    public abstract LoginOptionBase clickOnLoginOption();

    public abstract GeoLocationOptionBase clickOnGeoLocalizationOption();

    public abstract DrawingOptionBase clickOnDrawingOption();

    public abstract CatalogHomeScreenBase clickOnCatalogOption();

}
