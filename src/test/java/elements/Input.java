package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.AccountModalPage;

public class Input {
    WebDriver driver;
    String label;
    String inputLocator = "//span[text()='%s']/ancestor::div[contains(@class,'uiInput')]//input";
    String inputParentAccount = "//div[@title='TestName']";

    public Input(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }
    public void write(String text){
        driver.findElement(By.xpath(String.format(inputLocator,this.label))).clear();
        driver.findElement(By.xpath(String.format(inputLocator,this.label))).sendKeys(text);
    }
    public void chooseParentAccount(String text){
        driver.findElement(By.xpath(String.format(inputLocator,this.label))).clear();
        driver.findElement(By.xpath(String.format(inputLocator,this.label))).click();
        driver.findElement(By.xpath(String.format(inputParentAccount))).click();

    }
}
