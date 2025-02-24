package Porject1;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ReportingDriver {
    public static void main(String[] args) {
        Blockchain blockchain = new Blockchain();
        Analytics analytics = new Analytics(blockchain);
        try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
			    System.out.println("\nAnalytics Menu:");
			    System.out.println("1. Total Transactions");
			    System.out.println("2. Farmer-wise Transactions");
			    System.out.println("3. Buyer-wise Transactions");
			    System.out.println("4. Product-wise Summary");
			    System.out.println("5. Exit Analytics");
			    System.out.print("Choose an option: ");

			    int choice = scanner.nextInt();
			    scanner.nextLine(); // Consume newline

			    switch (choice) {
			        case 1: // Total Transactions
			            System.out.println("Total Transactions: " + analytics.getTotalTransactions());
			            break;

			        case 2: // Farmer-wise Transactions
			            System.out.print("Enter Farmer ID: ");
			            String farmerId = scanner.nextLine();
			            List<Transaction> farmerTransactions = analytics.getFarmerTransactions(farmerId);
			            if (farmerTransactions.isEmpty()) {
			                System.out.println("No transactions found for Farmer ID: " + farmerId);
			            } else {
			                System.out.println("Transactions for Farmer ID " + farmerId + ":");
			                for (Transaction t : farmerTransactions) {
			                    System.out.println(t);
			                }
			            }
			            break;

			        case 3: // Buyer-wise Transactions
			            System.out.print("Enter Buyer ID: ");
			            String buyerId = scanner.nextLine();
			            List<Transaction> buyerTransactions = analytics.getBuyerTransactions(buyerId);
			            if (buyerTransactions.isEmpty()) {
			                System.out.println("No transactions found for Buyer ID: " + buyerId);
			            } else {
			                System.out.println("Transactions for Buyer ID " + buyerId + ":");
			                for (Transaction t : buyerTransactions) {
			                    System.out.println(t);
			                }
			            }
			            break;

			        case 4: // Product-wise Summary
			            Map<String, Integer> productSummary = analytics.getProductSummary();
			            System.out.println("Product Summary:");
			            for (Map.Entry<String, Integer> entry : productSummary.entrySet()) {
			                System.out.println("Product: " + entry.getKey() + ", Quantity: " + entry.getValue());
			            }
			            break;

			        case 5: // Exit
			            System.out.println("Exiting Analytics...");
			            return;

			        default:
			            System.out.println("Invalid option. Try again.");
			    }
			}
		}
    }
}
