import Pages.BasePage;
import Pages.SimpleFormPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SimpleFormTests extends BasePage {

    private SimpleFormPage simpleFormPage;
    private final By simpleFormDemoLink = By.linkText("Simple Form Demo");

    @BeforeMethod
    public void setUp() {
        super.setUp();
        simpleFormPage = new SimpleFormPage(driver);
    }

    //Text

    @Test(priority = 1)
    public void enterMessageAndClickGetCheckedValue() {
        driver.findElement(simpleFormDemoLink).click();
        simpleFormPage.enterTextInTextField("Test");
        simpleFormPage.clickOnGetCheckedValueButton();

        String actualResult1 = driver.findElement(By.id("message")).getText();
        System.out.println(actualResult1);
        Assert.assertTrue(actualResult1.contains("Test"));
    }

    //Caractere speciale/ Simboluri

    @Test(priority = 2)
    public void enterSymbolsAndClickGetCheckedValue() {
        driver.findElement(simpleFormDemoLink).click();
        simpleFormPage.enterTextInTextField("!@#$%^&*()_-+=");
        simpleFormPage.clickOnGetCheckedValueButton();

        String actualResult2 = driver.findElement(By.id("message")).getText();
        System.out.println(actualResult2);
        Assert.assertTrue(actualResult2.contains("!@#$%^&*()_-+="));
    }
    //Numere

    @Test(priority = 3)
    public void enterNumbersAndClickGetCheckedValue() {
        driver.findElement(simpleFormDemoLink).click();
        simpleFormPage.enterTextInTextField("12345");
        simpleFormPage.clickOnGetCheckedValueButton();

        String actualResult3 = driver.findElement(By.id("message")).getText();
        System.out.println(actualResult3);
        Assert.assertTrue(actualResult3.contains("12345"));
    }
    //Spatii

    @Test(priority = 4)
    public void enterSpacesAndClickGetCheckedValue() {
        driver.findElement(simpleFormDemoLink).click();
        simpleFormPage.enterTextInTextField("   ");
        simpleFormPage.clickOnGetCheckedValueButton();

        String actualResult4 = driver.findElement(By.id("message")).getText();
        System.out.println(actualResult4);
        Assert.assertTrue(actualResult4.contains("   "));
    }

    @Test (priority = 5)
    public void enterLettersNumbersAndSymbolsAndClickGetCheckedValue(){
        driver.findElement(simpleFormDemoLink).click();
        simpleFormPage.enterTextInTextField("abcd1234!@#$");
        simpleFormPage.clickOnGetCheckedValueButton();
        String actualResult5 = driver.findElement(By.id("message")).getText();
        System.out.println(actualResult5);
        Assert.assertTrue(actualResult5.contains("abcd1234!@#$"));
    }
    //3 Teste pentru "Two Input Fields"

    @Test(priority = 6)
    public void enterTwoIntegersValuesAndGetTheSum() {
        driver.findElement(simpleFormDemoLink).click();
        simpleFormPage.enterValueInFirstField("5");
        simpleFormPage.enterValueInSecondField("5");
        simpleFormPage.clickOnGetTotalValueButton();

        String actualResult = driver.findElement(By.cssSelector("#addmessage")).getText();
        Assert.assertTrue(actualResult.contains("10"));
    }

    @Test(priority = 7)
    public void enterTwoNegativeIntegersValuesAndGetTheSum() {
        driver.findElement(simpleFormDemoLink).click();
        simpleFormPage.enterValueInFirstField("-3");
        simpleFormPage.enterValueInSecondField("-2");
        simpleFormPage.clickOnGetTotalValueButton();

        String actualResult = driver.findElement(By.cssSelector("#addmessage")).getText();
        Assert.assertTrue(actualResult.contains("-5"));
    }

    @Test(priority = 8)
    public void enterTwoNonIntegersValuesAndGetTheSum() {
        driver.findElement(simpleFormDemoLink).click();
        simpleFormPage.enterValueInFirstField("6.5");
        simpleFormPage.enterValueInSecondField("2.5");
        simpleFormPage.clickOnGetTotalValueButton();

        String actualResult = driver.findElement(By.cssSelector("#addmessage")).getText();
        Assert.assertTrue(actualResult.contains("10"));
    }

    @Test(priority = 9)
    public void enterTwoIntegersValuesInFirstFieldAndTwoIntegersValuesInSecondFieldAndGetTheSum() {
        driver.findElement(simpleFormDemoLink).click();
        simpleFormPage.enterValueInFirstField("2+3");
        simpleFormPage.enterValueInSecondField("6+4");
        simpleFormPage.clickOnGetTotalValueButton();

        String actualResult = driver.findElement(By.cssSelector("#addmessage")).getText();
        Assert.assertTrue(actualResult.contains("15"));
    }

    @Test(priority = 10)
    public void enterNumbersAndSymbolsShouldBeAnError() {
        driver.findElement(simpleFormDemoLink).click();
        simpleFormPage.enterValueInFirstField("1@!3");
        simpleFormPage.enterValueInSecondField("5");
        simpleFormPage.clickOnGetTotalValueButton();

        String actualResult = driver.findElement(By.cssSelector("#addmessage")).getText();
        Assert.assertTrue(actualResult.contains("Entered value is not a number"));
    }

    @Test (priority = 11)
    public void enterSymbolsAndGetASumShouldNotBePossible() {
        driver.findElement(simpleFormDemoLink).click();
        simpleFormPage.enterValueInFirstField("@");
        simpleFormPage.enterValueInSecondField("@");
        simpleFormPage.clickOnGetTotalValueButton();

        String actualResult = driver.findElement(By.cssSelector("#addmessage")).getText();
        Assert.assertTrue(actualResult.contains("Entered value is not a number"));
    }
}