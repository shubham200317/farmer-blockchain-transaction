package Porject1;

import java.util.HashMap;

public class TransactionManager implements TransactionOperations{
	
	private HashMap<String, Transaction> transactionDatabase = new HashMap<>();
	
	@Override
	public void createTransaction(String transactionId, String farmerId,
			String buyerId, String product , int quantity , double price)
	{
		if(transactionDatabase.containsKey(transactionId))
		{
			System.out.println("Transaction ID already exists. Please use a unique ID");
			return;
		}
		
		Transaction transaction = new Transaction(transactionId, farmerId,
													buyerId, product, quantity, price);
		transactionDatabase.put(transactionId, transaction);
		System.out.println("Transaction created successfully: " + transaction);
	}
	
	@Override
	public void viewTransaction(String transactionId) {
		  if(transactionDatabase.containsKey(transactionId))
		  {
			  System.out.println(transactionDatabase.get(transactionId));
		  }
		  else
		  {
			  System.out.println("Transaction with ID " + transactionId + " not found");
		  }
	}
	
	@Override
	public void viewAllTransactions()
	{
		if(transactionDatabase.isEmpty()) {
			System.out.println(" No transaction found. ");
			return;
		}
		for(Transaction transaction : transactionDatabase.values())
		{
			System.out.println(transaction);
		}
	}
}
