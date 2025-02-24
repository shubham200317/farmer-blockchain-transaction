package Porject1;

import java.util.Scanner;

public class UserAuthDriver {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        Blockchain blockchain = new Blockchain();
        Scanner scanner = new Scanner(System.in);

        User loggedInUser = null;

        while (true) {
            System.out.println("\n1. Register User");
            System.out.println("2. Login");
            System.out.println("3. Add Transaction (Farmers only)");
            System.out.println("4. View Blockchain (Buyers only)");
            System.out.println("5. Logout");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1: // Register User
                    System.out.print("Enter User ID: ");
                    String userId = scanner.nextLine();
                    System.out.print("Enter Username: ");
                    String username = scanner.nextLine();
                    System.out.print("Enter Password: ");
                    String password = scanner.nextLine();
                    System.out.print("Enter Role (Farmer/Buyer): ");
                    String role = scanner.nextLine();

                    userManager.registerUser(userId, username, password, role);
                    break;

                case 2: // Login
                    System.out.print("Enter Username: ");
                    username = scanner.nextLine();
                    System.out.print("Enter Password: ");
                    password = scanner.nextLine();

                    loggedInUser = userManager.authenticateUser(username, password);
                    break;

                case 3: // Add Transaction (Farmers only)
                    if (loggedInUser == null || !loggedInUser.getRole().equals("Farmer")) {
                        System.out.println("Access denied. Only farmers can add transactions.");
                        break;
                    }
                    System.out.print("Enter Transaction ID: ");
                    String transactionId = scanner.nextLine();
                    System.out.print("Enter Farmer ID: ");
                    String farmerId = scanner.nextLine();
                    System.out.print("Enter Buyer ID: ");
                    String buyerId = scanner.nextLine();
                    System.out.print("Enter Product: ");
                    String product = scanner.nextLine();
                    System.out.print("Enter Quantity: ");
                    int quantity = scanner.nextInt();
                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline

                    Transaction transaction = new Transaction(transactionId, farmerId, buyerId, product, quantity, price);
                    blockchain.getLatestBlock().addTransaction(transaction);
                    System.out.println("Transaction added successfully.");
                    break;

                case 4: // View Blockchain (Buyers only)
                    if (loggedInUser == null || !loggedInUser.getRole().equals("Buyer")) {
                        System.out.println("Access denied. Only buyers can view the blockchain.");
                        break;
                    }
                    blockchain.printBlockchain();
                    break;

                case 5: // Logout
                    loggedInUser = null;
                    System.out.println("Logged out successfully.");
                    break;

                case 6: // Exit
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
