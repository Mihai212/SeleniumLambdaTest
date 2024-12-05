import Pages.BasePage;
import Pages.RadioButtonPage;
import Pages.SimpleFormPage;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//==========================================================================
public class RadioButtonTests extends BasePage {
    private RadioButtonPage radioButtonPage;
    private final By RADIO_BUTTONS_DEMO_LINK = By.linkText("Radio Buttons Demo");

    @BeforeMethod
    public void setUp() {
        super.setUp();
        radioButtonPage = new RadioButtonPage(driver);
    }

    //==========================================================================
    @Description("Click On Male Radio Button And Click On Get Value Button And See The Result")
    @Test(priority = 1)
    public void clickOnMaleRadioButtonAndGetValueButtonAndSeeTheResult() {
        radioButtonPage.clickOnAllowCookiesButtonPageOne();

        driver.findElement(RADIO_BUTTONS_DEMO_LINK).click();

        radioButtonPage.clickOnMaleRadioButton();
        radioButtonPage.cickOnGetValueButton();

        String actualresult = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[1]/div/p[2]")).getText();
        Assert.assertEquals(actualresult, "Radio button 'Male' is checked");
    }

    @Description("Click On Female Radio Button And Click On Get Value Button And See The Result")
    @Test(priority = 2)
    public void clickOnFemaleRadioButtonAndGetValueButtonAndSeeTheResult() {
        radioButtonPage.clickOnAllowCookiesButtonPageOne();

        driver.findElement(RADIO_BUTTONS_DEMO_LINK).click();

        radioButtonPage.clickOnFemaleRadioButton();
        radioButtonPage.cickOnGetValueButton();

        String actualresult = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[1]/div/p[2]")).getText();
        Assert.assertEquals(actualresult, "Radio button 'Female' is checked");
    }

    @Description("Click On 'Radio Button 1', 'Radio Button 2' & 'Disabled Radio Button' From 'Disabled Radio Button And See If It Works")
    @Test(priority = 3)
    public void clickOnRadioButtonsFromDisabledRadioButtonAndSeeIfItWorks() {
        radioButtonPage.clickOnAllowCookiesButtonPageOne();

        driver.findElement(RADIO_BUTTONS_DEMO_LINK).click();

        radioButtonPage.clickOnradioButton1OptionFromDisabledRadioButton();
        radioButtonPage.clickOnradioButton2OptionFromDisabledRadioButton();
        radioButtonPage.clickOnDisabledRadioButtonOptionFromDisabledRadioButton();

        String actualresult = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[2]/div/div/div/div[3]/label")).getText();
        Assert.assertEquals(actualresult, "Disabled Radio Button");
    }

    @Description("Select Gender:Male & Select Age:0 to 5 And Click On Get Values Button")
    @Test(priority = 4)
    public void clickOnMaleGenderAnd0To5AgeAndClickOnGetValuesButton() {
        radioButtonPage.clickOnAllowCookiesButtonPageOne();

        driver.findElement(RADIO_BUTTONS_DEMO_LINK).click();

        radioButtonPage.clickOnMaleGenderFromClickOnButtonToGetTheSelectedValuesFromGenderAndAge();
        radioButtonPage.clickOnAge0To5FromClickOnButtonToGetTheSelectedValuesFromGenderAndAge();
        radioButtonPage.clickOnGetValuesFromClickOnButtonToGetTheSelectedValuesFromGenderAndAge();

        String actualResult1 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[1]/span")).getText();
        String actualResult2 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[2]/span")).getText();

        Assert.assertEquals(actualResult1, "Male");
        Assert.assertEquals(actualResult2, "0 - 5");
    }

    @Description("Select Gender:Male & Select Age:5 to 15 And Click On Get Values Button")
    @Test(priority = 5)
    public void clickOnMaleGenderAnd5To15AgeAndClickOnGetValuesButton() {
        radioButtonPage.clickOnAllowCookiesButtonPageOne();

        driver.findElement(RADIO_BUTTONS_DEMO_LINK).click();

        radioButtonPage.clickOnMaleGenderFromClickOnButtonToGetTheSelectedValuesFromGenderAndAge();
        radioButtonPage.clickOnAge5To15FromClickOnButtonToGetTheSelectedValuesFromGenderAndAge();
        radioButtonPage.clickOnGetValuesFromClickOnButtonToGetTheSelectedValuesFromGenderAndAge();

        String actualResult1 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[1]/span")).getText();
        String actualResult2 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[2]/span")).getText();

        Assert.assertEquals(actualResult1, "Male");
        Assert.assertEquals(actualResult2, "5 - 15");

    }

    @Description("Select Gender:Male & Select Age:15 to 50 And Click On Get Values Button")
    @Test(priority = 6)
    public void clickOnMaleGenderAnd15To50AgeAndClickOnGetValuesButton() {
        radioButtonPage.clickOnAllowCookiesButtonPageOne();

        driver.findElement(RADIO_BUTTONS_DEMO_LINK).click();

        radioButtonPage.clickOnMaleGenderFromClickOnButtonToGetTheSelectedValuesFromGenderAndAge();
        radioButtonPage.clickOnAge15To50FromClickOnButtonToGetTheSelectedValuesFromGenderAndAge();
        radioButtonPage.clickOnGetValuesFromClickOnButtonToGetTheSelectedValuesFromGenderAndAge();

        String actualResult1 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[1]/span")).getText();
        String actualResult2 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[2]/span")).getText();

        Assert.assertEquals(actualResult1, "Male");
        Assert.assertEquals(actualResult2, "15 - 50");
    }

    @Description("Select Gender:Female & Select Age:0 to 5 And Click On Get Values Button")
    @Test(priority = 7)
    public void clickOnFemaleGenderAnd0To5AgeAndClickOnGetValuesButton() {
        radioButtonPage.clickOnAllowCookiesButtonPageOne();

        driver.findElement(RADIO_BUTTONS_DEMO_LINK).click();

        radioButtonPage.clickOnFemaleGenderFromClickOnButtonToGetTheSelectedValuesFromGenderAndAge();
        radioButtonPage.clickOnAge0To5FromClickOnButtonToGetTheSelectedValuesFromGenderAndAge();
        radioButtonPage.clickOnGetValuesFromClickOnButtonToGetTheSelectedValuesFromGenderAndAge();

        String actualResult1 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[1]/span")).getText();
        String actualResult2 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[2]/span")).getText();

        Assert.assertEquals(actualResult1, "Female");
        Assert.assertEquals(actualResult2, "0 - 5");
    }

    @Description("Select Gender:Female & Select Age:5 to 15 And Click On Get Values Button")
    @Test(priority = 8)
    public void clickOnFemaleGenderAnd5To15AgeAndClickOnGetValuesButton() {

        radioButtonPage.clickOnAllowCookiesButtonPageOne();

        driver.findElement(RADIO_BUTTONS_DEMO_LINK).click();
        radioButtonPage.clickOnFemaleGenderFromClickOnButtonToGetTheSelectedValuesFromGenderAndAge();
        radioButtonPage.clickOnAge5To15FromClickOnButtonToGetTheSelectedValuesFromGenderAndAge();
        radioButtonPage.clickOnGetValuesFromClickOnButtonToGetTheSelectedValuesFromGenderAndAge();

        String actualResult1 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[1]/span")).getText();
        String actualResult2 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[2]/span")).getText();

        Assert.assertEquals(actualResult1, "Female");
        Assert.assertEquals(actualResult2, "5 - 15");
    }

    @Description("Select Gender:Female & Select Age:15 to 50 And Click On Get Values Button")
    @Test(priority = 9)
    public void clickOnFemaleGenderAnd15To50AgeAndClickOnGetValuesButton() {
        radioButtonPage.clickOnAllowCookiesButtonPageOne();

        driver.findElement(RADIO_BUTTONS_DEMO_LINK).click();

        radioButtonPage.clickOnFemaleGenderFromClickOnButtonToGetTheSelectedValuesFromGenderAndAge();
        radioButtonPage.clickOnAge15To50FromClickOnButtonToGetTheSelectedValuesFromGenderAndAge();
        radioButtonPage.clickOnGetValuesFromClickOnButtonToGetTheSelectedValuesFromGenderAndAge();

        String actualResult1 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[1]/span")).getText();
        String actualResult2 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[2]/span")).getText();

        Assert.assertEquals(actualResult1, "Female");
        Assert.assertEquals(actualResult2, "15 - 50");
    }

    @Description("Select Gender:Other & Select Age:0 to 5 And Click On Get Values Button")
    @Test(priority = 10)
    public void clickOnOtherGenderAnd0To5AgeAndClickOnGetValuesButton() {

        radioButtonPage.clickOnAllowCookiesButtonPageOne();

        driver.findElement(RADIO_BUTTONS_DEMO_LINK).click();
        radioButtonPage.clickOnOtherGenderFromClickOnButtonToGetTheSelectedValuesFromGenderAndAge();
        radioButtonPage.clickOnAge0To5FromClickOnButtonToGetTheSelectedValuesFromGenderAndAge();
        radioButtonPage.clickOnGetValuesFromClickOnButtonToGetTheSelectedValuesFromGenderAndAge();

        String actualResult1 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[1]/span")).getText();
        String actualResult2 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[2]/span")).getText();

        Assert.assertEquals(actualResult1, "Other");
        Assert.assertEquals(actualResult2, "0 - 5");
    }

    @Description("Select Gender:Other & Select Age:5 to 15 And Click On Get Values Button")
    @Test(priority = 11)
    public void clickOnOtherGenderAnd5To15AgeAndClickOnGetValuesButton() {
        radioButtonPage.clickOnAllowCookiesButtonPageOne();

        driver.findElement(RADIO_BUTTONS_DEMO_LINK).click();

        radioButtonPage.clickOnOtherGenderFromClickOnButtonToGetTheSelectedValuesFromGenderAndAge();
        radioButtonPage.clickOnAge5To15FromClickOnButtonToGetTheSelectedValuesFromGenderAndAge();
        radioButtonPage.clickOnGetValuesFromClickOnButtonToGetTheSelectedValuesFromGenderAndAge();

        String actualResult1 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[1]/span")).getText();
        String actualResult2 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[2]/span")).getText();

        Assert.assertEquals(actualResult1, "Other");
        Assert.assertEquals(actualResult2, "5 - 15");
    }

    @Description("Select Gender:Other & Select Age:15 to 50 And Click On Get Values Button")
    @Test(priority = 12)
    public void clickOnOtherGenderAnd15To50AgeAndClickOnGetValuesButton() {
        radioButtonPage.clickOnAllowCookiesButtonPageOne();

        driver.findElement(RADIO_BUTTONS_DEMO_LINK).click();

        radioButtonPage.clickOnOtherGenderFromClickOnButtonToGetTheSelectedValuesFromGenderAndAge();
        radioButtonPage.clickOnAge15To50FromClickOnButtonToGetTheSelectedValuesFromGenderAndAge();
        radioButtonPage.clickOnGetValuesFromClickOnButtonToGetTheSelectedValuesFromGenderAndAge();

        String actualResult1 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[1]/span")).getText();
        String actualResult2 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[2]/span")).getText();

        Assert.assertEquals(actualResult1, "Other");
        Assert.assertEquals(actualResult2, "15 - 50");
    }
}