package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.Keys.ENTER;

public class LoginStockbit {
    WebDriver driver;
    @Given("browser is open")
    public void browserIsOpen() {
        final String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);
        System.setProperty("webdriver.chrome.driver", dir+"/driver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @And("user is on login page")
    public void userIsOnLoginPage() throws InterruptedException {
        System.out.println("User on login page");
        driver.get("https://stockbit.com/#/login");
        driver.findElement(By.id("loginbutton")).isDisplayed();
        Thread.sleep(1000);
    }
    @When("user enters username {string}")
    public void userEntersUsername(String arg0) {
        //System.out.println(arg0);
        driver.findElement(By.name("username")).sendKeys(arg0);
    }

    @And("user enters password {string}")
    public void userEntersPassword(String arg1) {
        //System.out.println(arg1);
        driver.findElement(By.name("password")).sendKeys(arg1);
    }

    @And("user click on login")
    public void userClickOnLogin() throws InterruptedException {
        System.out.println("User click login button");
        driver.findElement(By.id("loginbutton")).click();
        Thread.sleep(1000);
    }

    @Then("user is navigated to the home page")
    public void userIsNavigatedToTheHomePage() throws InterruptedException {
        System.out.println("User on Homepage");
        driver.findElement(By.id("homeLink")).isDisplayed();
        System.out.println(driver.findElement(By.id("homeLink")).isDisplayed());
        driver.close();
        driver.quit();
    }

}
