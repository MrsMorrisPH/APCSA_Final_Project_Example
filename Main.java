public class Main {
    /**
     * Main method for testing the BudgetCategory class.
     */
    public static void main(String[] args) {
        // Create a category first
        BudgetCategory entertainment = new BudgetCategory("Movies", 50.0);

        // Create a transaction using that category (Composition)
        Transaction t1 = new Transaction(12.50, entertainment);

        System.out.println(t1.toString());
        
    }
}
