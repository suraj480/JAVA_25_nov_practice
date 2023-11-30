package Properties;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Set;

public class PropertiesPractice {
    public static void main(String[] args) {
        Properties props = System.getProperties();
        Set keys = props.keySet();
        for (Object key : keys) {
            System.out.println(key + "------------" + props.get(key));
        }
        Properties p = new Properties();
        try {
            p.load(new FileInputStream("myprops.properties"));
            System.out.println(p.getProperty("supportemail"));
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
}
