package binary_file.bai_tap.product_manager;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    static Scanner scanner = new Scanner(System.in);

//    static Map<Integer, Product> productList = new HashMap<>();

    final static String SOURCE = "src/binary_file/bai_tap/product_manager/Test.txt";

    public static void addProduct() {
        Map<Integer, Product> productList = readProductList();

        System.out.println("How many Product? : ");
        int numberProduct = scanner.nextInt();
        int count = 0;
        for (int index = 1; index <= productList.size() + 1;index++) {
            if (productList.get(index) == null) {
                System.out.println("Enter Product " + (index) + " information");
                int id = index;

                System.out.println("Enter Product Name :");
                String name = scanner.next();

                System.out.println("Enter Product Price :");
                double price = scanner.nextDouble();

                System.out.println("Enter Product Manufacturer :");
                String manufacturer = scanner.next();

                System.out.println("Enter Product Description");
                String description = scanner.next();

                Product product = new Product(name, manufacturer, price, description);
                productList.put(id, product);

                saveFile(productList);
                count++;
                if (count == numberProduct) {
                    break;
                }
            }
        }
    }

    public static void displayProduct() {
        Map<Integer, Product> productList = readProductList();
        for (Map.Entry<Integer,Product> entry : productList.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", " + entry.getValue());
        }
        System.out.println("\n");
    }


    public static void saveFile(Map<Integer, Product> productList) {
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



    public static Map<Integer, Product> readProductList() {
        Map<Integer, Product> productList = new HashMap<>();
        try {
            File file = new File(SOURCE);
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            productList = (Map<Integer, Product>) ois.readObject();
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return productList;
    }

    public static void search() {
        Map<Integer, Product> productList = readProductList();
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

    public static void Delete() {
        Map<Integer, Product> productList = readProductList();
        System.out.println("Enter ID:");
        Integer id = scanner.nextInt();
        for (Map.Entry<Integer, Product> entry : productList.entrySet()) {
            if (entry.getKey().equals(id)) {
                productList.remove(id);
                saveFile(productList);
                break;
            }
        }
//        if (id < 0 || id > productList.size()) {
//            System.err.println("Not Found" + '\n');
//            return;
//        }
//        while (id < productList.size()) {
//            Product product = productList.get(id + 1);
//            productList.put(id,product);
//            id++;
//        }
//        productList.remove(id);
//        saveFile(productList);
//
        }

    public static void menu() {
        System.out.println("1. Add a new Product ");
        System.out.println("2. Display Product List");
        System.out.println("3. Search a Product");
        System.out.println("4. Delete a Product");
        System.out.println("5. Exit ");
        System.out.println("Choice: ");
    }

    public static void main(String[] args) {
        int choice = 0;
        while (choice != 5) {
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
                    Delete();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("No choose");

            }
        }
    }
}
