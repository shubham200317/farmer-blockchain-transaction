package Porject1;

public class Transaction {
	
	private String transactionId;
	private String farmerId;
	private String  buyerId;
	private String product;
	private int quantity;
	private double price;
	
	
	public Transaction() {
		
	}
	
	public Transaction(String transactionId, String farmerId, 
			String buyerId, String product, 
			int quantity, double price)
	{
		this.transactionId = transactionId;
		this.farmerId = farmerId;
		this.buyerId = buyerId;
		this.product = product;
		this.quantity = quantity;
		this.price = price;
	}
	
	
	//Getter and setter 
	
	public String getTransactionId()
	{
		return transactionId;
	}
	
	public void setTransactionId(String transactionId)
	{
		this.transactionId = transactionId;
	}
	
	public String getFarmerId() 
	{
		return farmerId;
	}
	
	public void setFarmerId(String farmerId)
	{
		this.farmerId = farmerId;
	}
	
	public String getBuyerId() 
	{
		return buyerId;
	}
	
	public void setBuyerId(String buyerId)
	{
		this.buyerId = buyerId;
	}
	
	public String getProduct()
	{
		return product;
	}
	
	public void setProduct(String product)
	{
		this.product = product;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	@Override
	public String toString()
	{
		return "Transaction ID : " + transactionId + 
			   "Farmer ID : " + farmerId +
			   "Buyer ID : " + buyerId +
			   "Product : " + product +
			   "Quantity : " + quantity +
			   "Price : " + price;
	}
}
