package com.service;

import com.dao.StudentDao;
import com.entity.Student;

import java.util.List;

public class StudentService {
	private StudentDao studentDao = new StudentDao();

	// Add a student
	public void addStudent(Student student) {
		studentDao.addStudent(student);
	}

	// Get all students
	public List<Student> getAllStudents() {
		return studentDao.getAllStudents();
	}

	// Get a student by ID
	public Student getStudentById(int id) {
		return studentDao.findStudentById(id);
	}
}
