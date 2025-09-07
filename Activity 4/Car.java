public class Car {
    // Private attributes of the Car class
    private String brand;
    private String model;
    private int year;
    private boolean isRunning;

    // Constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.isRunning = false; // engine is off by default
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public boolean getIsRunning(){
        return isRunning;
    }

    // Setters (only for brand and model)
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Methods
    public void startEngine() {
        isRunning = true;
        System.out.println("The " + getBrand() + " " + getModel() + " engine has started");
    }

    public void stopEngine() {
        isRunning = false;
        System.out.println("The " + getBrand() + " " + getModel() + " engine has stopped");
    }

    public void displayInfo() {
        System.out.println("===== Car Information =====");
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Year: " + getYear());
        System.out.println("Engine Running: " + (getIsRunning() ? "Yes" : "No"));
        System.out.println("===========================");
        System.out.println();
    }

}
