package pages;

import base.BasePage;

public class HomePage extends BasePage {




    public void pageTitle(){
        String homePageTitle = driver.getTitle();
        System.out.println(homePageTitle);

    }



}
