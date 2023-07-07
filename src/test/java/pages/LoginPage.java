
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public static final By USER_NAME = By.id("username");
    public static final By PASSWORD = By.id("password");
    public static final By LOGIN_BUTTON = By.id("Login");


    @Override
    public boolean isPageOpen() {
        return isExist(LOGIN_BUTTON);
    }
    public LoginPage open() {
        driver.get(URL);
        return this;
    }

    public LoginPage login(String userName, String password) {
        driver.findElement(USER_NAME).sendKeys(userName);
        driver.findElement(PASSWORD).sendKeys(password);
        return this;
    }

    public HomePage clickLoginButton(){
        driver.findElement(LOGIN_BUTTON).click();
        return new HomePage(driver);
    }


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void openWebsite() {
        driver.get(URL);
    }
}