package Setup;

import ProjectObjects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class SetUpTests {
    //Create a WebDriver object

    private WebDriver driver;

    //Create LoginPage object
    protected LoginPage loginPage;

   @BeforeTest
   public void setUp(){

       //Selenium driver needs to be executable inorder to know which browser to run your test
       //Browser setup for chrome
       System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

       //Instantiate WebDriver object
       driver =new ChromeDriver();

       //All Automation can now be done using this driver
       driver.manage().window().maximize();

       //launch the application
       driver.get("https://dev.d2rxvhrryr2bkn.amplifyapp.com/login");

       //Instantiate login page after launching the browser - Handle
       loginPage =new LoginPage(driver);

   }
      @AfterTest
      public void closeBrowser()
      {
          //".close" would close the windows but the ".quit" will exist the session
          driver.quit();

      }

}
