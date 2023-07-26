package net.stumang.springboot.service;


import java.util.List;

import net.stumang.springboot.model.Student;
	
	public interface StudentService {
		List<Student> getAllStudent();
		void saveStudent(Student student);
		Student getStudentById(long id);
		void deleteStudentById(long id);


	}


