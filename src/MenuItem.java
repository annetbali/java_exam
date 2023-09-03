public class MenuItem {
    private String name;
    private double price;
    private String rating;
    //constructor
    public MenuItem(String name, double price, String rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

}
