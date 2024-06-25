package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class StartPage  extends Utility {
    private static final Logger log = LogManager.getLogger(StartPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//a[@class ='gem-c-button govuk-button govuk-button--start']")
    WebElement startButton;


    //Click on start button
    public void clickOnStartButton() {
        //given explicit wait
        // waitUntilVisibilityOfElementLocated(startButton, 5);
        clickOnElement(startButton);
        log.info("Click on start button : " + startButton.toString());
    }

}
