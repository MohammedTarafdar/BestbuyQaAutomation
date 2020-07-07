package util;

import base.BasePage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Reader extends BasePage {

    public static Properties prop;

    public static void propertyReader(){

        try {
            prop = new Properties();
            FileInputStream fi = new FileInputStream("/MyDevelopment/BestbuyQaAutomation/src/main/java/config/config.properties");
            prop.load(fi);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }



    }



}
