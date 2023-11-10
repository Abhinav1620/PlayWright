package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LocatorRead {
    public static String read(String s) throws IOException {
        Properties properties = new Properties();
        FileInputStream stream = new FileInputStream("src/test/resources/Locators.properties");
        properties.load(stream);
        return properties.getProperty(s);
    }
}