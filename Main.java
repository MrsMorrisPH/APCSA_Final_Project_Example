public class Main {
    /**
     * Main method for testing the BudgetCategory class.
     */
    public static void main(String[] args) {
        BudgetCategory food = new BudgetCategory("Groceries", 350.50);

        // Testing toString and getters
        System.out.println(food.toString());

        // Testing setters
        food.setBudgetAmount(400.00);
        System.out.println("Updated " + food.getName() + " budget: $" + food.getBudgetAmount());
    }
}
