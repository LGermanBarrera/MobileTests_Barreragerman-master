package mobileTest.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = AbstractPage.class)
public class NoItem extends AbstractPage {
    public NoItem(WebDriver driver) {
        super(driver);
    }

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"Go Shopping\"`]")
    private ExtendedWebElement goShoppingButton;

//    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"No Items\"`]")
//    private ExtendedWebElement noItemTitle;

  

   
}
