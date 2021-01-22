package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthPage extends BasePage {
    //*********Constructor*********
    public AuthPage(WebDriver driver) {
        super(driver);
    }

    //*********Page Variables*********
    String baseURL = "https://staging.tinyserver.info/auth";

    //*********Web Elements*********
    By emailBy = By.xpath("//input[@data-cucumber='input-login-email']");
    By passwordBy = By.xpath("//input[@data-cucumber='input-login-password']");
    By continueButtonBy = By.xpath("//div[@data-cucumber='button-continue']");
    By signInButtonBy = By.xpath("//div[@data-cucumber='button-login']");

    //*********Page Methods*********

    //Go to AuthPage
    public AuthPage goToAuthPage() {
        driver.get(baseURL);
        return new AuthPage(driver);
    }

    //Go to Homepage
    public EngagePage goToEngagePage() {
        return new EngagePage(driver);
    }

    //login process
    public AuthPage login(String username, String password) {
        //Enter Email
        writeText(emailBy, username);
        //Click Continue Button
        click(continueButtonBy);
        //Enter Password
        writeText(passwordBy, password);
        //Click Continue Button
        click(signInButtonBy);
        return this;
    }
}
