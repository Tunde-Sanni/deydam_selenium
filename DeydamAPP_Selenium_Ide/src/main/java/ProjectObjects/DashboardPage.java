package ProjectObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    //Create a webDriver for this Class

    private WebDriver driver;

    //Create a constructor

    public DashboardPage(WebDriver driver) {
        this.driver = driver;

    }

    //Locate elements
    private By username = By.xpath("//*[@id=\"root\"]/div/div/div/main/div/div[1]/div[1]/div/div[2]/div[3]/button[1]");
    private By logout = By.xpath("//*[@id=\"root\"]/div/div/div/main/div/div[1]/div[1]/div/div[2]/div[3]/div/div/a[3]/p");

    //Functions to interact with elements

    public void clickUsername() throws InterruptedException {
        //wait for 10 seconds before executing the action
        Thread.sleep(1000);
        driver.findElement(username).click();

    }

    public LoginPage clickLogout() throws InterruptedException {
        //wait for 3 seconds before executing the
        Thread.sleep(3000);
        driver.findElement(logout).click();
        return new LoginPage(driver);


    }

}

