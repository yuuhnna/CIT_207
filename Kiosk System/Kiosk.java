public class Kiosk {
    // Private Attributes
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public Kiosk (String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setters
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Method to purchase an item
    public void purchaseItem(int qty) {
        if (qty <= quantity) {
            quantity = quantity - qty;
            System.out.println("*** Purchase Transaction ***");
            System.out.println("You have purchased " + qty + " " + getItemName());
            System.out.println("Stocks left: " + getQuantity() + " pieces");
        } else {
            System.out.println("*** Purchase Transaction ***");
            System.out.println("You want to purchase " + qty + " " + getItemName());
            System.out.println("Insufficient stock for " + getItemName());
            System.out.println("Stocks left: " + getQuantity() + " pieces");
        }
    }
}
