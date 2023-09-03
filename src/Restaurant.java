import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<MenuItem> items;
    //constructor
//    public Restaurant(List<MenuItem> items) {
//        this.items = items;
//    }
//getters and setters
    public List<MenuItem> getItems() {
        return items;
    }

    public void setItems(List<MenuItem> items) {
        this.items = items;
    }
    public void addItem(MenuItem item){
        items.add(item);
    }
    public void removeItem(MenuItem item){
        items.remove(item);
    }
    public static void main(String[] args){
        Restaurant item = new Restaurant();

    }

}

