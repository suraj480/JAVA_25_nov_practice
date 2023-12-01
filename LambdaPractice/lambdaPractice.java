package LambdaPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;
import collection.Product;
import collection.comparators.Comparators;

public class lambdaPractice {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<Product>();

        productList.add(new Product(101, "Pen", 50.0, "Stationary"));
        productList.add(new Product(102, "Pencil", 80.0, "Stationary"));
        productList.add(new Product(103, "Scale", 40.0, "Stationary"));
        productList.add(new Product(104, "Eraser", 20.0, "Stationary"));
        productList.add(new Product(105, "Sketch", 10.0, "Stationary"));
        Comparator<Product> priceComp = (p1, p2) -> {
            Double price1 = p1.getUnitPrice();
            Double price2 = p2.getUnitPrice();
            return price1.compareTo(price2);
        };
        Collections.sort(productList, priceComp);
        for (Product p : productList) {
            System.out.println(p);
        }

    }
}