package Login;

import ProjectObjects.DashboardPage;
import Setup.SetUpTests;
import org.testng.annotations.Test;

public class LoginTests extends SetUpTests {


    //Test Annotation
 @Test

    public void testLogin() throws InterruptedException
 {

  String username ="shile";
  loginPage.enterUsername(username);
  loginPage.enterUserPassword( "SEXXY007");

  // Handler for dashboard page
     DashboardPage dashboardPage = loginPage.clickSignBtn();
     dashboardPage.clickUsername();
     loginPage = dashboardPage.clickLogout();

 }

}
