package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ReasonForTravelPage  extends Utility {
    private static final Logger log = LogManager.getLogger(ReasonForTravelPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Tourism or visiting family and friends']")
    WebElement reasonForTourism;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButtonForReason;

    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Work, academic visit or business']")
    WebElement reasonForVisitWorkAcademicVisit;

    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Join partner or family for a long stay']")
    WebElement reasonForVisitJoinPartnerOrFamily;

    @CacheLookup
    @FindBy(xpath = "//input[@name='response']")
    List<WebElement> radioButton;

    // select reason as 'Tourism' dynamically from radio button's list
    public void selectReasonForVisitWithReason(String reason) {
        for (WebElement option : radioButton) {
            if (option.getAttribute("value").equalsIgnoreCase(reason)) {
                option.click();
                break;
            }
        }
    }

    // Select reason 'Tourism'
    public void selectTheOptionTourismForReasonToTravel(){
        clickOnElement(reasonForTourism);
        log.info("Reason for Tourism : " + reasonForTourism.toString());
    }
    // Click on Continue button
    public void clickOnContinueButtonForReasonForTravelling(){
        clickOnElement(continueButtonForReason);
        log.info("Button for Reason : " + continueButtonForReason.toString());
    }
    // Select reason 'Work, academic visit or business'
    public void selectTheOptionForVisitWorkAcademicVisit(){
        clickOnElement(reasonForVisitWorkAcademicVisit);
        log.info("Reason Work Academic visit : " + reasonForVisitWorkAcademicVisit.toString());
    }

    // Select reason 'Join partner or family for a long stay'
    public void selectTheOptionForVisitJoinPartnerOrFamilyForALongStay(){
        clickOnElement(reasonForVisitJoinPartnerOrFamily);
        log.info("Reason for join partner or family : " + reasonForVisitJoinPartnerOrFamily.toString());
    }
}
