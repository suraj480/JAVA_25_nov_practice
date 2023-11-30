package collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> nameSet = new HashSet<String>();
        nameSet.add("Suraj");
        nameSet.add("max");
        nameSet.add("pax");
        nameSet.add("sam");
        for (String name : nameSet) {
            System.out.println(name);
        }

        System.out.println(nameSet.contains("ramesh"));
        System.out.println(nameSet.contains("pax"));

    }
}