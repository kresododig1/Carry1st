package Carry1st.Test.pages;

import Carry1st.Test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Carry1stPage {

    public Carry1stPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (css = "a>span.ml-2")
    public WebElement signInButton;

    @FindBy (css = "\"button#wzrk-cancel\"")
    public WebElement cancelPopBtn;

    @FindBy (xpath = "//p[.='Continue with email']")
    public WebElement continueWithEmailLink;

    @FindBy (css = "input#email")
    public WebElement emailInputBox;

    @FindBy (css = "input#password")
    public WebElement passwordInputBox;

    @FindBy (xpath = "//button[.='Sign in']")
    public WebElement signInWithEmailButton;


    @FindBy (css = "div[data-sentry-component='ErrorComponent']")
    public WebElement captchaFailedMessage;

    @FindBy (css = "button#autocomplete-1-label")
    public WebElement searchBox;

    @FindBy (css = "li#autocomplete-1-productsPlugin-item-18>div>div>img")
    public WebElement playStationGiftCardsSuggestion;




}
