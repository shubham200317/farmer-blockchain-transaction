package Porject1;

import java.util.Scanner;

public class BuyerManagerDriver {

	public static void main(String[] args) {
		
		BuyerManager manager = new BuyerManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Buyer");
            System.out.println("2. Update Buyer");
            System.out.println("3. Delete Buyer");
            System.out.println("4. Get Buyer Details");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Buyer ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Contact Info: ");
                    String contact = scanner.nextLine();
                    manager.addBuyer(id, name, contact);
                    break;

                case 2:
                    System.out.print("Enter Buyer ID: ");
                    id = scanner.nextLine();
                    System.out.print("Enter New Name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter New Contact Info: ");
                    contact = scanner.nextLine();
                    manager.updateBuyer(id, name, contact);
                    break;

                case 3:
                    System.out.print("Enter Buyer ID to Delete: ");
                    id = scanner.nextLine();
                    manager.deleteBuyer(id);
                    break;

                case 4:
                    System.out.print("Enter Buyer ID to Retrieve: ");
                    id = scanner.nextLine();
                    manager.getBuyerDetails(id);
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

