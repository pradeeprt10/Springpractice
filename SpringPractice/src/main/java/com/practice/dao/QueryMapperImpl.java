package com.practice.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Set;

import org.springframework.jdbc.core.RowMapper;

import com.practice.entity.Student;

public class QueryMapperImpl implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student std = new Student();
		
		std.setStdid(rs.getInt(1));
		std.setFees(rs.getInt(2));
		std.setName(rs.getString(3));
		std.setPancard(rs.getString(4));
		std.setStdname(rs.getString(5));
		return std;
	}
	

}
