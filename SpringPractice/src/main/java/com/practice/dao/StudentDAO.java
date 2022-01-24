package com.practice.dao;

import java.util.List;

import com.practice.entity.Student;

public interface StudentDAO{
	
	public int insertStudent(Student std);
	public int updateStudent(Student std, int stdid);
	public Student fetchStudent(int stdid);
	public List<Student> fetchAllStudent();
}
