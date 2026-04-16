public class MenuItem {
    private int id;
    private String name;
    private String category;
    private double price;
    public MenuItem(int id, String name, String categoty, double price){
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public int getId() { return id;}
    public String getName() {return name;}
    public String getCategory() { return category;}
    public double getPrice() { return price;}

    public String toString(){
        //Formatted to include the category column
        return String.format("ID: %-5d | %-20s | %-12s | $%.2f", id, name, category, price);
    }
}