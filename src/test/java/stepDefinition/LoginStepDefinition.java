package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginStepDefinition {
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


    @When("user enter \"(.*)\" and \"(.*)\"$")
    public void enterUsernameAndPassword(String username ,String password) {

        System.out.println(username+" "+password);

    }

    @And("user click on login button")
    public void clickLogin() {


    }

    @Then("user could login successfully to home page")
    public void loggedToHomePage() {

    }


}
