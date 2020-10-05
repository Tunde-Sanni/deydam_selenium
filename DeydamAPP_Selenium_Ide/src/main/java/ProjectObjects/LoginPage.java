package ProjectObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.Driver;

public class LoginPage {

    //In this page we need the field that represent the element and the method of interaction on this Page

    private WebDriver driver;

    /**
     * The constructor is where we pass the driver we used to launch the browser to the current page
     * @param driver this driver is the actual driver that is launched the browser in the setup
     */

    public LoginPage(WebDriver driver)
    {
     this.driver = driver;

    }
    //Using By as a locator for elements
    private By username = By.xpath("//input[@id='username']");

    public void enterUsername(String uName)
    {
        //Find the username element and enter the username
        driver.findElement(username).sendKeys(uName);
    }

    public void enterUserPassword(String pwd)
    {
        WebElement passwordField = driver.findElement(By.xpath("//input[@id=\"password\"]"));
        passwordField.sendKeys(pwd);
    }

     public DashboardPage clickSignBtn(){
     driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/main/div/div[2]/div/div/div/div[2]/div/div/form/button")).click();
     return new DashboardPage(driver);
    }


}
