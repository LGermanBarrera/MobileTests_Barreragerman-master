package mobileTest.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class RemoveProductFromCart extends AbstractPage {
    public RemoveProductFromCart(WebDriver driver) {
        super(driver);
    }

    public abstract void clickOnRemove();

    public abstract void clickOnGoShopping();

}
