import java.util.Scanner;
public class Main {
    /**
     * Main method for testing the BudgetCategory class.
     */
    public static void main(String[] args) {
        // create a budgetManager
        BudgetManager manager = new BudgetManager();

        // create scanner
        Scanner scan = new Scanner(System.in);

        boolean exit = false;

        // main program / user menu
        while(!exit){
            // menu
            System.out.println("Enter an option: ");
            System.out.println("1. Create a New Category");
            System.out.println("2. Add Transaction");
            System.out.println("3. Display Category Totals");
            System.out.println("4. Exit");

            // input
            int response = scan.nextInt();

            switch (response) {
                case 1 -> {
                    BudgetCategory newCategory = createCategory(scan);
                    manager.addCategory(newCategory);
                }
                case 2 -> {
                    Transaction newTransaction = createTransaction(scan, manager);
                    if (newTransaction != null) {
                        manager.addTransaction(newTransaction);
                    }
                }
                case 3 -> manager.displayCategoryTotals();
                case 4 -> exit = true;
                default -> System.out.println("Enter a valid option");
            }
        }


    }

    public static BudgetCategory createCategory(Scanner scan) {
        scan.nextLine();
        System.out.print("Enter category name: ");
        String name = scan.nextLine();

        System.out.print("Enter category budget: ");
        double budgetAmount = scan.nextDouble();

        return new BudgetCategory(name, budgetAmount);
    }

    public static Transaction createTransaction(Scanner scan, BudgetManager manager) {
        scan.nextLine();
        System.out.print("Enter transaction amount: ");
        double amount = scan.nextDouble();
        scan.nextLine();

        System.out.print("Enter category name for this transaction: ");
        String categoryName = scan.nextLine();

        BudgetCategory category = manager.findCategoryByName(categoryName);
        if (category == null) {
            System.out.println("Category not found. Please create the category first.");
            return null;
        }

        return new Transaction(amount, category);
    }
}
