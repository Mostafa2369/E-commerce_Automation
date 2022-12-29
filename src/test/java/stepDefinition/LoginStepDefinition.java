package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.page_object.Login;

import java.util.concurrent.TimeUnit;

public class LoginStepDefinition {
    WebDriver driver;
    Login mLogin;
    @After
    public void closePage() {
    driver.quit();
    }

    @Given("user navigate to login page")
    public void goToLoginPage() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


    @When("user enter \"(.*)\" and \"(.*)\"$")
    public void enterUsernameAndPassword(String username ,String password) {
       mLogin = new Login(driver);
       mLogin.getLogIN().click();
       mLogin.Email().sendKeys(username);
       mLogin.Password().sendKeys(password);

        System.out.println(username+" "+password);

    }

    @And("user click on login button")
    public void clickLogin() {
        mLogin.Submit().click();
    }

    @Then("user could login successfully to home page")
    public void loggedToHomePage() {
        Assert.assertTrue(mLogin.getMyAccount().isDisplayed());
    }


}
