package javaProperty;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class JavaPropertyReader {

    private static String FULL_NAME;
    private static String EMAIL;

    private JavaPropertyReader() throws IOException
    {
        Properties props = new Properties();
        props.load(new FileInputStream(new File("src/main/resources/property.ini")));

        FULL_NAME = props.getProperty("FULL_NAME");
        EMAIL = props.getProperty("EMAIL");
    }

    public static void main(String[] args) throws IOException
    {
        new JavaPropertyReader();

        System.out.println("full_name: " + FULL_NAME);
        System.out.println("email: " + EMAIL);
    }

}
