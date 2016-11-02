package standartJavaProperty;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class StandartJavaPropertyReader {

    public static void main(String[] args) {

        Properties prop = new Properties();
        InputStream input = null;

        try {
            input = new FileInputStream("src/main/resources/application.properties");
            prop.load(input);

            System.out.println("full_name: " + prop.getProperty("full_name"));
            System.out.println("email: " + prop.getProperty("email"));

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
