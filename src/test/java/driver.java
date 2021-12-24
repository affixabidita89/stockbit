import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driver {
    protected static WebDriver driver;
    protected WebDriver getDriver(){
        if (driver == null){
            final String dir = System.getProperty("user.dir");
            System.out.println("current dir = " + dir);
            driver = new ChromeDriver();

        }
        return driver;
    }
}
