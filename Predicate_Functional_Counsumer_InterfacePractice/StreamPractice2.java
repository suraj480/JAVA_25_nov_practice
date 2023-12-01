package Predicate_Functional_Counsumer_InterfacePractice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import collection.Product;

public class StreamPractice2 {
    public static void main(String[] args) {
        List<Product> productCatatog = new ArrayList<Product>();
        productCatatog.add(new Product(107, "Limca", 110.0, "Beverage"));
        productCatatog.add(new Product(101, "Pen", 50.0, "Stationary"));
        productCatatog.add(new Product(102, "Pencil", 80.0, "Stationary"));
        productCatatog.add(new Product(103, "Scale", 40.0, "Stationary"));
        productCatatog.add(new Product(106, "coke", 90.0, "Beverage"));
        productCatatog.add(new Product(104, "Eraser", 20.0, "Stationary"));
        productCatatog.add(new Product(108, "Fruty", 65.0, "Beverage"));
        productCatatog.add(new Product(105, "Sketch", 10.0, "Stationary"));

        // count how many stationary products are there

        long countOfProducts = productCatatog.stream().filter((p) -> {
            return p.getCategory().equals("Stationary");
        }).count();
        System.out.println(countOfProducts);
        // min price product
        Comparator<Product> prodComp = (p1, p2) -> {
            Double price1 = p1.getUnitPrice();
            Double price2 = p2.getUnitPrice();
            return price1.compareTo(price2);

        };
        // min price from all products
        Optional<Product> optProduct = productCatatog.stream().min(prodComp);
        if (optProduct.isPresent()) {
            System.out.println(optProduct.get());
        } else {
            System.out.println("No products available");
        }

        //min for only beverage category
        Optional<Product> beverageProduct = productCatatog.stream().filter((p) -> p.getCategory().equals("Beverage"))
                .min(prodComp);
        if (beverageProduct.isPresent()) {
            System.out.println(beverageProduct.get());
        } else {
            System.out.println("No products available");
        }
    }
}
