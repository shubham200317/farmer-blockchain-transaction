package Porject1;

import java.util.Scanner;

public class FarmerManagermentDriver {

	public static void main(String[] args) {


		FarmerManager manager = new FarmerManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Farmer");
            System.out.println("2. Update Farmer");
            System.out.println("3. Delete Farmer");
            System.out.println("4. Get Farmer Details");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Farmer ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Contact Info: ");
                    String contact = scanner.nextLine();
                    manager.addFarmer(id, name, contact);
                    break;

                case 2:
                    System.out.print("Enter Farmer ID: ");
                    id = scanner.nextLine();
                    System.out.print("Enter New Name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter New Contact Info: ");
                    contact = scanner.nextLine();
                    manager.updateFarmer(id, name, contact);
                    break;

                case 3:
                    System.out.print("Enter Farmer ID to Delete: ");
                    id = scanner.nextLine();
                    manager.deleteFarmer(id);
                    break;

                case 4:
                    System.out.print("Enter Farmer ID to Retrieve: ");
                    id = scanner.nextLine();
                    manager.getFarmerDetails(id);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
