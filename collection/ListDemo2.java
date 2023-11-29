package collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {

    public static void main(String args[]) {
        List<Product> productList = new ArrayList<Product>();

        productList.add(new Product(101, "Pen", 50.0, "Stationary"));
        productList.add(new Product(102, "Pencil", 80.0, "Stationary"));
        productList.add(new Product(103, "Scale", 40.0, "Stationary"));
        productList.add(new Product(104, "Eraser", 20.0, "Stationary"));
        productList.add(new Product(105, "Sketch", 10.0, "Stationary"));

        for (Product p : productList) {
            System.out.println(p);
        }
        System.out.println(productList.contains(new Product(101, "Pen", 50.0, "Stationary")));
    }
}