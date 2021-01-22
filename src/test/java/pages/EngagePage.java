package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EngagePage extends BasePage {
    //*********Constructor*********
    public EngagePage(WebDriver driver) {
        super(driver);
    }

    //*[@field='firstName' and @refkey='1']
    //*********Web Elements*********
    By userAndSettingBy = By.xpath("//a[@aria-label='Users and Settings']");

    //*********Page Methods*********
    //Go to Homepage
    public UserPage goToUserPage() {
        click(userAndSettingBy);
        return new UserPage(driver);
    }
}
