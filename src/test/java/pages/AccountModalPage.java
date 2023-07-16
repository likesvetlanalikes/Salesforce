package pages;
import elements.DropDown;
import elements.Input;
import elements.TextArea;
import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountModalPage extends BasePage{
    public static final By NEW_ACCOUNT_TITLE = By.xpath("//h2[contains@class, 'inLineTitle')]");

    public AccountModalPage(WebDriver driver){
        super(driver);
    }

    public AccountDetailsPage create(Account account){
        new Input(driver, "Account Name").write(account.getAccountName());
        new Input(driver, "Phone").write(account.getPhone());
        new Input(driver, "Fax").write(account.getFax());
        new Input(driver, "Website").write(account.getWebSite());
        new DropDown(driver, "Type").selectOption(account.getType());
        new DropDown(driver, "Industry").selectOption(account.getIndustry());
        new Input(driver, "Employees").write(account.getEmployees());
        new Input(driver, "Annual Revenue").write(account.getAnnualRevenue());
        new TextArea(driver, "Description").write(account.getDescription());
        new TextArea(driver, "Billing Street").write(account.getBillingStreet());
        new Input(driver, "Billing City").write(account.getBillingCity());
        new Input(driver, "Billing State").write(account.getBillingState());
        new Input(driver, "Billing Zip").write(account.getBillingZip());
        new Input(driver, "Billing Country").write(account.getBillingCountry());
        new TextArea(driver, "Shipping Street").write(account.getShippingStreet());
        new Input(driver, "Shipping City").write(account.getShippingCity());
        new Input(driver, "Shipping State").write(account.getShippingState());
        new Input(driver, "Shipping Zip").write(account.getShippingZip());
        new Input(driver, "Shipping Country").write(account.getShippingCountry());
        return clickSave();
    }

    public AccountDetailsPage clickSave(){

        driver.findElement(SAVE_BUTTON).click();
        return  new AccountDetailsPage(driver);
    }

    @Override
    public boolean isPageOpen(){
        return isExist(NEW_ACCOUNT_TITLE);
    }
}



//span[text() = 'Account Name']/ancestor::div[contains(@class, 'uilnput')]//input