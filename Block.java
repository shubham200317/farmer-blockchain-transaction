package Porject1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Block {
	private String blockId;
	private String previousHash;
	private List<Transaction> transactions;
	private String currentHash;
	
	public Block(String blockId, String previousHashString)
	{
		this.blockId = blockId;
		this.previousHash = previousHash;
		this.transactions = new ArrayList<>();
		this.currentHash = calculateHash();
	}
	
	public void addTransaction(Transaction transaction)
	{
		transactions.add(transaction);
		currentHash = calculateHash();
	}
	
	private String calculateHash()
	{
		StringBuilder data = new StringBuilder(blockId + previousHash);
		
		for(Transaction transaction : transactions)
		{
			data.append(transaction.toString());
		}
		
		return Integer.toHexString(Objects.hash(data.toString()));	
	}
	public boolean isHashValid() {
		return currentHash.equals(calculateHash());
	}

	public String getBlockId() {
		return blockId;
	}
	public String getPreviousHash()
	{
		return previousHash;
	}
	public String getCurrentHash()
	{
		return currentHash;
	}
	public List<Transaction> getTransaction()
	{
		return transactions;
	}
	
	@Override
	public String toString()
	{
		return "Block ID: " + blockId + ", Previous Hash: " + previousHash + ", Current Hash: " + currentHash;
	}

}
