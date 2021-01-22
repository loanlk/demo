package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserPage extends BasePage {
    //*********Constructor*********
    public UserPage(WebDriver driver) {
        super(driver);
    }

    //*********Web Elements*********
    By addPeopleBy = By.xpath("//a[@href='/invite']");

    //*********Page Methods*********
    //Go to Homepage
    public AddUserPage goToAddUser() {
        click(addPeopleBy);
        return new AddUserPage(driver);
    }
}
