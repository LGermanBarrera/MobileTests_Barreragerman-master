package mobileTest.andriod;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import mobileTest.common.CatalogHomeScreenBase;
import mobileTest.common.LoginOptionBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = LoginOptionBase.class)
public class LoginScreen extends LoginOptionBase {
    public LoginScreen(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/loginTV")
    private ExtendedWebElement loginText;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/nameET")
    private ExtendedWebElement setUsername;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/passwordET")
    private ExtendedWebElement setPassword;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/loginBtn")
    private ExtendedWebElement loginButton;

    @Override
    public String getLoginText() {
        return loginText.getText();
    }

    @Override
    public void setUsername(String username) {
        setUsername.type(username);
    }

    @Override
    public void setPassword(String password) {
        setPassword.type(password);
    }

    @Override
    public CatalogHomeScreenBase clickLogin() {
        loginButton.click();
        return initPage(getDriver(), CatalogHomeScreenBase.class);
    }
}
