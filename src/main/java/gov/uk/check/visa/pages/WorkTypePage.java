package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class WorkTypePage  extends Utility {
    private static final Logger log = LogManager.getLogger(WorkTypePage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Health and care professional']")
    WebElement healthAndCareProvision;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButtonForHealthAndCareProvision;

    // Select have planning to work for 'Health and care professional'
    public void selectHealthAndCareProvisionOption(){
        //waitUntilVisibilityOfElementLocated(healthAndCareProvision, 5);
        clickOnElement(healthAndCareProvision);
        log.info("Select work for 'Health and care professional : " + healthAndCareProvision.toString());
    }
    // Click on Continue button
    public void clickOnContinueButtonForHealthAndCare(){
        clickOnElement(continueButtonForHealthAndCareProvision);
        log.info("click om continue button for healthcare : " + continueButtonForHealthAndCareProvision.toString());
    }
}
