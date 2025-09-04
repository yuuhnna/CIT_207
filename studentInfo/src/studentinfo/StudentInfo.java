/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentinfo;

/**
 *
 * @author Yana
 */

import java.util.Scanner;

public class StudentInfo {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // ======== Collecting Student Information ========
        
        // Asking for student's name
        System.out.print("Enter Student's Name: ");
        String name = scanner.nextLine();
        
        // Asking for student's age
        System.out.print("Enter Student's Age: ");
        int age = scanner.nextInt();
        
        // Asking for student's General Weighted Average (GWA)
        System.out.print("Enter Student's GWA [e.g 1.00, 1.25, ..., 3.00, 5.00]: ");
        double gwa = scanner.nextDouble();
        
        // Consume leftover newline character from nextInt()/nextDouble()
        scanner.nextLine(); 
        
        // Asking for student's course
        System.out.print("Enter Student's Course: ");
        String course = scanner.nextLine();
        
        // Asking if student is enrolled (Y or N)
        System.out.print("Is the student enrolled? [Y]-Yes [N]-No: ");
        String enrolledInput = scanner.nextLine().trim().toUpperCase(); // clean input
        boolean isEnrolled = enrolledInput.equals("Y"); // enrolled if "Y", otherwise false
        
        
        // ======== Converting GWA to Percentage/Equivalent ========
        String percentageGrade;
        if (gwa == 1.00){
            percentageGrade = "100%";
        } else if (gwa == 1.25){
            percentageGrade = "97%";
        } else if (gwa == 1.50){
            percentageGrade = "94%";
        } else if (gwa == 1.75){
            percentageGrade = "91%";
        } else if (gwa == 2.00){
            percentageGrade = "88%";
        } else if (gwa == 2.25){
            percentageGrade = "85%";
        } else if (gwa == 2.50){
            percentageGrade = "82%";
        } else if (gwa == 2.75){
            percentageGrade = "79%";
        } else if (gwa == 3.00){
            percentageGrade = "76%";
        } else if (gwa == 5.00){
            percentageGrade = "Failed";
        } else {
            percentageGrade = "Invalid Grade Input"; // handles unexpected inputs
        }
        
        
        // ======== Displaying Student's Information ========
        System.out.println("\n====== Student Information ======");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " yrs old");
        System.out.println("GWA: " + gwa);
        System.out.println("Equivalent: " + percentageGrade);
        System.out.println("Course: " + course);
        System.out.println("Enrolled: " + (isEnrolled ? "Yes" : "No"));
        
        // Close scanner to avoid resource leaks
        scanner.close();
    }
}
