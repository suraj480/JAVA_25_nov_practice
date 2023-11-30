package collection;

import java.util.TreeSet;
import java.util.Set;

public class SetDemo3 {
    public static void main(String[] args) {
        Set<Product> productSet = new TreeSet<Product>();
        // Set<String> productSet = new TreeSet<String>();
        // productSet.add("Suraj");
        // productSet.add("Max");
        // productSet.add("Pax");
        // productSet.add("Sam");
        // for (String name : productSet) {
        // System.out.println(name);
        // }
        productSet.add(new Product(101, "Pen", 50.0, "Stationary"));
        productSet.add(new Product(102, "Pencil", 80.0, "Stationary"));
        productSet.add(new Product(103, "Scale", 40.0, "Stationary"));
        productSet.add(new Product(104, "Eraser", 20.0, "Stationary"));
        productSet.add(new Product(105, "Sketch", 10.0, "Stationary"));

        for (Product p : productSet) {
            System.out.println(p);
        }
        // System.out.println(productSet.contains(new Product(101, "Pen", 50.0,
        // "Stationary")));

    }
}
