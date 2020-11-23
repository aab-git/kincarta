package com.amazon.utilitiies;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader {

    private static Properties properties;

    static {
        try {
            String path = "src/test/resources/amazon_configs.properties";

            FileInputStream input = new FileInputStream(path);

            properties = new Properties();
            properties.load(input);
            input.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty (String key) {

        return properties.getProperty(key);
    }


}
