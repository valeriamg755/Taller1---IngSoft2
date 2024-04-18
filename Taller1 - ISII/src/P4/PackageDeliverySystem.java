package P4;

import java.util.Scanner;

public class PackageDeliverySystem {
    public static void main(String[] args) {
        TrackingSystem trackingSystem = new TrackingSystem();
        Scanner scanner = new Scanner(System.in);

        Package pkg1 = new Package("PKG001");
        Package pkg2 = new Package("PKG002");
        trackingSystem.addPackage(pkg1);
        trackingSystem.addPackage(pkg2);

        int choice;
        do {
            System.out.println("1. Update Package Status");
            System.out.println("2. View Package Status");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Package ID: ");
                    String id = scanner.next();
                    System.out.print("Enter New Status: ");
                    String status = scanner.next();
                    System.out.print("Enter New Location: ");
                    String location = scanner.next();
                    trackingSystem.updatePackageStatus(id, status, location);
                    break;
                case 2:
                    System.out.print("Enter Package ID: ");
                    id = scanner.next();
                    trackingSystem.printPackageStatus(id);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 3);

        scanner.close();
    }
}
