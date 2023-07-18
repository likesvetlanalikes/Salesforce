package tests;
import models.Account;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.base.BaseTest;


public class AccountsTest extends BaseTest{

    @Test
    public void accountShouldBeCreated() {
        loginPage.open()
                .login("svetlana_040285-mb1s@force.com", "1111111q")
                .clickLoginButton();//login
       accountListPage.open() //open account page
        .clickNewButton();

        Account account = new Account("Test Name","555555","77777","wwww.hhh.ru","Investor",
                "Banking", "5","10 000", "New company", "Lenina",
                "Vitebsk", "210025","Belarus","Belarus","Gorky",
                "Minsk", "Belarus", "123789", "Belarus");
        //заполнить все поля
        accountModalPage.create(account);
        //нажать кнопку save
        Assert.assertEquals(accountDetailsPage.getFieldValue("Account Name"),account.getAccountName());
        Assert.assertEquals(accountDetailsPage.getFieldValue("Phone"),account.getPhone());
        Assert.assertEquals(accountDetailsPage.getFieldValue("Fax"),account.getFax());
        Assert.assertEquals(accountDetailsPage.getFieldValue("Website"),account.getWebSite());
        Assert.assertEquals(accountDetailsPage.getFieldValue("Type"),account.getType());
        Assert.assertEquals(accountDetailsPage.getFieldValue("Industry"),account.getIndustry());
        Assert.assertEquals(accountDetailsPage.getFieldValue("Employees"),account.getEmployees());
        Assert.assertEquals(accountDetailsPage.getFieldValue("Annual Revenue"),account.getAnnualRevenue());
        Assert.assertEquals(accountDetailsPage.getFieldValue("Description"),account.getDescription());
        Assert.assertEquals(accountDetailsPage.getFieldValue("Billing Street"),account.getBillingStreet());
        Assert.assertEquals(accountDetailsPage.getFieldValue("Billing City"),account.getBillingCity());
        Assert.assertEquals(accountDetailsPage.getFieldValue("Billing Zip"),account.getBillingZip());
        Assert.assertEquals(accountDetailsPage.getFieldValue("Billing State"),account.getBillingState());
        Assert.assertEquals(accountDetailsPage.getFieldValue("Billing Country"),account.getBillingCountry());
        Assert.assertEquals(accountDetailsPage.getFieldValue("Shipping Street"),account.getShippingStreet());
        Assert.assertEquals(accountDetailsPage.getFieldValue("Shipping City"),account.getShippingCity());
        Assert.assertEquals(accountDetailsPage.getFieldValue("Shipping State"),account.getShippingState());
        Assert.assertEquals(accountDetailsPage.getFieldValue("Shipping Zip"),account.getShippingZip());
        Assert.assertEquals(accountDetailsPage.getFieldValue("Shipping Country"),account.getShippingCountry());




    }

}
