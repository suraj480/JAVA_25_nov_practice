package collection;

import java.util.HashSet;
import java.util.Set;


public class SetDemo2 {
    public static void main(String[] args) {
        Set<Product> productSet = new HashSet<>();

        productSet.add(new Product(101, "Pen", 50.0, "Stationary"));
        productSet.add(new Product(102, "Pencil", 80.0, "Stationary"));
        productSet.add(new Product(103, "Scale", 40.0, "Stationary"));
        productSet.add(new Product(104, "Eraser", 20.0, "Stationary"));
        productSet.add(new Product(105, "Sketch", 10.0, "Stationary"));

        for (Product p : productSet) {
            System.out.println(p);
        }
        System.out.println(productSet.contains(new Product(101, "Pen", 50.0, "Stationary")));

    }
}
