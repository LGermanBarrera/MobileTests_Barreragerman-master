package mobileTest.andriod.service;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import mobileTest.common.SortingProductNameBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = SortingProductNameBase.class)
public class SortingProductName extends SortingProductNameBase {

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/titleTV")
    private ExtendedWebElement productNames;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/LinkedInIV")
    private ExtendedWebElement linkedInIcon;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/priceTV")
    private ExtendedWebElement prices;

    public SortingProductName(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> gettingProductsName() {
        List<WebElement> elements = getDriver().findElements(productNames.getBy());
        return elements;
    }

    @Override
    public List<WebElement> gettingPriceList() {
        List<WebElement> pricesList = getDriver().findElements(prices.getBy());
        return pricesList;
    }
    
    @Override
    public List<String> removeDollarSymbol(List<WebElement> elements) {
        List<String> elementsToString = new ArrayList<>();
        for (WebElement data : elements) {
            elementsToString.add(data.getText().replace("$ ", ""));
        }
        return elementsToString;
    }


    public List<String> sortProductTextsFunction(List<WebElement> elements) {
        List<String> sortedElements = new ArrayList<>();
        for (WebElement data : elements) {
            sortedElements.add(data.getText());
        }
        Collections.sort(sortedElements);
        return sortedElements;
    }

    @Override
    public List<String> parsingWebElementToString(List<WebElement> elements) {
        List<String> firstSortedElements = new ArrayList<>();
        for (WebElement data : elements) {
            firstSortedElements.add(data.getText());
        }
        Collections.sort(firstSortedElements);
        return firstSortedElements;
    }

    @Override
    public List<String> reverseOrderProductTextFunction(List<WebElement> elements) {
        List<String> reverseOrderedElement = new ArrayList<>();
        for (WebElement data : elements) {
            reverseOrderedElement.add(data.getText());
        }
        Collections.sort(reverseOrderedElement, Collections.reverseOrder());
        return reverseOrderedElement;
    }

    @Override
    public void swipeUp() {
        swipe(linkedInIcon);
    }


}
