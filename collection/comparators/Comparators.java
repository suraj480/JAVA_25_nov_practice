package collection.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;
import collection.Product;

public class Comparators {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<Product>();

        productList.add(new Product(105, "Pen", 50.0, "Stationary"));
        productList.add(new Product(103, "Pencil", 80.0, "Stationary"));
        productList.add(new Product(102, "Scale", 40.0, "Stationary"));
        productList.add(new Product(104, "Eraser", 20.0, "Stationary"));
        productList.add(new Product(101, "Sketch", 10.0, "Stationary"));

        // Collections.sort(productList);
        // System.out.println(productList);
        // Collections.sort(productList, new PriceComparator());
        // Collections.sort(productList, new ProductNameComparator());
        for (Product p : productList) {
            System.out.println(p);
        }
       

    }
}
