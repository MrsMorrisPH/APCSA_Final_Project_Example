public class Main {
    /**
     * Main method for testing the BudgetCategory class.
     */
    public static void main(String[] args) {
        // Create a category first
        BudgetCategory entertainment = new BudgetCategory("Entertainment", 200.0);
        // Create a transaction using that category (Composition)
        Transaction t1 = new Transaction(12.50, entertainment);

        // Create a category first
        BudgetCategory food = new BudgetCategory("Food", 800.0);
        // Create a transaction using that category (Composition)
        Transaction t2 = new Transaction(19.99, food);

        Transaction t3 = new Transaction(10, entertainment);
        Transaction t4 = new Transaction(20, food);

        // create a budgetManager
        BudgetManager manager = new BudgetManager();

        // add categories
        manager.addCategory(entertainment);
        manager.addCategory(food);

        // print categories and their budgets
        System.out.println(manager);

        // add transactions
        manager.addTransaction(t1);
        manager.addTransaction(t2);
        manager.addTransaction(t3);
        manager.addTransaction(t4);

        // test category total method
        System.out.println("Total spent in Entertainment category: " + manager.calculateCategoryTotal(entertainment));
        System.out.println("Total spent in Food category: " + manager.calculateCategoryTotal(food));


    }
}
