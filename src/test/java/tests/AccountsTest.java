package tests;

import models.Account;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class AccountsTest extends BaseTest{

    @Test
    public void accountShouldBeCreated() {
        loginPage.open()
                .login("svetlana_040285-mb1s@force.com", "1111111q")
                .clickLoginButton();//login
       accountListPage.open() //open account page
        .clickNewButton();

               Account account = new Account("TestName", "www.onliner.by", "Investor"); //clickNew Button
               accountModalPage.create(account);

               assertEquals(accountDetailsPage.getFieldValue("Account Name", account.getAccountName());
               assertEquals(accountDetailsPage.getFieldValue("Website", account.getWebsite());
        assertEquals(accountDetailsPage.getFieldValue("Account Name", account.getAccountName());//fullfill the fields
        // click button Save
        // check the existence of the account
    }
}
