package Porject1;

public interface FarmerOperations {
	
	void addFarmer(String farmerId,String name, String contactInfo);
	
	void updateFarmer(String farmerId, String name, String contactInfo);
	
	void deleteFarmer(String farmerId);
	
	void getFarmerDetails(String farmerId);
	
	
	
}
