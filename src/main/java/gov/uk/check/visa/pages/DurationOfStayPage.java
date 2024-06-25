package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DurationOfStayPage extends Utility {
    private static final Logger log = LogManager.getLogger(DurationOfStayPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='longer than 6 months']")
    WebElement durationOfStay;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement durationOfStayContinueButton;

    // Select intended to stay for 'longer than 6 months'
    public void clickOnRadioButtonForLongerThanSixMonth(){
        clickOnElement(durationOfStay);
        log.info("Duration of stay : " + durationOfStay.toString());
    }

    // Click on Continue button
    public void clickOnContinueButtonForDurationOfStay(){
        clickOnElement(durationOfStayContinueButton);
        log.info("Click on continue button for duration of stay : " + durationOfStayContinueButton.toString());
    }
}
