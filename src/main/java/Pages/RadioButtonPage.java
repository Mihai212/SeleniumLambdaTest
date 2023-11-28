package Pages;

import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//==========================================================================
public class RadioButtonPage extends BasePage {
    public RadioButtonPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
//==========================================================================

    @FindBy(xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[1]/div/label[1]/input")
    private WebElement maleRadioButton;

    public void clickOnMaleRadioButton() {
        maleRadioButton.click();
    }

    @FindBy(id = "buttoncheck")
    private WebElement getValueButton;

    public void cickOnGetValueButton() {
        getValueButton.click();
    }

    @FindBy(xpath = "//*[@id=\"buttoncheck\"]")
    private WebElement theResultOfGetValueButtonMaleOption;

    public void getMaleOptionResult() {
        theResultOfGetValueButtonMaleOption.getText();
    }

    @FindBy(xpath = "//*[@id=\"__next\"]/div/section[2]/div/div/div/div[1]/div/label[2]/input")
    private WebElement femaleRadioButton;

    public void clickOnFemaleRadioButton() {
        femaleRadioButton.click();
    }

    @FindBy(xpath = "//*[@id=\"__next\"]/div/section[2]/div/div/div/div[1]/div/p[2]")
    private WebElement getResultOfTheFemaleOption;

    public void getFemaleOptionResult() {
        getResultOfTheFemaleOption.getText();
    }

    @FindBy(xpath = "//*[@id=\"__next\"]/div/section[2]/div/div/div/div[2]/div/div/div/div[1]/label/input")
    private WebElement radioButton1OptionFromDisabledRadioButton;

    public void clickOnradioButton1OptionFromDisabledRadioButton() {
        radioButton1OptionFromDisabledRadioButton.click();
    }

    @FindBy(xpath = "//*[@id=\"__next\"]/div/section[2]/div/div/div/div[2]/div/div/div/div[2]/label/input")
    private WebElement radioButton2OptionFromDisabledRadioButton;

    public void clickOnradioButton2OptionFromDisabledRadioButton() {
        radioButton2OptionFromDisabledRadioButton.click();
    }

    @FindBy(xpath = "//*[@id=\"__next\"]/div/section[2]/div/div/div/div[2]/div/div/div/div[3]/label/input")
    private WebElement disabledRadioButtonOptionFromDisabledRadioButton;

    public void clickOnDisabledRadioButtonOptionFromDisabledRadioButton() {
        disabledRadioButtonOptionFromDisabledRadioButton.click();
    }

    @FindBy(xpath = "//*[@id=\"__next\"]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[1]/label[1]/input")
    private WebElement maleGenderFromClickOnButtonToGetTheSelectedValuesFromGenderAndAge;

    public void clickOnMaleGenderFromClickOnButtonToGetTheSelectedValuesFromGenderAndAge() {
        maleGenderFromClickOnButtonToGetTheSelectedValuesFromGenderAndAge.click();
    }

    @FindBy(xpath = "//*[@id=\"__next\"]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[1]/label[2]/input")
    private WebElement femaleGenderFromClickOnButtonToGetTheSelectedValuesFromGenderAndAge;

    public void clickOnFemaleGenderFromClickOnButtonToGetTheSelectedValuesFromGenderAndAge() {
        femaleGenderFromClickOnButtonToGetTheSelectedValuesFromGenderAndAge.click();
    }

    @FindBy(xpath = "//*[@id=\"__next\"]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[1]/label[3]/input")
    private WebElement otherGenderFromClickOnButtonToGetTheSelectedValuesFromGenderAndAge;

    public void clickOnOtherGenderFromClickOnButtonToGetTheSelectedValuesFromGenderAndAge() {
        otherGenderFromClickOnButtonToGetTheSelectedValuesFromGenderAndAge.click();
    }

    @FindBy(xpath = "//*[@id=\"__next\"]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[2]/label[1]/input")
    private WebElement age0To5FromClickOnButtonToGetTheSelectedValuesFromGenderAndAge;

    public void clickOnAge0To5FromClickOnButtonToGetTheSelectedValuesFromGenderAndAge() {
        age0To5FromClickOnButtonToGetTheSelectedValuesFromGenderAndAge.click();
    }
    @FindBy (xpath = "//*[@id=\"__next\"]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[2]/label[2]/input")
    private WebElement age5To15FromClickOnButtonToGetTheSelectedValuesFromGenderAndAge;

    public void clickOnAge5To15FromClickOnButtonToGetTheSelectedValuesFromGenderAndAge(){
        age5To15FromClickOnButtonToGetTheSelectedValuesFromGenderAndAge.click();
    }
    @FindBy (xpath = "//*[@id=\"__next\"]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[2]/label[3]/input")
    private WebElement age15To50FromClickOnButtonToGetTheSelectedValuesFromGenderAndAge;

    public void clickOnAge15To50FromClickOnButtonToGetTheSelectedValuesFromGenderAndAge(){
        age15To50FromClickOnButtonToGetTheSelectedValuesFromGenderAndAge.click();
    }
    @FindBy (xpath = "//*[@id=\"__next\"]/div/section[2]/div/div/div/div[3]/div/div/div[1]/button")
    private WebElement getValuesFromClickOnButtonToGetTheSelectedValuesFromGenderAndAge;

    public void clickOnGetValuesFromClickOnButtonToGetTheSelectedValuesFromGenderAndAge(){
        getValuesFromClickOnButtonToGetTheSelectedValuesFromGenderAndAge.click();
    }

}

