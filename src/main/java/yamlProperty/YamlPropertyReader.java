package yamlProperty;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

public class YamlPropertyReader {

    public static void main(String[] args) {

        File file =  new File("src/main/resources/sample.yml");
        System.out.println(file.getAbsolutePath());

        Yaml yaml = new Yaml();

        try {
            InputStream is = new FileInputStream(file);


            //noinspection unchecked
            Map<String,Object> result = (Map<String,Object>)yaml.load(is);

            System.out.println("cdp.lecture: " + result.get("cdp.lecture"));
            System.out.println("email: " + result.get("email"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
