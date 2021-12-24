package StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Help {
    WebDriver driver;
    @Given("I navigate to the {string}")
    public void iNavigateToThe(String arg0) throws InterruptedException {
        final String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);
        System.setProperty("webdriver.chrome.driver", dir+"/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://help.stockbit.com/id/");
        Thread.sleep(1000);
    }

    @Then("I should see Help Page")
    public void iShouldSeeHelpPage() {
        System.out.println("Berada di Help Page");
        driver.findElement(By.name("search_query")).isDisplayed();
        System.out.println(driver.findElement(By.name("search_query")).isDisplayed());
        driver.close();
        driver.quit();
    }
}
