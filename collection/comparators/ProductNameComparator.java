package collection.comparators;

import java.util.Comparator;

import collection.Product;

public class ProductNameComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        String name1 = o1.getProductDescription();
        String name2 = o2.getProductDescription();
        return name1.compareTo(name2);
    }

}
