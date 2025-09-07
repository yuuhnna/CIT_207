public class Main {
    public static void main(String[] args) {
        
        // Crate a Kiosk object with default values
        Kiosk k1 = new Kiosk(" ", 0, 0);

        // Set item details using setters
        k1.setItemName("T-shirt");
        k1.setPrice(150);
        k1.setQuantity(15);

        // Display item details
        System.out.println("===== Kiosk System ======");
        System.out.println("Item Name: " + k1.getItemName());
        System.out.println("Item Price: " + k1.getPrice());
        System.out.println("Item Quantity: " + k1.getQuantity() + " pieces");
        System.out.println();

        // Purchase 9 items
        k1.purchaseItem(9);
        System.out.println();

        // Show updated item details after purchase
        System.out.println("===== Kiosk System ======");
        System.out.println("Item Name: " + k1.getItemName());
        System.out.println("Item Price: " + k1.getPrice());
        System.out.println("Item Quantity: " + k1.getQuantity() + " pieces");
        System.out.println();

        // Try purchasing 8 items (more than available)
        k1.purchaseItem(8);
        System.out.println();

        // Final item details
        System.out.println("===== Kiosk System ======");
        System.out.println("Item Name: " + k1.getItemName());
        System.out.println("Item Price: " + k1.getPrice());
        System.out.println("Item Quantity: " + k1.getQuantity() + " pieces");
        System.out.println();

    }
}
