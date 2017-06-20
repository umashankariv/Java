package com.sample;
import java.util.List;

import javax.sql.DataSource;

public interface StudentDAO {

	public void create(String name, Integer id);

	public Student getStudent(Integer id);

	public void update(Integer id);

	public void delete(Integer id);

	public List<Student> fetchStudents();

	public void setDataSource(DataSource ds);

}
