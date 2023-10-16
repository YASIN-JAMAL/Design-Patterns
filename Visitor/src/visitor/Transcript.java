/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitor;

/**
 *
 * @author yasin
 */

public class Transcript {
    private String regNumber;
    private String courseName;
    private String grade;
    // Add any other relevant attributes

    public Transcript(String regNumber, String courseName, String grade) {
        this.regNumber = regNumber;
        this.courseName = courseName;
        this.grade = grade;
        // Initialize other attributes here
    }

    // Getters and setters for attributes

    @Override
    public String toString() {
        // Return a string representation of the transcript information
        return "Reg#: " + regNumber + " | Course: " + courseName + " | Grade: " + grade;
    }
}
