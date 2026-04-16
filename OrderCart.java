import java.util.ArrayList;

public class OrderCart{
    private ArrayList<MenuItem> selections = new ArrayList<>();

    public void addItem(MenuItem item) {
        selections.add(item);
        System.out.println(">> " + item.getName() + " added <<");
    }
    
    public double getSubtotal(){
        double sub = 0;
        for (MenuItem m : selections) sub += m.getPrice();
        return sub;
    }

    public ArrayList<MenuItem> getSelections() {return selections;}
    public boolean isEmpty() {return selections.isEmpty();}
}