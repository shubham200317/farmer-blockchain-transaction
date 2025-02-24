package Porject1;

import java.util.HashMap;

public class FarmerManager implements FarmerOperations{

		private HashMap<String, Farmer> farmerDatabase = new HashMap<>();
		
		@Override
		public void addFarmer(String farmerId, String name, String contactInfo)
		{
			Farmer farmer = new Farmer(farmerId, name, contactInfo);
			farmerDatabase.put(farmerId, farmer);
			System.out.println("Farmer added successfully: " + farmer);
		}

		@Override
		public void updateFarmer(String farmerId, String name, String contactInfo)
		{
			if (farmerDatabase.containsKey(farmerId))
			{
				Farmer farmer = farmerDatabase.get(farmerId);
				farmer.setName(name);
				farmer.setcontactInfo(contactInfo);
				System.out.println("Farmer updated successfully: " + farmer);
			}
			else 
			{
				System.out.println("Farmer with ID " + farmerId + " not found");
			}
		}
		
		@Override
		public void deleteFarmer(String farmerId)
		{
			if(farmerDatabase.containsKey(farmerId))
			{
				farmerDatabase.remove(farmerId);
				System.out.println("Farmer with ID "+ farmerId + " deleted successfully ");
			}
			else
			{
				System.out.println("Farmer with ID" + farmerId + " not found.");
			}
			
		}
		
		@Override
		public void getFarmerDetails(String farmerId)
		{
			if(farmerDatabase.containsKey(farmerId)) 
			{
				System.out.println(farmerDatabase.get(farmerId));
			}
			
			else {
				System.out.println("Farmer with ID " + farmerId + " not found");
			}
		}
}
