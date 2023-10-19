/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitor;

/**
 *
 * @author yasin
 */
 
public class Student {
    private String regNumber;
    private String name;
    private String departmentName;
    // Add any other relevant attributes

    public Student(String regNumber, String name, String departmentName) {
        this.regNumber = regNumber;
        this.name = name;
        this.departmentName = departmentName;
        // Initialize other attributes here
    }

    // Getters and setters for attributes

    @Override
    public String toString() {
        // Return a string representation of the student's information
        return "Reg#: " + regNumber + " | Name: " + name + " | Department: " + departmentName;
    }
}
