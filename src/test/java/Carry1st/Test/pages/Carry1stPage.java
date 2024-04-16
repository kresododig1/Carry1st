package Carry1st.Test.pages;

import Carry1st.Test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Carry1stPage {

    public Carry1stPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//a[.='Sign In']")
    public WebElement signInButton;

    @FindBy (xpath = "//p[.='Continue with email']")
    public WebElement continueWithEmailLink;

    @FindBy (css = "input#email")
    public WebElement emailInputBox;

    @FindBy (css = "input#password")
    public WebElement passwordInputBox;

    @FindBy (xpath = "//button[.='Sign in']")
    public WebElement signInWithEmailButton;

    @FindBy (xpath = "//div[text()='Firebase: Error (auth/user-not-found).']")
    public WebElement failedMessage;

}
