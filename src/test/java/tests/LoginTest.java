package tests;

import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

import tests.base.BaseTest;


public class LoginTest extends BaseTest {
    @Test
    public void loginUserWithValidData() {
        boolean isHomePageOpened = loginPage.open()
                .login("svetlana_040285-mb1s@force.com", "1111111q")
                .clickLoginButton()
                .isPageOpen();
        assertTrue(isHomePageOpened);

    }
}