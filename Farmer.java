package Porject1;

public class Farmer {

		private String farmerId ;
		private String name;
		private String contactInfo;
		
		
		//constructor 
		
		public Farmer()
		{
			
		}
		
		public Farmer(String farmerId, String name, String contactInfo)
		{
			this.farmerId = farmerId;
			this.name = name;
			this.contactInfo = contactInfo;
		}
		
		//Getter and Setter
		
		public String getFarmerId()
		{
			return farmerId;
		}
		
		public String setFarmerId(String farmerId)
		{
			return this.farmerId = farmerId;
		}
		
		public String getname() 
		{
			return name;
		}
		
		public String setName(String name)
		{
			return this.name = name;
		}
		
		public String getcontactInfo()
		{
			return contactInfo;
		}
		
		public String setcontactInfo(String contactInfo)
		{
			return this.contactInfo = contactInfo;
		}
		
		
		@Override
		public String toString()
		{
			return "Farmer ID: " + farmerId + ", Name: " + name + ", Contact: " + contactInfo;
		}
}
