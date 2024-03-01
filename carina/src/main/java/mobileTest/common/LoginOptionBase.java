package mobileTest.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class LoginOptionBase extends AbstractPage {
    public LoginOptionBase(WebDriver driver) {
        super(driver);
    }

    public abstract String getLoginText();
    public abstract void setUsername(String username);
    public abstract void setPassword(String password);
    public abstract CatalogHomeScreenBase clickLogin();
}
