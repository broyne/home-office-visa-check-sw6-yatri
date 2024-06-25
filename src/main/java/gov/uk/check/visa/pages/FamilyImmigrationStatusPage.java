package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class FamilyImmigrationStatusPage  extends Utility {
    private static final Logger log = LogManager.getLogger(FamilyImmigrationStatusPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You may need a visa']")
    WebElement mayNeedVisa;

    public void verifyTheMessageThatYouMayNeedVisaToJoinFamilyOrPartner(String text) {
        verifyThatTextIsDisplayed(mayNeedVisa, text);
        log.info("Verify text you may need visa to join family or partner : " + mayNeedVisa.toString());
    }
}
