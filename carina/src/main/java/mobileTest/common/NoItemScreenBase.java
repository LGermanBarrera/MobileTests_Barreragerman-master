package mobileTest.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class NoItemScreenBase extends AbstractPage {
    public NoItemScreenBase(WebDriver driver) {
        super(driver);
    }
    public abstract CatalogHomeScreenBase clickOnGoShoppingButton();

}
