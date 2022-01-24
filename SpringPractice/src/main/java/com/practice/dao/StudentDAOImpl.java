package com.practice.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.practice.entity.Student;

@Component("stdobj")
@ComponentScan(basePackages = "com.practice.dao")
public class StudentDAOImpl implements StudentDAO {
	@Autowired
	private JdbcTemplate template;
	String qry;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

// Insert Query
	public int insertStudent(Student std) {

		qry = "insert into student values(?,?,?,?,?)";
		int x = template.update(qry, std.getStdid(), std.getFees(), std.getName(), std.getPancard(), std.getStdname());
		return x;
	}

	public int updateStudent(Student std, int stdid) {

		qry = "update student set fees=?,name=? where stdid=?";
		int x = template.update(qry, std.getFees(), std.getName(), stdid);
		return x;
	}

	public Student fetchStudent(int stdid) {
		
		QueryMapperImpl mapper = new QueryMapperImpl();
		qry = "select * from Student where stdid=?";
		
		Student std = this.template.queryForObject(qry,mapper,stdid);
		return std;
	}

	public List<Student> fetchAllStudent() {
		QueryMapperImpl mapper = new QueryMapperImpl();
		qry = "select * from Student";
		
		List<Student>  std = this.template.query(qry,mapper);
		return std;
	}

}