package stepDefinetion;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class LoginStepDefination {
    WebDriver driver;

    @After
    public void closePage() {
    driver.close();
    }

    @Given("user navigate to login page")
    public void goToLoginPage() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https:www.google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


    @When("user enter valid username and password")
    public void enterUsernameAndPassword() {

    }

    @And("user click on login button")
    public void clickLogin() {


    }

    @Then("user could login successfully to home page")
    public void loggedToHomePage() {

    }


}
