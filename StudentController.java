package com.controller;

import com.entity.Student;
import com.service.StudentService;

import java.util.List;

public class StudentController {
    private StudentService studentService = new StudentService();

    // 1. Add a new student
    public void createStudent(int id, String name, int age) {
        Student student = new Student(id, name, age);
        studentService.addStudent(student);
        System.out.println("Student added successfully: " + student);
    }

    // 2. Get all students
    public void getAllStudents() {
        List<Student> students = studentService.getAllStudents();
        for (Student student : students) {
            System.out.println(student);
        }
    }

    // 3. Find a student by ID
    public void findStudentById(int id) {
        Student student = studentService.getStudentById(id);
        if (student != null) {
            System.out.println("Student found: " + student);
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    // 4. Update a student’s name by ID
    public void updateStudentName(int id, String newName) {
        Student student = studentService.getStudentById(id);
        if (student != null) {
            student.setName(newName);
            System.out.println("Student name updated successfully to: " + newName);
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    // 5. Update a student’s age by ID
    public void updateStudentAge(int id, int newAge) {
        Student student = studentService.getStudentById(id);
        if (student != null) {
            student.setAge(newAge);
            System.out.println("Student age updated successfully to: " + newAge);
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    // 6. Delete a student by ID
    public void deleteStudentById(int id) {
        List<Student> students = studentService.getAllStudents();
        Student toDelete = null;
        for (Student student : students) {
            if (student.getId() == id) {
                toDelete = student;
                break;
            }
        }
        if (toDelete != null) {
            students.remove(toDelete);
            System.out.println("Student with ID " + id + " deleted successfully.");
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    // 7. Check if a student exists by ID
    public void checkStudentExists(int id) {
        Student student = studentService.getStudentById(id);
        if (student != null) {
            System.out.println("Student with ID " + id + " exists.");
        } else {
            System.out.println("Student with ID " + id + " does not exist.");
        }
    }

    // 8. Get the total number of students
    public void getTotalNumberOfStudents() {
        int total = studentService.getAllStudents().size();
        System.out.println("Total number of students: " + total);
    }

    // 9. List all students with a specific age
    public void getStudentsByAge(int age) {
        List<Student> students = studentService.getAllStudents();
        System.out.println("Students with age " + age + ":");
        for (Student student : students) {
            if (student.getAge() == age) {
                System.out.println(student);
            }
        }
    }

    // 10. Delete all students
    public void deleteAllStudents() {
        List<Student> students = studentService.getAllStudents();
        students.clear();
        System.out.println("All students have been deleted.");
    }
}
