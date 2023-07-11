package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountDetailsPage extends BasePage{

    String fieldValue = "//span[text() = '%s']/ancestor::records-record-layout-item//span[contains(@class, 'field-value')]";
    public static final By DETAILS_LINK =By.xpath("://a[@data-label='Details'] ");
    public AccountDetailsPage(WebDriver driver) {
        super(driver);
    }

    public String getFieldValue( String fieldName){
        return driver.findElement(By.xpath(String.format(fieldValue, fieldName))).getText();
    }

    @Override
    public boolean isPageOpen() {
        return isExist(DETAILS_LINK);
    }
}
