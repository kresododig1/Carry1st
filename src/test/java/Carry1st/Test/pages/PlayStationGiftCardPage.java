package Carry1st.Test.pages;

import Carry1st.Test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PlayStationGiftCardPage {

    public PlayStationGiftCardPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "div.flex.flex-col.items-start.justify-between")
    public List<WebElement> playStationGiftCards;
}
