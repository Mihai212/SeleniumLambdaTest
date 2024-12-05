import Pages.BasePage;
import Pages.CheckBoxPage;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBoxTests extends BasePage {
    private CheckBoxPage checkBoxPage;
    private static final By CHECK_BOX_DEMO_LINK_TEXT = By.linkText("Checkbox Demo");

    @BeforeMethod
    public void setUp() {
        super.setUp();
        checkBoxPage = new CheckBoxPage(driver);
    }

    @Description("Click On The Single Checkbox Demo")
    @Test(priority = 1)
    public void clickOnTheSingleCheckBox() {
        driver.findElement(CHECK_BOX_DEMO_LINK_TEXT).click();
        checkBoxPage.clickOnSingleCheckBox();

        String actualResult = driver.findElement(By.id("txtAge")).getText();
        Assert.assertTrue(actualResult.contains("Checked"));
        Assert.assertEquals(actualResult, "Checked");
    }

    @Description("Click 'Check All', 'Uncheck All', Option 1, Option 2, Option 3, Option 4 And See If This Functions Work")
    @Test(priority = 2)
    public void clickOnAllOptionsFromMultipleCheckBox() {

        checkBoxPage.clickOnAllowCookiesButtonPageOne();

        driver.findElement(CHECK_BOX_DEMO_LINK_TEXT).click();

        checkBoxPage.clickOnCheckAllButton();
        checkBoxPage.clickOnUncheckAllButton();
        checkBoxPage.clickOnFirstOptionMultipleCheckBox();
        checkBoxPage.clickOnSecondOptionMultipleCheckBox();
        checkBoxPage.clickOnThirdOptionMultipleCheckBox();
        checkBoxPage.clickOnFourthOptionMultipleCheckBox();

            String actualResult1 = driver.findElement(By.cssSelector("#box")).getAccessibleName();
            Assert.assertEquals(actualResult1, "Check All");

        }
}
