package Porject1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Analytics {
    private Blockchain blockchain;

    // Constructor
    public Analytics(Blockchain blockchain) {
        this.blockchain = blockchain;
    }

    // Method to calculate total number of transactions
    public int getTotalTransactions() {
        int count = 0;
        for (Block block : blockchain.getChain()) {
            count += block.getTransaction().size();
        }
        return count;
    }

    // Method to get transactions by farmer
    public List<Transaction> getFarmerTransactions(String farmerId) {
        List<Transaction> farmerTransactions = new ArrayList<>();
        
                Transaction transaction = null;
				if (transaction.getFarmerId().equals(farmerId)) {
                    farmerTransactions.add(transaction);
                }
				return farmerTransactions;
            }

    // Method to get transactions by buyer
    public List<Transaction> getBuyerTransactions(String buyerId) {
        List<Transaction> buyerTransactions = new ArrayList<>();
        for (Block block : blockchain.getChain()) {
            for (Transaction transaction : block.getTransaction()) {
                if (transaction.getBuyerId().equals(buyerId)) {
                    buyerTransactions.add(transaction);
                }
            }
        }
        return buyerTransactions;
    }

    // Method to get product-wise summary
    public Map<String, Integer> getProductSummary() {
        Map<String, Integer> productSummary = new HashMap<>();
        for (Block block : blockchain.getChain()) {
            for (Transaction transaction : block.getTransaction()) {
                String product = transaction.getProduct();
                productSummary.put(product, productSummary.getOrDefault(product, 0) + transaction.getQuantity());
            }
        }
        return productSummary;
    }
}