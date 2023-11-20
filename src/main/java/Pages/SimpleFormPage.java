package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SimpleFormPage extends BasePage {
    public SimpleFormPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    //==========================================================================

    @FindBy(css = "input[placeholder='Please enter your Message']")
    private WebElement textField;

    public void enterTextInTextField(String text) {
        textField.sendKeys(text);
    }

    @FindBy(id = "message")
    private WebElement checkMessage;

    public void checkYourMessage() {
        checkMessage.getText();
    }

    @FindBy(id = "showInput")
    private WebElement getCheckedValueButton;

    public void clickOnGetCheckedValueButton() {
        getCheckedValueButton.click();
    }


    //"Two Input" Fields Base Tests

    @FindBy(css = "input[placeholder='Please enter first value']")
    private WebElement firstField;

    public void enterValueInFirstField(String firstValue) {
        firstField.sendKeys(firstValue);
    }

    @FindBy(css = "input[placeholder='Please enter second value']")
    private WebElement SecondField;

    public void enterValueInSecondField(String secondValue) {
        SecondField.sendKeys(secondValue);
    }

    @FindBy(id = "sum1")
    private WebElement checkFirstValue;

    @FindBy(id = "sum2")
    private WebElement checkSecondValue;

    @FindBy(css= "addmessage")
    private WebElement checkAddMessage;

    public void checkYourAddMessage() {
        checkAddMessage.getText();
    }

    @FindBy(xpath = "//*[@id='gettotal']/button")
    private WebElement getTotalValueButton;

    public void clickOnGetTotalValueButton() {
        getTotalValueButton.click();
    }
}

