package com.demo.crudApplication;

import com.demo.crudApplication.model.Student;
import com.demo.crudApplication.repository.StudentRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

@SpringBootTest
class CrudApplicationTests {

	@Autowired
	private StudentRepository studentRepository;

	@Test
	void contextLoads() {
		Assertions.assertDoesNotThrow(() -> System.out.println("Application context loaded successfully."));
	}

	@Test
	void testCreateStudent() {
		Student student = new Student();
		student.setStudentName("John");
		student.setLastName("Doe");
		student.setEmail("john.doe@example.com");
		student.setPhoneNumber("1234567890");
		student.setDob(LocalDate.parse("2000-01-01"));
		student.setBranch("Computer Science");

		Student savedStudent = studentRepository.save(student);

		Assertions.assertNotNull(savedStudent.getStudentId());
		Assertions.assertEquals("John", savedStudent.getStudentName());
	}

	@Test
	void testReadStudents() {
		List<Student> students = studentRepository.findAll();
		Assertions.assertNotNull(students);
		Assertions.assertTrue(students.size() > 0, "Student list should not be empty.");
	}

	@Test
	void testUpdateStudent() {
		Student student = studentRepository.findById(1L).orElseThrow(() ->
				new RuntimeException("Student not found with ID 1"));
		student.setBranch("Electronics");

		Student updatedStudent = studentRepository.save(student);

		Assertions.assertEquals("Electronics", updatedStudent.getBranch());
	}

	@Test
	void testDeleteStudent() {
		Long studentId = 2L; // Replace with an actual ID in your DB
		studentRepository.deleteById(studentId);

		Assertions.assertFalse(studentRepository.existsById(studentId),
				"Student with ID " + studentId + " should be deleted.");
	}
}

