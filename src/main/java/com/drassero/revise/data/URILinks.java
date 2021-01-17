package com.drassero.revise.data;

import java.io.IOException;
import java.net.URI;
import java.util.Properties;

public class URILinks {

    private static final Properties URL_PROPERTIES = new Properties();

    static {
        try {
            URL_PROPERTIES.load(URILinks.class.getResourceAsStream("/URLLinks.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static final URI PROJECT_REPOSITORY = URI.create(URL_PROPERTIES.getProperty("project_repository"));

}
