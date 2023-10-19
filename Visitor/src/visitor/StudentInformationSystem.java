/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitor;

/**
 *
 * @author yasin
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentInformationSystem {
    private static final String STUDENT_FILE = "Student.txt";
    private static final String TRANSCRIPT_FILE = "Transcript.txt";

    // Function to add a student record to Student.txt
    public static void addStudentRecord(Student student) {
        try (FileWriter writer = new FileWriter(STUDENT_FILE, true);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            bufferedWriter.write(student.toString() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Function to view student records from Student.txt
    public static List<Student> viewStudentRecords() {
        List<Student> students = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(STUDENT_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Parse the line and create Student objects
                // Add them to the students list
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }

    // Implement update and delete methods for student records similarly

    // Function to add a student transcript to Transcript.txt
    public static void addStudentTranscript(Transcript transcript) {
        try (FileWriter writer = new FileWriter(TRANSCRIPT_FILE, true);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            bufferedWriter.write(transcript.toString() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Implement view, update, and delete methods for transcripts similarly

    // Other functions to generate information like name, Reg#, depName, Course name, and Grade

    public static void main(String[] args) {
        // Your program's entry point
    }
}

