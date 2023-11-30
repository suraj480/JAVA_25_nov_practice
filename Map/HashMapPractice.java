package Map;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapPractice {
   public static void main(String[] args) {
      Map<String, Double> hm = new HashMap<>();
      hm.put("Suraj", 90.0); // entry in the map
      hm.put("max", 10.0);
      hm.put("pax", 20.0);
      hm.put("sam", 80.0);
      System.out.println(hm.get("Suraj"));

      // Set of kwys - collection view
      Set<String> keys = hm.keySet();
      for (String ket : keys) {
         System.out.println(ket + "-" + hm.get(ket));
      }
      // Set of key-value pairs
      Set<Map.Entry<String, Double>> entries = hm.entrySet();
      Iterator<Map.Entry<String, Double>> itr = entries.iterator();
      while (itr.hasNext()) {
         Map.Entry<String, Double> entry = itr.next();
         System.out.println(entry.getKey() + "-" + entry.getValue());
      }
   }
}
