package org.example.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

import static org.example.constants.FileNames.APPLICATION_PROPERTIES;

public class ConfigLoader {

    public static Properties getProperties() throws IOException {

        String rootPath = Objects.requireNonNull(Thread.currentThread().getContextClassLoader().getResource("")).getPath();
//        String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        String applicationConfigPath = rootPath + APPLICATION_PROPERTIES;

        Properties properties = new Properties();
        properties.load(new FileInputStream(applicationConfigPath));

        return properties;
    }

}
