import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Set up the user interface and data structures
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        OrderCart cart = new OrderCart();

        // Load the restaurant menu from a CSV file
        menu.loadFromCSV("menu.csv");
        
        boolean running = true;
        while (running) {
            // Main menu loop: show options until the user exits or checks out
            System.out.println("\n--- Merced College Restaurant Ordering System ---");
            System.out.println("1. View Full Menu (By Price)");
            System.out.println("2. Add Item by Item ID (Search)");
            System.out.println("3. Add Item by Name (Linear Search)");
            System.out.println("4. View Cart & Checkout");
            System.out.println("5. Exit");
            System.out.print("Selection: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // Option 1: sort the full menu by price and display it
                    menu.sortByPrice();
                    menu.display();
                    break;
                case 2:
                    // Option 2: search by item ID using binary search
                    System.out.print("Enter ID: ");
                    MenuItem item = menu.findById(scanner.nextInt());
                    if (item != null) cart.addItem(item);
                    else System.out.println("Item not found!");
                    break;
                case 3: 
                    // Option 3: search by item name using linear search
                    System.out.print("Enter the Item Name: ");
                    String name = scanner.nextLine();
                    MenuItem itemName = menu.findByName(name);
                    if (itemName != null){
                        cart.addItem(itemName);
                    }
                    else {
                        System.out.println("Item name not found. Check your spelling!");
                    }
                    break;
                case 4:
                    // Option 4: proceed to checkout and finalize the order
                    CustomerOrder order = new CustomerOrder(cart);
                    order.finalizeOrder();
                    running = false;
                    break;
                case 5:
                    // Option 5: exit the application
                    System.out.println("Goodbye!");
                    running = false;
                    break;
            }
        }
        scanner.close();
    }
}