package Porject1;

import java.util.HashMap;

public class BuyerManager implements BuyerOperations{
	
	private HashMap<String, Buyer> buyerDatabase = new HashMap<>();
	
	@Override
	public void addBuyer(String buyerId, String name, String contactInfo)
	{
		Buyer buyer = new Buyer(buyerId, name, contactInfo);
		
		buyerDatabase.put(buyerId, buyer);
		System.out.println("Buyer added successfully: " + buyer);
	}
	
	@Override
	public void updateBuyer(String buyerId, String name, String contactInfo)
	{
		if(buyerDatabase.containsKey(buyerId))
		{
			Buyer buyer = buyerDatabase.get(buyerId);
			buyer.setName(name);
			buyer.setcontactInfo(contactInfo);
			System.out.println("Buyer updated successfully: " + buyer);
		}
		else {
			System.out.println("Buyer with ID " + buyerId + " not found.");
		}
	}
	
	@Override
	public void deleteBuyer(String buyerId)
	{
		if(buyerDatabase.containsKey(buyerId))
		{
			buyerDatabase.remove(buyerId);
			System.out.println("Buyer with ID " + buyerId + " deleted successfully.");
		}
		else
		{
			System.out.println("Buyer with ID " + buyerId + " not found");
		}
	}
	
	@Override
	public void getBuyerDetails(String buyerId)
	{
		if(buyerDatabase.containsKey(buyerId))
			System.out.println(buyerDatabase.get(buyerId));
		{
			System.out.println("Buyer with ID " + buyerId + " not found");
		}
	}
}
