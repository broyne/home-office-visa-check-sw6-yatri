package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;
import java.util.Objects;

public class SelectNationalityPage extends Utility {
    private static final Logger log = LogManager.getLogger(SelectNationalityPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
    WebElement selectNationality;

    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
    List<WebElement> countrylist;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(), 'Accept additional cookies')]")
    WebElement acceptCookies;

    @CacheLookup
    @FindBy(css = "button[class='gem-c-button govuk-button gem-c-button--bottom-margin']")
    WebElement continueButton;


    // Select a Nationality 'Australia'
    public void selectNationality(String option) {
        //use explicit wait
        //waitUntilVisibilityOfElementLocated(selectNationality, 5);
        selectByVisibleTextFromDropDown(selectNationality, option);
    }

    // Click on acceptCookies
    public void acceptCookies() {
        clickOnElement(acceptCookies);
        log.info("Accept cookies : " + acceptCookies.toString());
    }

    // Click on Continue button
    public void clickOnContinueButton() {
        clickOnElement(continueButton);
        log.info("Click on continue button : " + acceptCookies.toString());
    }

    public void selectcountry(String option) {
        //System.out.println(option);

        List<WebElement> allcountry = getListOfElements(countrylist);

        for (WebElement e : allcountry) {

            if (Objects.equals(e.getText(), option)) {
                System.out.println(e.getText() + " ===== " + option);
                System.out.println(e.getText());
                break;
                // Assert.assertTrue(e.getText().equalsIgnoreCase(option), option + " Country is not available");
                // System.out.println(allcountry);
            }
        }


       // selectByVisibleTextFromDropDown(selectNationality, option);
    }
}
