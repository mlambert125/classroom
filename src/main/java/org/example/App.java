package org.example;
import org.apache.commons.dbcp2.BasicDataSource;
import org.example.dao.StudentDAO;
import org.example.dao.TeacherDAO;
import org.example.models.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

/**
 * Hello world!
 *
 */
public class App {
    private static StudentDAO studentDAO;
    private static TeacherDAO teacherDAO;


    public static void main( String[] args ) {
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setUrl("jdbc:postgresql://localhost:5432/classroom");
        basicDataSource.setUsername("postgres");
        basicDataSource.setPassword("postgres1");

        studentDAO = new StudentDAO(basicDataSource);
        teacherDAO = new TeacherDAO(basicDataSource);

        System.out.println("Students:");

        for (Student student : studentDAO.getAllStudents()) {
            System.out.println(student);
        }
    }
}
