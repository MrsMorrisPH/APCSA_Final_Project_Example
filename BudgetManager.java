import java.util.ArrayList;

public class BudgetManager {
    // Instance variables
    private ArrayList<BudgetCategory> categoryList;
    private ArrayList<Transaction> transactionList;

    // Constructor
    public BudgetManager() {
        this.categoryList = new ArrayList<>();
        this.transactionList = new ArrayList<>();
    }

    /**
     * Adds a new budget category to the manager.
     */
    public void addCategory(BudgetCategory category) {
        categoryList.add(category);
    }

    /**
     * Adds a new transaction to the history.
     */
    public void addTransaction(Transaction transaction) {
        transactionList.add(transaction);
    }

    /**
     * Calculates the total amount spent for a specific category.
     * * @param category The category to total
     * @return The sum of all transaction amounts in that category
     */
    public double calculateCategoryTotal(BudgetCategory category) {
        double total = 0;

        for (Transaction t : transactionList) {
            // Checking if the transaction belongs to the target category
            if (t.getCategory().getName().equals(category.getName())) {
                total += t.getAmount();
            }
        }

        return total;
    }

    public String toString(){
        String text = "";
        for(BudgetCategory item: categoryList){
            text += item.getName() + " Budget: " + item.getBudgetAmount() + "\n";
        }
        return text;
    }
}
