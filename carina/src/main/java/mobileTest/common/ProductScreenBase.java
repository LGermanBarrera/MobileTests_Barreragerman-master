package mobileTest.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class ProductScreenBase extends AbstractPage {
    public ProductScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract ProductDetailsScreenBase clickOnBackPack();

    public abstract ProductDetailsScreenBase clickOnBikeLight();

    public abstract ProductDetailsScreenBase clickOnBoltTShirt();

    public abstract ProductDetailsScreenBase clickOnFleeceTShirt();

    public abstract ProductDetailsScreenBase clickOnOnesieTShirt();

    public abstract ProductDetailsScreenBase clickOnTestTShirt();
}