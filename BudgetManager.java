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
     * Finds a category by name.
     * @param name The category name to search for
     * @return Matching category, or null if not found
     */
    public BudgetCategory findCategoryByName(String name) {
        for (BudgetCategory category : categoryList) {
            if (category.getName().equalsIgnoreCase(name)) {
                return category;
            }
        }
        return null;
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

    /**
     * Checks whether a category total is within 100 of its budget.
     * @param category The category to evaluate
     * @return A message if close to budget, otherwise null
     */
    public String checkIfNearBudget(BudgetCategory category) {
        double categoryTotal = calculateCategoryTotal(category);
        double difference = category.getBudgetAmount() - categoryTotal;

        if (Math.abs(difference) <= 100) {
            if (difference >= 0) {
                return "You are $" + String.format("%.2f",difference) + " away from your "
                        + category.getName() + " budget.";
            }
            return "You are $" + String.format("%.2f", Math.abs(difference)) + " over your "
                    + category.getName() + " budget.";
        }

        return null;
    }

    /**
     * Checks every category and prints a message for categories near budget.
     */
    public void checkAllCategories() {
        for (BudgetCategory category : categoryList) {
            String message = checkIfNearBudget(category);
            if (message != null) {
                System.out.println(message);
            }
        }
    }

    /**
     * Displays each category total against its budget, then shows near-budget alerts.
     */
    public void displayCategoryTotals() {
        for (BudgetCategory category : categoryList) {
            double spent = calculateCategoryTotal(category);
            System.out.println(category.getName() + " - Spent: $"
                    + String.format("%.2f", spent)
                    + ", Budgeted: $"
                    + String.format("%.2f", category.getBudgetAmount()));
        }

        checkAllCategories();
    }

    


    public String toString(){
        String text = "";
        for(BudgetCategory item: categoryList){
            text += item.getName() + " Budget: " + item.getBudgetAmount() + "\n";
        }
        return text;
    }
}
