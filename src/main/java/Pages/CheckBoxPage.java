package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class CheckBoxPage extends BasePage {
    //========================================================================
    public CheckBoxPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    //========================================================================
    @FindBy (xpath = "//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")
    private WebElement allowCookiesButtonPageOne;

    public void clickOnAllowCookiesButtonPageOne(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")));
        allowCookiesButtonPageOne.click();
    }
    //========================================================================
    @FindBy(id = "isAgeSelected")
    private WebElement singleCheckBox;

    public void clickOnSingleCheckBox() {
        singleCheckBox.click();
    }

    //==========================================================================
    @FindBy(id = "ex1-check1")
    private WebElement firstOptionMultipleCheckBox;

    public void clickOnFirstOptionMultipleCheckBox() {
        firstOptionMultipleCheckBox.click();
    }

    //==========================================================================
    @FindBy(id = "ex1-check2")
    private WebElement secondOptionMultipleCheckBox;

    public void clickOnSecondOptionMultipleCheckBox() {
        secondOptionMultipleCheckBox.click();
    } //==========================================================================

    @FindBy(id = "ex1-check3")
    private WebElement thirdOptionMultipleCheckBox;

    //==========================================================================
    public void clickOnThirdOptionMultipleCheckBox() {
        thirdOptionMultipleCheckBox.click();
    }

    //==========================================================================
    @FindBy(xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[3]/div[2]/div[1]/div[4]/input")
    private WebElement fourthOptionMultipleCheckBox;

    public void clickOnFourthOptionMultipleCheckBox() {
        fourthOptionMultipleCheckBox.click();
    }

    //==========================================================================
    @FindBy(xpath = "//*[@id=\"box\"]")
    private WebElement checkAllButton;

    public void clickOnCheckAllButton() {
        checkAllButton.click();
    }

    @FindBy(xpath = "//*[@id=\"box\"]")
    private WebElement uncheckAllButton;

    public void clickOnUncheckAllButton() {
        uncheckAllButton.click();
    }
}


