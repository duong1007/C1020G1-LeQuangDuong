package java_collection_framework.bai_tap.arraylist_and_linkedlist;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product_1 = new Product("Planes",3600);
        Product product_2 = new Product("Cars",600);
        Product product_3 = new Product("Cats",50);
        Product product_4 = new Product("Bike",100);
        Product product_5 = new Product("Motorbike",400);
        Product product_6 = new Product("Ship",2000);
        productManager.add(product_1);
        productManager.add(product_2);
        productManager.add(product_3);
        productManager.add(product_4);
        productManager.add(product_5);
        productManager.add(product_6);
        System.out.println(productManager.display());


        productManager.delete(product_4);
        System.out.println("After delete: ");
        System.out.println(productManager.display());


        productManager.repairName(product_3, "Dogs");
        System.out.println("After repairName");
        if (productManager.search("Cats") == null) {
            System.out.println("No Cats");
        } else {
            System.out.println("Cats");
        }
        System.out.println(productManager.display());


        System.out.println("Sort Product up");
        productManager.sortUp();
        System.out.println(productManager.display());


        System.out.println("Sort Product Down");
        productManager.sortDown();
        System.out.println(productManager.display());
    }
}

