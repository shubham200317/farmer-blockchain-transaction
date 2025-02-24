package Porject1;

import java.util.ArrayList;
import java.util.List;

public class Blockchain {
	
	private  List<Block> chain;
	
	public List<Block> getChain() {
	    return chain;
	}

	
	public Blockchain()
	{
		this.chain = new ArrayList<>();
		
		Block genesisBLock = new Block("0","0");
		chain.add(genesisBLock);
	}
	
	public void addBlock(Block block)
	{
		if(chain.isEmpty())
		{
			block = new Block(block.getBlockId(), "0");
		}
		else
		{
			block = new Block(block.getBlockId(), getLatestBlock().getCurrentHash());
		}
		chain.add(block);
		System.out.println("Block added to the chain: " + block);
	}
	
	public Block getLatestBlock()
	{
		return chain.get(chain.size()-1);
	}
	
	public boolean isChainValid()
	{
		for(int i = 1; i<chain.size(); i++)
		{
			Block currentBlock = chain.get(i);
			Block previousBlock = chain.get(i-1);
			
			if(!currentBlock.isHashValid())
			{
				return false;
			}
			if(!currentBlock.getPreviousHash().equals(previousBlock.getCurrentHash()))
			{
				return false;
			}
		}
		return true;
	}
	
	public void printBlockchain()
	{	
		for(Block block : chain)
		{
			System.out.println(block);
			for(Transaction transaction : block.getTransaction())
			{
				System.out.println("    "+ transaction);
			}
		}
	}
}
