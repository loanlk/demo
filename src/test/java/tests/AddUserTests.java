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
                .sendTextToInputControl("firstName",1,"Victoria3")
                .sendTextToInputControl("lastName",1,"Beckham3")
                .sendTextToInputControl("email",1,"vic.beck3@gmail.com")
                .sendTextToInputControl("firstName",2,"Parris3")
                .sendTextToInputControl("lastName",2,"Hilton3")
                .sendTextToInputControl("email",2,"parris.hilton3@gmail.com")
                .clickAddPeople().verifyAddPeopleSuccessfully("check_circle\n" +
                "Congratulations");
    }

}
