/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentdata;

/**
 *
 * @author Yana
 */
public class StudentData {
    /*
    This program stores and displays student information
    Attributes:
        - name (String)
        - age (int)
        -  grade (double)
        - isEnrolled (boolean)
    */
    
    public static void main(String[] args) {
        //Declare and initialize student details
        String name = "Allanah";    // student's name
        int age = 19;               // student's age
        double grade = 1.5;         // student's grade      
        boolean isEnrolled = true;  // Enrollment status (true = enrolled, false = not enrolled)
        
        // Print student information
        System.out.println("===== Student Information =====");
        System.out.println("Name: " + name);    // Display name
        System.out.println("Age: " + age);      // Display age
        System.out.println("Grade: " + grade);  // Display grade
        
        // Display enrollment status using ternary operator for cleaner output
        System.out.println("Enrollment Status:" + (isEnrolled ? "Enrolled" : "Not Enrolled"));
    }
        
}
    

