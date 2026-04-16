import java.util.ArrayList

public class OrderCart{
    private ArrayList<MenuItem> selections = new ArrayList<>();

    public void addItem(MenuItem itme) {
        selections.add(item);
        System.out.println(">> " + item.getName() + " added. <<");
    }
    
    public double getSubTotal(){
        double sub = 0;
        for (MenuItem m : selections) sub += m.getPrice();
        return sub;
    }

    public ArrayList<MenuItem> getSelections() {return selections}
    publlic boolean isEmpty() {return selections.isEmpty();}
}