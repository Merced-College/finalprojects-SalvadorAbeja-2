import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class Menu{
    private ArrayList<MenuItem> items = new ArrayList<>();

    public void loadFromCSV(String filename){
        // Read the menu file and create MenuItem objects for each row
        try {
            File file = new File(filename);
            Scanner fileScanner = new Scanner(file);

            // Skips header row "menu_item_id,item_name,category,price"
            if (fileScanner.hasNextLine()){
                fileScanner.nextLine();
            }

            while (fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                if (line.trim().isEmpty()) continue;

                String[] parts = line.split(",");
                if (parts.length == 4){
                    int id = Integer.parseInt(parts[0].trim());
                    String name = parts[1].trim();
                    String category = parts[2].trim();
                    double price = Double.parseDouble(parts[3].trim());

                    items.add(new MenuItem(id, name, category, price));
                }
            }
            fileScanner.close();
            System.out.println("Loaded " + items.size() + " items from the menu.");
        }
        catch(Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    // Insertion Sort (By price)
    // This algorithm organizes the menu from cheapest to most expensive.
    // It is efficient for small lists and demonstrates sorting behavior clearly.
    public void sortByPrice(){
        for (int i = 1; i < items.size(); i++){
            MenuItem key = items.get(i);
            int j = i - 1;
            while (j >= 0 && items.get(j).getPrice() > key.getPrice()){
                items.set(j + 1, items.get(j));
                j--;
            }
            items.set(j + 1, key);
        }
    }
    public void sortByID(){
        for ( int i = 1; i < items.size(); i++){
            MenuItem key = items.get(i);
            int j = i - 1;
            while (j >= 0 && items.get(j).getId() > key.getId()){
                items.set(j + 1, items.get(j));
                j--;
            }
            items.set(j + 1, key);
        }
    }

    // Binary Search (By ID)
    // This method first sorts the list by ID, then searches quickly by halving the search range.
    public MenuItem findById(int targetId){
        sortByID(); // This ensures list is sorted for binary search
        int low = 0;
        int high = items.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (items.get(mid).getId() == targetId) return items.get(mid);
            if (items.get(mid).getId() < targetId) low = mid + 1;
            else high = mid - 1;
        }
        return null;
    }

    // Linear Search (By Name)
    // This method scans each item until it finds a name match.
    // It is straightforward and works even when the list is not sorted.
    public MenuItem findByName(String targetName){
        for (MenuItem item : items){
            if(item.getName().equalsIgnoreCase(targetName.trim())){
                return item;
            }
        }
        return null;
    }

    public void display(){
        System.out.printf("%-8s | %-20s | %-12s | %-7s\n", "ID", "Name", "Category", "Price");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (MenuItem item : items) System.out.println(item);
    }
}