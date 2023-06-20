package Utilities;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Configuration_Reader {
    private static Properties prop = new Properties();
    private static String Path = "src/test/java/Resources/Configuration.properties";

    public static String getProperty(String Text) {
        try {
            InputStream input = new FileInputStream(Path);
            prop.load(input);
            String value = prop.getProperty(Text);
            return value;
        } catch (Exception exp) {
            exp.printStackTrace();
        }
        return null;
    }
}
