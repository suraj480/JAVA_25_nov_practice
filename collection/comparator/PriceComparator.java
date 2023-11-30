package collection.comparator;

import java.util.Comparator;

import collection.Product;

public class PriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        double price1 = p1.getUnitPrice();
        double price2 = p2.getUnitPrice();
        if (price1 > price2)
            return 1;
        else if (price1 < price2)
            return -1;
        else
            return 0;
    }

}
