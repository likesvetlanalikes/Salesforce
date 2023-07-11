package pages;
import elements.DropDown;
import elements.Input;
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
        new Input(driver, "Website").write(account.getWebsite());
        new DropDown( driver, "Type").selectOption(account.getType());
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