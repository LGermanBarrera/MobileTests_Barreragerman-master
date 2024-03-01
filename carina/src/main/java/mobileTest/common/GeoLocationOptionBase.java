package mobileTest.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class GeoLocationOptionBase extends AbstractPage {
    public GeoLocationOptionBase(WebDriver driver) {
        super(driver);
    }

    public abstract String getGeoLocationTitle();

    public abstract MenuScreenBase clickOnMenu();
}
