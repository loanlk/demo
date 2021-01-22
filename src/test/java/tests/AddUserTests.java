package tests;

import org.testng.annotations.Test;
import pages.AuthPage;

import java.util.Date;

public class AddUserTests extends BaseTest {
    @Test(priority = 0)
    public void invalidLoginTest_InvalidUserNameInvalidPassword() {

        //*************PAGE INSTANTIATIONS*************
        AuthPage authPage = new AuthPage(driver);

        long timeStamp = getTimeStamp();
        //*************PAGE METHODS********************
        authPage.goToAuthPage()
                .login("lemidori16@gmail.com", "D0r@3m0n")
                .goToEngagePage().goToUserPage().goToAddUser()
                .sendTextToInputControl("firstName", 1, "Victoria4" + timeStamp)
                .sendTextToInputControl("lastName", 1, "Beckham4" + timeStamp)
                .sendTextToInputControl("email", 1, "vic.beck" + timeStamp + "@gmail.com")
                .sendTextToInputControl("firstName", 2, "Parris4" + timeStamp)
                .sendTextToInputControl("lastName", 2, "Hilton4" + timeStamp)
                .sendTextToInputControl("email", 2, "parris.hilton" + timeStamp + "@gmail.com")
                .clickAddPeople().verifyAddPeopleSuccessfully("check_circle\n" +
                "Congratulations");
    }

    private long getTimeStamp() {
        Date date = new Date();
        return date.getTime();
    }

}
