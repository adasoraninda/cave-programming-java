package com.adasoraninda;

import java.io.IOException;
import java.util.Properties;

public class Profile {

    public static Properties getProperties(String name) {
        Properties props = new Properties();

        try {
            String env = System.getProperty("env");

            if (env == null) {
                env = "dev";
            }

            String propertiesPath = String.format("/config/%s.%s.properties", name, env);

            props.load(App.class.getResourceAsStream(propertiesPath));
        } catch (IOException | NullPointerException e) {
            throw new RuntimeException("Can't load properties file");
        }

        return props;

    }

}
