package Carry1st.Test.step_definition;

import Carry1st.Test.pages.Carry1stPage;
import Carry1st.Test.pages.PlayStationGiftCardPage;
import Carry1st.Test.utilities.BrowserUtils;
import Carry1st.Test.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Carry1st_StepDefinitions {

    Carry1stPage carry1stPage = new Carry1stPage();

    @Given("user is on home page of Carry1st web application")
    public void user_is_on_home_page_of_carry1st_web_application() {

        Driver.getDriver().get("https://shop.carry1st.com/");
        //BrowserUtils.sleep(1);
        try {
            // Wait up to 5 seconds for the button to appear
            WebDriverWait shortWait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
            WebElement regionOptionBtn = shortWait.until(
                    ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(., 'Ignore')]"))
            );
            regionOptionBtn.click();
            System.out.println("'Ignore' button found, continuing with clicking on it");
        } catch (TimeoutException e) {
            // Button didn't appear within 5 seconds, continue with the rest of the code
            System.out.println("'Ignore' button not found, continuing without clicking it");
        }

    }
    @When("user clicks on Sign In button")
    public void user_clicks_on_sign_in_button() {

        BrowserUtils.sleep(2);
        BrowserUtils.humanLikeClick(carry1stPage.signInButton);


    }
    @When("user clicks CONTINUE WITH EMAIL button")
    public void user_clicks_continue_with_email_button() {


        try {
            WebDriverWait shortWait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
            WebElement stayInformedBtn = shortWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button#wzrk-cancel")));
            stayInformedBtn.click();
        } catch (TimeoutException e){
            System.out.println("\"Shop Smart, Stay informed\" message did not \"Pop up!!!\"");
        }
        BrowserUtils.humanLikeClick(carry1stPage.continueWithEmailLink);

    }
    @And("user enters {string} and {string} and clicks SIGN IN button")
    public void userEntersAndAndClicksSIGNINButton(String email, String password) {


        try {
            WebDriverWait shortWait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
            WebElement stayInformedBtn = shortWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button#wzrk-cancel")));
            BrowserUtils.sleep(3);
            stayInformedBtn.click();
        } catch (TimeoutException e){
            System.out.println("\"Shop Smart, Stay informed\" message did not \"Pop up!!!\"");
        }
        BrowserUtils.sleep(1);
        carry1stPage.emailInputBox.sendKeys(email);
        BrowserUtils.sleep(1);
        carry1stPage.passwordInputBox.sendKeys(password);
        BrowserUtils.sleep(1);

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(carry1stPage.signInWithEmailButton));
        carry1stPage.signInWithEmailButton.click();
    }



    @Then("user should see following message {string}")
    public void user_should_see_following_message(String errorMessage) {

        String actualFailedMessage = carry1stPage.captchaFailedMessage.getText();
        Assert.assertEquals("Message is NOT correct!", errorMessage, actualFailedMessage);

    }

    PlayStationGiftCardPage playStationGiftCardPage = new PlayStationGiftCardPage();

    @When("user enters {string} in search box")
    public void user_enters_in_search_box(String searchItem) {

        new Actions(Driver.getDriver()).click(carry1stPage.searchBox).sendKeys(searchItem).perform();
        BrowserUtils.sleep(1);




    }
    @When("user clicks on {string} in search suggestions")
    public void user_clicks_on_in_search_suggestions(String string) {
        carry1stPage.playStationGiftCardsSuggestion.click();


    }


    @Then("user should see options for vouchers with different prices")
    public void userShouldSeeOptionsForVouchersWithDifferentPrices(List<String> expectedPrices) {

        List<String> actualPrices = new ArrayList<>();

        for (WebElement eachCard : playStationGiftCardPage.playStationGiftCards) {
            actualPrices.add(eachCard.getText());
        }

        System.out.println("actualPrices = " + actualPrices);
        System.out.println("expectedPrices = " + expectedPrices);

        Assert.assertEquals("Cards prices are NOT matching", expectedPrices, actualPrices);
    }
}
