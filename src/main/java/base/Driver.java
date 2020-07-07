package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import util.Reader;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Driver {

    public static WebDriver driver;
    public static Properties prop;


    public Driver(){
        Reader.propertyReader();
    }

    /*
    public static void main(String[] args) {
        Driver.initDriver();
        driver.get("https://www.bestbuy.com");


    }
    */

    public static WebDriver initDriver() {


       // WebDriverManager.chromedriver().setup();
        //driver = new ChromeDriver();


        String browserName = prop.getProperty("browser");


        if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.chromedriver().setup();
            driver = new FirefoxDriver();
        } else {
            System.out.println("Please check your browser name");
        }



        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        return driver;

    }

    @BeforeClass
    public void launchBrowser(){
        Driver.initDriver();
    }



    @AfterClass
    public void quiteBrowser(){
        driver.quit();
    }








}
