package Porject1;

public interface BuyerOperations {

	void addBuyer(String buyerId, String name, String contactInfo);
	
	void updateBuyer(String buyerId, String name, String contactInfo);
	
	void deleteBuyer(String buyerId);
	
	void getBuyerDetails(String buyerId);
}
