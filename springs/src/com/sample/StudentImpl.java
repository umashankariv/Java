package com.sample;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentImpl implements StudentDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public void create(String name, Integer id) {
		// TODO Auto-generated method stub

	}

/*	public Student getStudent(Integer id) {
		System.out.println("I'm into getStudent()");
		String SQL = "select * from [SalesLT].[Customer] where id = ?";
		Student student = jdbcTemplateObject.queryForObject(SQL,
				new Object[] { id }, new StudentMapper());

		return student;*/
	

	public void update(Integer id) {
		// TODO Auto-generated method stub

	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub

	}

	public List<Student> fetchStudents() {
		 String SQL = "select * from login ";
	      List <Student> students = jdbcTemplateObject.query(SQL, new StudentMapper());
	      return students;// TODO Auto-generated method stub
	}

	public Student getStudent(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}


}
