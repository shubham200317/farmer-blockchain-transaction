package Porject1;

import java.util.Scanner;

public class BlockchainDriver {

	public static void main(String[] args) {
			
		Blockchain blockchain = new Blockchain();
		Scanner scanner = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("\n1. Add Block");
			System.out.println("2. Add Transaction to Latest Block");
			System.out.println("3. Validate Blockchain");
			System.out.println("4. Print Blockchain");
			System.out.println("5. Exit");
			System.out.println("Choose an option: ");
			
			
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch (choice) {
            case 1:
                System.out.print("Enter Block ID: ");
                String blockId = scanner.nextLine();
                Block newBlock = new Block(blockId, blockchain.getLatestBlock().getCurrentHash());
                blockchain.addBlock(newBlock);
                break;

            case 2:
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
                System.out.println("Transaction added to the latest block.");
                break;

            case 3:
                System.out.println("Is Blockchain Valid? " + blockchain.isChainValid());
                break;

            case 4:
                System.out.println("Blockchain:");
                blockchain.printBlockchain();
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
