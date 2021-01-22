package tests;

import org.testng.annotations.Test;
import pages.AuthPage;

public class AddUserTests extends BaseTest {
    @Test(priority = 0)
    public void invalidLoginTest_InvalidUserNameInvalidPassword () {

        //*************PAGE INSTANTIATIONS*************
        AuthPage authPage = new AuthPage(driver);

        //*************PAGE METHODS********************
        authPage.goToAuthPage()
                .login("lemidori16@gmail.com", "D0r@3m0n")
                .goToEngagePage().goToUserPage().goToAddUser()
                .sendTextToInputControl("firstName",1,"Victoria4")
                .sendTextToInputControl("lastName",1,"Beckham4")
                .sendTextToInputControl("email",1,"vic.beck4@gmail.com")
                .sendTextToInputControl("firstName",2,"Parris4")
                .sendTextToInputControl("lastName",2,"Hilton4")
                .sendTextToInputControl("email",2,"parris.hilton4@gmail.com")
                .clickAddPeople().verifyAddPeopleSuccessfully("check_circle\n" +
                "Congratulations");
    }

}
