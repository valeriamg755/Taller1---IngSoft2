package P1;

import java.util.Scanner;

public class InventoryManagementSystem {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\nInventory Management System");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Update Quantity");
            System.out.println("4. Display Inventory");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String productName = scanner.next();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    inventory.addProduct(productName, quantity);
                    break;
                case 2:
                    System.out.print("Enter product name to remove: ");
                    String productToRemove = scanner.next();
                    inventory.removeProduct(productToRemove);
                    break;
                case 3:
                    System.out.print("Enter product name to update: ");
                    String productToUpdate = scanner.next();
                    System.out.print("Enter new quantity: ");
                    int newQuantity = scanner.nextInt();
                    inventory.updateQuantity(productToUpdate, newQuantity);
                    break;
                case 4:
                    inventory.displayInventory();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
