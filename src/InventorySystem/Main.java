package InventorySystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("\n1. Add Product");
            System.out.println("2. Update Stock level");
            System.out.println("3. Generate Inventory");
            System.out.println("4. Exit");
            System.out.println("Enter your choice");

            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter Product ID");
                    int productId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter Product Name");
                    String name = scanner.nextLine();
                    System.out.println("Enter the price");
                    double price = scanner.nextDouble();
                    System.out.println("Enter Stock Level");
                    int stockLevel = scanner.nextInt();

                    Product product = new Product(productId, name, price, stockLevel);
                    ims.addProduct(product);
                    break;

                case 2:
                    System.out.println("Enter Product ID");
                    productId = scanner.nextInt();
                    System.out.println("Enter stock quantity(+ for increase , - for decrease)");
                    int quantity = scanner.nextInt();
                    ims.updateStockLevel(productId,quantity);
                    break;

                case 3:
                    ims.generateInventoryReport();
                    break;

                case 4:
                    System.out.println("Thanks for using the system");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Input. Please try again");

            }
        }
    }
}
