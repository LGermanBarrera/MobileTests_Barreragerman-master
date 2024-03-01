package mobileTest.common;

import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class DrawingOptionBase extends AbstractPage implements IMobileUtils {
    public DrawingOptionBase(WebDriver driver) {
        super(driver);
    }

    public abstract String getDrawingText();

    public abstract MenuScreenBase clickOnMenu();

    public abstract void drawLine();

    public abstract void clickOnClear();

    public abstract void clickOnSave();


}
