package Porject1;

public class Buyer {
	
	private String buyerId;
	private String name;
	private String contactInfo;
	
	public Buyer() {
		
	}
	
	public Buyer(String buyerId, String name, String contactInfo)
	{
		this.buyerId = buyerId;
		this.name = name;
		this.contactInfo = contactInfo;
	}
	
	public String getBuyerId()
	{
		return buyerId;
	}
	
	public void setBuyerId(String buyerId)
	{
		this.buyerId =  buyerId;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getcontactInfo()
	{
		return contactInfo;
	}
	
	public void setcontactInfo(String contactInfo)
	{
		this.contactInfo = contactInfo;
	}
	
	@Override
	public String toString()
	{
		return "Buyer ID: " + buyerId + ", Name: " + name + ", Contact: " + contactInfo;
	}
}
