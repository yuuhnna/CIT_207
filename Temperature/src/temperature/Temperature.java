/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperature;

/**
 *
 * @author Yana
 */

public class Temperature {
    
    public static void main(String[] args) {
        final double FREEZING_POINT = 32.0;
        double temp = 37.7;
        boolean isFreezing = (temp < FREEZING_POINT);
        
        if (isFreezing){
            System.out.println("It's Freezing");
        } else {
            System.out.println("Above Freezing");
        }
    }
}
