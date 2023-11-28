import Pages.BasePage;
import Pages.KeyPressPage;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KeyPressTests extends BasePage {
    private KeyPressPage keyPressPage;
    private static final By KEY_PRESS_LINK_TEXT = By.linkText("Key Press");

    @BeforeMethod
    public void setUp() {
        super.setUp();
        keyPressPage = new KeyPressPage(driver);
    }

    @Description("Write a letter and check the result")
    @Test(priority = 1)
    public void writeALetterAndCheckTheResult() {
        driver.findElement(KEY_PRESS_LINK_TEXT).click();
        keyPressPage.typeInTheTextField("T");

        String actualResult = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(actualResult, "You entered: T");
    }

    @Description("Press 'Space' key in field and check the result ")
    @Test(priority = 2)
    public void pressSpaceAndCheckTheResult() {
        driver.findElement(KEY_PRESS_LINK_TEXT).click();
        keyPressPage.typeInTheTextField(" ");

        String actualResult = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(actualResult, "You entered: SPACE");
    }

    @Description("Press 'Shift' key in field and check the result ")
    @Test(priority = 3)
    public void pressShiftAndCheckTheResult() {
        driver.findElement(KEY_PRESS_LINK_TEXT).click();
        keyPressPage.typeInShiftKey();

        String actualResult = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(actualResult, "You entered: SHIFT");
    }

    @Description("Press 'Control' key in field and check the result ")
    @Test(priority = 4)
    public void pressControlAndCheckTheResult() {
        driver.findElement(KEY_PRESS_LINK_TEXT).click();
        keyPressPage.typeInControlKey();

        String actualResult = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(actualResult, "You entered: CONTROL");
    }

    @Description("Press 'Enter' key in field and check the result ")
    @Test(priority = 5)
    public void pressEnterAndCheckTheResult() {
        driver.findElement(KEY_PRESS_LINK_TEXT).click();
        keyPressPage.typeInEnterKey();

        String actualResult = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(actualResult, "You entered: ENTER");
    }

    @Description("Press 'Alt' key in field and check the result ")
    @Test(priority = 6)
    public void pressAltAndCheckTheResult() {
        driver.findElement(KEY_PRESS_LINK_TEXT).click();
        keyPressPage.typeInAltKey();

        String actualResult = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(actualResult, "You entered: ALT");
    }

    @Description("Write 'Mihai' and check the result")
    @Test(priority = 7)
    public void writeANameAndCheckTheResult() {
        driver.findElement(KEY_PRESS_LINK_TEXT).click();
        keyPressPage.typeInTheTextField("Mihai");

        String actualResult = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(actualResult, "You entered: I");
    }

    @Description("Press 'BACK_SPACE' key in field and check the result ")
    @Test(priority = 8)
    public void pressBackSpaceAndCheckTheResult() {
        driver.findElement(KEY_PRESS_LINK_TEXT).click();
        keyPressPage.typeInBackSpaceKey();

        String actualResult = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(actualResult, "You entered: BACK_SPACE");
    }

    @Description("Press 'F3' key in field and check the result ")
    @Test(priority = 9)
    public void pressF3AndCheckTheResult() {
        driver.findElement(KEY_PRESS_LINK_TEXT).click();
        keyPressPage.typeInF3Key();

        String actualResult = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(actualResult, "You entered: F3");
    }

    @Description("Press 'F10' key in field and check the result ")
    @Test(priority = 10)
    public void pressF10AndCheckTheResult() {
        driver.findElement(KEY_PRESS_LINK_TEXT).click();
        keyPressPage.typeInF10Key();

        String actualResult = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(actualResult, "You entered: F10");
    }
}