package Map;

import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapPractice {

    public static void main(String[] args) {
        SortedMap<String, Double> sm = new TreeMap<>();
        sm.put("Suraj", 90.0); // entry in the map
        sm.put("max", 10.0);
         sm.put("pax", 20.0);
        sm.put("sam", 80.0);
        Set<String> keys = sm.keySet();
        for (String ket : keys) {
            System.out.println(ket + "-" + sm.get(ket));
        }
       

    }
}