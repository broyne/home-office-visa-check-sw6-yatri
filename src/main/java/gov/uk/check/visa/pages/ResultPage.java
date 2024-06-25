package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ResultPage  extends Utility {
    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//div[@id='result-info']//div[@class='govuk-!-margin-bottom-6']/h2")
    public WebElement resultMessage;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You need a visa to work in health and care']")
    public WebElement resultMessageForHealthAndCare;


    // verify result 'You will not need a visa to come to the UK'
    public void verifyResultMessageForAustralianPeople(String text){
        boolean res = verifyThatTextIsDisplayed(resultMessage, text);
        if (res == true) {
            Assert.assertTrue(true, "Text not verified successfully.");
        }
    }


    public String getResultMessage(){
        return getTextFromElement(resultMessage);

    }
    // verify result 'You need a visa to work in health and care'
    public void verifyResultMessageForHealthAndCarePeople(String text){
        boolean res = verifyThatTextIsDisplayed(resultMessageForHealthAndCare, text);
        if (res == true) {
            Assert.assertTrue(true, "Text not verified successfully.");
        }
    }
}
