package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {

    public static final String BASE_URL = Config.getUserProperty("baseURL");
    public static String getUserProperty(String propertyName) {
        Properties prop = new Properties();
        try {
            InputStream input = new FileInputStream("src/main/resources/configuration.properties");
            prop.load(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(propertyName);
    }

    public static String getBaseURL(){
        return BASE_URL;
    }
}
