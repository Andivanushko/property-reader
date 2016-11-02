package apacheProperty;

import java.io.File;
import java.util.Iterator;

import org.apache.commons.configuration.CompositeConfiguration;
import org.apache.commons.configuration.PropertiesConfiguration;

public class ApachePropertyReader {

    public static void main(String[] args) throws Exception {

        File file =  new File("src/main/resources/application.properties");

        CompositeConfiguration config = new CompositeConfiguration();
        config.addConfiguration(new PropertiesConfiguration(file));

        //noinspection unchecked
        Iterator<String> keys = config.getKeys();
        while (keys.hasNext()) {
            String key = keys.next();
            System.out.println(key + " : " + config.getProperty(key));
        }
    }
}
