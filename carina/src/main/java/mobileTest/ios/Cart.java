package mobileTest.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import mobileTest.common.CartScreenBase;
import mobileTest.common.CatalogHomeScreenBase;
import mobileTest.common.NoItemScreenBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CartScreenBase.class)
public class Cart extends CartScreenBase {
    public Cart(WebDriver driver) {
        super(driver);
    }

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"Go Shopping\"`]")
    private ExtendedWebElement goShoppingButton;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"No Items\"]")
    private ExtendedWebElement itemTitle;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == \"Remove Item\"`]")
    private ExtendedWebElement removeItem;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"1 Items\"`]")
    private ExtendedWebElement numberOfItem;

    @Override
    public NoItemScreenBase clickOnRemove() {
        removeItem.click();
        return initPage(getDriver(), NoItemScreenBase.class);
    }

    @Override
    public void clickToCheckOut() {
    }

    @Override
    public String getNumberOfItem() {
        return numberOfItem.getText();
    }

    @Override
    public CatalogHomeScreenBase clickOnGoShoppingButton() {
        return null;
    }

    @Override
    public String getNoItemTitle() {
        return null;
    }

    @Override
    public void clickOnMinusButton() {

    }


}
