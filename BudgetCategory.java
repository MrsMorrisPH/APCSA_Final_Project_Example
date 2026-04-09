/**
 * Represents a category within a personal or business budget.
 * This class demonstrates standard AP CSA concepts including encapsulation,
 * accessor/mutator methods, and overriding the toString method.
 */
public class BudgetCategory {

    // Private instance variables (Encapsulation)
    private String name;
    private double budgetAmount;

    /**
     * Constructor to initialize a BudgetCategory object.
     * @param name The name of the category (e.g., "Groceries")
     * @param budgetAmount The monthly limit for this category
     */
    public BudgetCategory(String name, double budgetAmount) {
        this.name = name;
        this.budgetAmount = budgetAmount;
    }

    /**
     * Gets the name of the budget category.
     * @return the name as a String
     */
    public String getName() {
        return name;
    }

    /**
     * Sets a new name for the budget category.
     * @param name the new name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the current budget amount.
     * @return the budget amount as a double
     */
    public double getBudgetAmount() {
        return budgetAmount;
    }

    /**
     * Sets a new budget amount.
     * @param budgetAmount the new limit for the category
     */
    public void setBudgetAmount(double budgetAmount) {
        this.budgetAmount = budgetAmount;
    }

    /**
     * Returns a string representation of the BudgetCategory.
     * Format: "Category: [name], Budget: $[amount]"
     * @return formatted string of category details
     */
    @Override
    public String toString() {
        return "Category: " + name + ", Budget: $" + budgetAmount;
    }

    
}
