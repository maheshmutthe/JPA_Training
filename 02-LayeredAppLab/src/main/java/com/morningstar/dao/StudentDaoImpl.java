package com.morningstar.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.morningstar.model.Student;

public class StudentDaoImpl implements StudentDao {

	private static Connection connection = null;
	
//we can now control commit manually from outside the class because of this getter method
	public static Connection getConnection() {
		return connection;
	}

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			connection.setAutoCommit(false); 	//we can decide when we want to commit and when to rollback
			
		} catch (ClassNotFoundException | SQLException e) // syntax for multiple exception
		{
			System.out.println("There is some problem");
			e.printStackTrace(); // log the stack trace
		}
	}

//INSERT SECTION OF THE CRUD OPERATION
	@Override
	public int createStudent(Student student) throws SQLException {
		String sql = "Insert Into Student(Student_Id, Student_Name, Student_Score) Values( ?, ?, ?)";
		PreparedStatement pstmt = connection.prepareStatement(sql);
		
		pstmt.setInt(1, student.getStudentId());
		pstmt.setString(2, student.getStudentName());
		pstmt.setDouble(3, student.getStudentScore());
		
		int result = pstmt.executeUpdate();
		
//ONCE EXECUTION IS SUCCESSFUL YOU CAN CLOSE THE PSTMT
		pstmt.close();
		
		return result;
	}

	
//SELECT SECTION OF THE CRUD OPERATION
	@Override
	public Student readStudent(int StudentId) throws SQLException {
		String sql = "Select * From Student Where Student_Id=" + StudentId;
		Statement stmt = connection.createStatement();
		
		ResultSet rs =  stmt.executeQuery(sql);
		
		Student student = null;
		while( rs.next())
		{
			int stuId = rs.getInt("Student_Id");
			String stuName = rs.getString("Student_Name");
			double stuScore = rs.getDouble("Student_Score");
			
			student = new Student(stuId, stuName, stuScore);
		}
		return student;
	}


	@Override
	public List<Student> readAllStudents() throws SQLException {
		String sql = "Select * From Student";
		Statement stmt = connection.createStatement();
		
		ResultSet rs =  stmt.executeQuery(sql);
		
		List<Student> list = new ArrayList<Student>();
		while( rs.next())
		{
			int stuId = rs.getInt("Student_Id");
			String stuName = rs.getString("Student_Name");
			double stuScore = rs.getDouble("Student_Score");
			
			Student student = new Student(stuId, stuName, stuScore);
			list.add(student);
		}
		return list;
	}
}











