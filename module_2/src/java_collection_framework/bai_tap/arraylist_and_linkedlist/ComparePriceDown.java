package java_collection_framework.bai_tap.arraylist_and_linkedlist;

import java.util.Comparator;

public class ComparePriceDown implements Comparator<Product> {
    @Override
    public int compare(Product product, Product t1) {
        return (int) (t1.getPrice() - product.getPrice());
    }
}
