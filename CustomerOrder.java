public class CustomerOrder{
    private OrderCart cart;
    private final double TAX_RATE = 0.0875; //8.75% is the Sales Tax in Merced

    public CustomerOrder(OrderCart cart){
        this.cart = cart;
    }

    public void finalizeOrder(){
        if (cart.isEmpty()) return;

        double subtotal = cart.getSubtotal();
        double tax = subtotal * TAX_RATE;
        double total = subtotal + tax;

        System.out.println("\n===================================================");
        System.out.println("                    ORDER RECIEPT                    ");
        System.out.println("\n===================================================");
        for (MenuItem item : cart.getSelections ()){
            System.out.printf("%-20s $%.2f\n", item.getName(), item.getPrice());
        }
        System.out.println("---------------------------------------------------");
        System.out.printf("Subtotal:     $%.2f\n", subtotal);
        System.out.printf("Tax:          $%.2f\n", tax);
        System.out.printf("Total:        $%.2f\n", total);
        System.out.println("---------------------------------------------------");
    }
}