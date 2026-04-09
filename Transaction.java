/**
 * Represents a financial transaction.
 * This class demonstrates the concept of composition, as it contains
 * a reference to a BudgetCategory object.
 */
public class Transaction {

    // Private instance variables
    private double amount;
    private BudgetCategory category;

    /**
     * Constructor to initialize a Transaction object.
     * @param amount The cost or value of the transaction
     * @param category The BudgetCategory this transaction belongs to
     */
    public Transaction(double amount, BudgetCategory category) {
        this.amount = amount;
        this.category = category;
    }

    /**
     * Gets the transaction amount.
     * @return the amount as a double
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Sets a new amount for the transaction.
     * @param amount the new amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * Gets the budget category associated with this transaction.
     * @return the BudgetCategory object
     */
    public BudgetCategory getCategory() {
        return category;
    }

    /**
     * Sets a new budget category for the transaction.
     * @param category the new BudgetCategory to assign
     */
    public void setCategory(BudgetCategory category) {
        this.category = category;
    }

    /**
     * Returns a string representation of the Transaction.
     * This demonstrates calling the toString() method of the category object.
     * @return formatted string of transaction details
     */
    public String toString() {
        return "Transaction Amount: $" + amount + " [" + category.toString() + "]";
    }


}
