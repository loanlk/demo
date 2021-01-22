package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tests.AddUserTests;

public class AddUserPage extends BasePage {
    //*********Constructor*********
    public AddUserPage(WebDriver driver) {
        super(driver);
    }

    //*********Web Elements*********
    By userAndSettingBy = By.xpath("//*[@field='firstName' and @refkey='1']");
    By addPeopleButtonBy = By.xpath(".//span[text()='Add People']");
    By congratulationsIBy = By.xpath(".//div[text()='Congratulations']");

    public AddUserPage sendTextToInputControl(String controlFieldName,int index,String valueInput){
        writeText(By.xpath("//*[@field='"+controlFieldName+"' and @refkey='"+index+"']"),valueInput);
        return new AddUserPage(driver);
    }
    public AddUserPage clickAddPeople(){
        click(addPeopleButtonBy);
        return new AddUserPage(driver);
    }
    //Verify Username Condition
    public AddUserPage verifyAddPeopleSuccessfully (String expectedText) {
        assertEquals(congratulationsIBy, expectedText);
        return this;
    }

}
