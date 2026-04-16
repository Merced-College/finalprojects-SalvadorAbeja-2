import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        OrderCart cart = new OrderCart();

        // Load menu.csv
        menu.loadFromCSV("menu(menu_items).csv");
        
        boolean running = true;
        while (running) {
            System.out.println("\n--- Restaurant Ordering System ---");
            System.out.println("1. View Full Menu (By Price)");
            System.out.println("2. Add Item by Item ID (Search)");
            System.out.println("3. Add Item by Name (Linear Search)");
            System.out.println("4. View Cart & Checkout");
            System.out.println("5. Exit");
            System.out.println("Selection: ");
            
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    menu.sortByPrice();
                    menu.display();
                    break;
                case 2:
                    System.out.print("Enter ID: ");
                    MenuItem item = menu.findById(scanner.nextInt());
                    if (item != null) cart.addItem(item);
                    else System.out.println("Item not found!");
                    break;
                case 3: 
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
                    CustomerOrder order = new CustomerOrder(cart);
                    order.finalizeOrder();
                    running = false;
                    break;
                case 5:
                    running = false;
                    break;
            }
        }
        scanner.close();
    }
}