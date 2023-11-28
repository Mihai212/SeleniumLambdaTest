package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KeyPressPage extends BasePage {
    public KeyPressPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "my_field")
    private WebElement textField;

    public void typeInTheTextField(String text) {
        textField.sendKeys(text);
    }
        public void typeInShiftKey(){
            textField.click();
            Actions action1 = new Actions(driver);
            action1.keyDown(Keys.SHIFT).perform();
            }
            public void typeInControlKey(){
        textField.click();
        Actions action2 = new Actions(driver);
        action2.keyDown(Keys.CONTROL).perform();
            }
            public void typeInEnterKey(){
        textField.click();
        Actions action3 = new Actions(driver);
        action3.keyDown(Keys.ENTER).perform();
            }
            public void typeInAltKey(){
        textField.click();
        Actions action4 = new Actions(driver);
        action4.keyDown(Keys.ALT).perform();
            }
            public void typeInBackSpaceKey(){
        textField.click();
        Actions action5= new Actions(driver);
        action5.keyDown(Keys.BACK_SPACE).perform();
            }
            public void typeInF3Key(){
        textField.click();
        Actions action6= new Actions(driver);
        action6.keyDown(Keys.F3).perform();
            }
            public void typeInF10Key(){
        textField.click();
        Actions action7= new Actions(driver);
        action7.keyDown(Keys.F10).perform();
            }
    }