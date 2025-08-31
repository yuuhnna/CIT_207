/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Yana
 */

import java.util.ArrayList;

// Student class demonstrating encapsulation with private attributes
class Student { 
    private int studentId;
    private String name;
    private int age;
    
    private Course course; // One-to-one relationship
    
    // Method to set student info using 'this' keyword
    public void setStudentInfo(int studentId, String name, int age) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
    }
    
    // Method to display student information
    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        if (course != null){
            System.out.println("Enrolled Course: " + course.getCourseName());
        }
    }
    
    // Getters for each attributes
    public int getStudentId(){
        return studentId;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    // Setters for each attributes
    public void setStudentId(int studentId){
        this.studentId = studentId;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public Course getCourse() {
        return course;
    }
    
    public void setCourse(Course course) {
        this.course = course;
    }
}

// Course class with different access modifiers
class Course {
    private int courseId;
    public String courseName;
    protected int credits;
    
    // Constructor to initialize all attributes
    public Course(int courseId, String courseName, int credits) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
    }
    
    // Method to display course information
    public void displayCourseInfo() {
        System.out.println("Course ID: " + courseId);
        System.out.println("Course Name: " + courseName);
        System.out.println("Credits: " + credits);
    }
    
    // Getter and setter for private courseId
    public int getCourseId(){
        return courseId;
    }
    
    public void setCourseId(int courseId){
        this.courseId = courseId;
    }
    
    // Getter and setter for protected credits
    public int getCredits() {
        return credits;
    }
    
    public void setCredits(int credits){
        this.credits = credits;
    }
    
    // Getter for courseName (public but still encapsulated)
    public String getCourseName() {
        return courseName;
    }
}

// University class with final method
final class University {
    //Final method that cannot be overridden
    public final void showUniversityName() {
        System.out.println("West Visayas State University");
    }
}

// Department class
final class Department {
    private String departmentName;
    
    public Department(String departmentName) {
        this.departmentName = departmentName;
    }
    
    public String getDepartmentName() {
        return departmentName;
    }
    
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    
/*
    ERROR: The type University cannot subclass the final class Department

    COMMENT: In Java, a class declared with the 'final' keyword cannot be extended.
             This means the 'Department' class cannot be inherited by other classes,
             ensuring that its implementation remains unchanged and protected from
             further modification.
*/

}

// CourseManagement class for one-to-many relationship
class CourseManagement {
    private Course course;
    private ArrayList<Student> students;
    
    public CourseManagement(Course course) {
        this.course = course;
        this.students = new ArrayList<>();
    }
    
    public void addStudent(Student student) {
        students.add(student);
        student.setCourse(course);
    }
    
    public void displayEnrolledStudents() {
        System.out.println("[ Students enrolled in " + course.getCourseName() + " ]");
        for (Student student : students) {
            student.displayStudentInfo();
            System.out.println("=====================================");
        }
    }
}

// Main Class
public class Main {
    
    public static void main(String[] args) {
        
        // Create University and display its name
        University university = new University();
        System.out.println("====== University Information ======");
        university.showUniversityName();
        
        // Create Department
        Department csDepartment = new Department("Computer Science");
        System.out.println("Department: " + csDepartment.getDepartmentName());
        System.out.println();
        
        // Create Course Objects
        Course javaCourse = new Course(101, "Java Programming", 3);
        Course webCourse = new Course(102, "Web Development", 3);
        
        System.out.println("====== Course Information ======");
        javaCourse.displayCourseInfo();
        System.out.println();
        webCourse.displayCourseInfo();
        System.out.println();
        
        // Create Student Objects
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        
        // Set student info using setStudentInfo method
        student1.setStudentInfo(1001, "Rebecca Armstrong", 22);
        student2.setStudentInfo(1002, "Sarocha Chankimha", 26);
        student3.setStudentInfo(1003, "Yana Bragancia", 19);
        student4.setStudentInfo(1004, "Jeanamy Pampag", 20);
        
        // Demonstrates setters and getters
        System.out.println("====== Demonstrating Getters & Setters ======");
        System.out.println("Original Name of student1: " + student1.getName());
        student1.setName("Becky Rebecca");
        System.out.println("Updated Name of student1: " + student1.getName());
        System.out.println();
        
        // Demonstrates One-to-One Relationship
        System.out.println("====== One-to-One Relationship ======");
        student1.setCourse(javaCourse);
        student1.displayStudentInfo();
        System.out.println();
        
        // Demonstrates one-to-many relationship
        System.out.println("====== One-to-Many Relationship ======");
        CourseManagement javaManagement = new CourseManagement(javaCourse);
        javaManagement.addStudent(student1);
        javaManagement.addStudent(student2);
        
        CourseManagement webManagement = new CourseManagement(webCourse);
        webManagement.addStudent(student3);
        webManagement.addStudent(student4);
        
        javaManagement.displayEnrolledStudents();
        System.out.println();
        webManagement.displayEnrolledStudents();
    }
}




