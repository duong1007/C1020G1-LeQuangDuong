package java_collection_framework.bai_tap.arraylist_and_linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ProductManager {
   // private List<Product> products = new ArrayList<>();
    private List<Product> products = new LinkedList<>();

    public void add(Product product) {
        products.add(product);
    }

    public Product repairName(Product product, String newName) {
        int index = products.indexOf(product);
        if ( index == -1) {
            return null;
        } else {
            products.get(index).setName(newName);
        }
        return products.get(index);
    }

    public Boolean delete(Product product) {
        int index = products.indexOf(product);
        if (index == -1) {
            return false;
        } else {
            products.remove(product);
        }
        return true;
    }

    public String display() {
        return products.toString();
    }

    public Product search(String name) {
        if (!products.isEmpty()) {
            for (Product product : products) {
                if (product.getName().equals(name)) {
                    return product;
                }
            }
        }
        return null;
    }

    public boolean sortUp() {
        ComparePriceUp comparePriceUp = new ComparePriceUp();
        products.sort(comparePriceUp);
        return true;
    }

    public boolean sortDown() {
        ComparePriceDown comparePriceDown = new ComparePriceDown();
        products.sort(comparePriceDown);
        return true;
    }
}
