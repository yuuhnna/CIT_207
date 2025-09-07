public class Main {
    public static void main(String[] args){
        // Created a car object
        Car myCar = new Car("Toyota", "Corolla", 2020);

        // Initial Info
        myCar.displayInfo();

        // Start engine and show information
        myCar.startEngine();
        myCar.displayInfo();

        // Stop engine
        myCar.stopEngine();

        // Change Model
        myCar.setModel("Camry");

        // Final Info
        myCar.displayInfo();
    }
}
