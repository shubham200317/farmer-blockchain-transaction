package Porject1;

public interface TransactionOperations {
	
	void createTransaction(String transactionId, String farmerId, String buyerId, String product, int quantity, double price);
	
	void viewTransaction(String transactionId);
	
	void viewAllTransactions();

}
