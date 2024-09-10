package com.test;

import com.controller.StudentController;

public class StudentTest {
	public static void main(String[] args) {
		StudentController studentController = new StudentController();

		// Adding students
		studentController.createStudent(1, "omkar", 20);
		studentController.createStudent(2, "pranav", 22);
		studentController.createStudent(3, "soham", 21);

		// Display all students
		System.out.println("\nAll Students:");
		studentController.getAllStudents();

		// Find student by ID
		System.out.println("\nFind student with ID 2:");
		studentController.findStudentById(2);

		// Update student name
		System.out.println("\nUpdate student name for ID 1:");
		studentController.updateStudentName(1, "Alice Smith");

		// Update student age
		System.out.println("\nUpdate student age for ID 3:");
		studentController.updateStudentAge(3, 23);

		// Check if student exists
		System.out.println("\nCheck if student with ID 2 exists:");
		studentController.checkStudentExists(2);

		// Get total number of students
		System.out.println("\nTotal number of students:");
		studentController.getTotalNumberOfStudents();

		// Get students by age
		System.out.println("\nStudents with age 23:");
		studentController.getStudentsByAge(23);

		// Delete a student
		System.out.println("\nDelete student with ID 2:");
		studentController.deleteStudentById(2);

		// Delete all students
		System.out.println("\nDelete all students:");
		studentController.deleteAllStudents();
	}
}
