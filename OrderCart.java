import java.util.ArrayList;

// OrderCart stores the items selected by the customer and calculates the order subtotal.
public class OrderCart{
    private ArrayList<MenuItem> selections = new ArrayList<>();

    public void addItem(MenuItem item) {
        // Add a menu item to the cart and confirm the selection to the user.
        selections.add(item);
        System.out.println(">> " + item.getName() + " added <<");
    }
    
    public double getSubtotal(){
        // Sum the prices of all selected items to compute the order subtotal.
        double sub = 0;
        for (MenuItem m : selections) sub += m.getPrice();
        return sub;
    }

    public ArrayList<MenuItem> getSelections() {return selections;}
    public boolean isEmpty() {return selections.isEmpty();}
}