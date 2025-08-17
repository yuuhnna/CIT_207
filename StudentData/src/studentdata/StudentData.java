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
     name(string), age(int), grade(double), isEnrolled(boolean)
    */
    
    public static void main(String[] args) {
        String name = "Allanah";
        int age = 19;
        double grade = 1.5;
        boolean isEnrolled = true;
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        
        if (isEnrolled){
            System.out.println("Enrolled: Yes");
        } else {
            System.out.println("Enrolled: No");
        }
    }
    
}
