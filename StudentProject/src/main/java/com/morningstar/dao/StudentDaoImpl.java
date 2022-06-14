/*
 * package com.morningstar.dao;
 * 
 * import java.sql.Connection; import java.sql.DriverManager; import
 * java.sql.PreparedStatement; import java.sql.ResultSet; import
 * java.sql.SQLException; import java.sql.Statement; import java.util.ArrayList;
 * import java.util.List;
 * 
 * import com.morningstar.model.Student;
 * 
 * public class StudentDaoImpl implements StudentDao {
 * 
 * public static Connection connection = null;
 * 
 * public static Connection getConnection() { return connection; }
 * 
 * static { try { Class.forName("oracle.jdbc.driver.OracleDriver"); connection =
 * DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr",
 * "hr"); connection.setAutoCommit(false); } catch (ClassNotFoundException |
 * SQLException e) { System.out.println("There is some problem" +
 * e.getMessage()); } }
 * 
 * @Override public int createStudent(Student student) throws SQLException {
 * String sql =
 * "Insert into Student(Student_Id,Student_Name,Student_Score) values(?,?,?)";
 * PreparedStatement stmt = connection.prepareStatement(sql); stmt.setInt(1,
 * student.getStudentId()); stmt.setString(2, student.getStudentName());
 * stmt.setDouble(3, student.getStudentScore()); int result =
 * stmt.executeUpdate(); stmt.close(); return result;
 * 
 * }
 * 
 * @Override public Student readStudent(int studentId) throws SQLException {
 * String sql = "select * from Student where StudenrId=" + studentId; Statement
 * stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(sql);
 * Student student = null; if (rs.next()) {
 * student.setStudentId(rs.getInt("Student_Id"));
 * student.setStudentName(rs.getString("Student_Name"));
 * student.setStudentScore(rs.getDouble("Student_Score")); } stmt.close();
 * return student; }
 * 
 * @Override public List<Student> readAllStudents() throws SQLException { String
 * sql = "Select * from Student"; java.sql.Statement stmt =
 * connection.createStatement(); ResultSet rs = stmt.executeQuery(sql); Student
 * student = null; List<Student> list = new ArrayList<>(); while(rs.next()) {
 * int studId = rs.getInt("Student_Id"); String studName =
 * rs.getString("Student_Name"); double studScore =
 * rs.getDouble("Student_Score"); student = new Student(studId, studName,
 * studScore); list.add(student); } return list; }
 * 
 * }
 */