package binary_file.bai_tap.product_manager;


import java.io.*;
import java.util.*;

public class ProductManager {

    static Scanner scanner = new Scanner(System.in);

    static Map<Integer, Product> productList = new HashMap<>();

    final static String SOURCE = "src/binary_file/bai_tap/product_manager/ListProduct.txt";

    public static void addProduct() {
        readProductList();

        System.out.println("How many Product? : ");
        int numberProduct = scanner.nextInt();
        for (int i = 0; i < numberProduct; i++) {
            System.out.println("Enter Product " + (i + 1) + " information");
            System.out.println("Enter Product ID :");
            int id = scanner.nextInt();

            System.out.println("Enter Product Name :");
            String name = scanner.next();

            System.out.println("Enter Product Price :");
            double price = scanner.nextDouble();

            System.out.println("Enter Product Manufacturer :");
            String manufacturer = scanner.next();

            System.out.println("Enter Product Description");
            String description = scanner.next();

            Product product= new Product(name,manufacturer,price,description);
            productList.put(id,product);

            saveFile();
        }
    }

    public static void displayProduct() {
        readProductList();
        for (Map.Entry<Integer,Product> entry : productList.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", " + entry.getValue());
        }
        System.out.println("\n");
    }


    public static void saveFile() {
        try {
            File file = new File(SOURCE);
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(productList);
            fos.close();
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    public static void readProductList() {
        try {
            File file = new File(SOURCE);
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            productList = (Map<Integer, Product>) ois.readObject();
            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void search() {
        readProductList();
        System.out.println("Enter ID:");
        Integer id = scanner.nextInt();
        for (Map.Entry<Integer,Product> entry : productList.entrySet()) {
            if (id.equals(entry.getKey())) {
                System.out.println(entry.getValue() + "\n");
                return;
            }
        }
        System.err.println("Not Found" + '\n');
    }

    public static void menu() {
        System.out.println("1. Add a new Product ");
        System.out.println("2. Display Product List");
        System.out.println("3. Search a Product");
        System.out.println("4. Exit ");
        System.out.println("Choice: ");
    }

    public static void main(String[] args) {
        int choice = 0;
        while (choice != 4) {
            menu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    displayProduct();
                    break;
                case 3:
                    search();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("No choose");

            }
        }
    }
}
