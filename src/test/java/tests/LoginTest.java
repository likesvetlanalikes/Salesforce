package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class LoginTest extends BaseTest {
    @Test
    public void loginUserNameWithValidData() {


        loginPage.open();
        loginPage.login("svetlana_040285-mb1s@force.com", "1111111q");
        assertTrue(homePage.isPageOpen());

    }
}