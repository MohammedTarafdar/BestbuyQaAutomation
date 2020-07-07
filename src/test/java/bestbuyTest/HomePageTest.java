package bestbuyTest;

import base.BasePage;
import base.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import util.CommonUtil;

public class HomePageTest extends BasePage {




    @BeforeMethod
    public void setup(String url){
        //Driver.initDriver();
        String urlName = prop.getProperty(url);
        driver.get(urlName);

        homePage = new HomePage();

    }



    @Test
    public void verifyPageTitle(){
        homePage.pageTitle();
    }


    @AfterMethod
    public void teardown(){
        CommonUtil.delay(5);
        driver.close();
    }




}
