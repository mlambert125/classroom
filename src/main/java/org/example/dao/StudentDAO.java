package org.example.dao;

import org.apache.commons.dbcp2.BasicDataSource;
import org.example.models.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.util.*;

public class StudentDAO {
    JdbcTemplate jdbcTemplate;

    public StudentDAO(BasicDataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        String sql = "SELECT * FROM students ORDER BY id ASC;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while (results.next()) {
            Student student = mapRowToStudent(results);
            students.add(student);
        }
        return students;
    }

    private Student mapRowToStudent(SqlRowSet row) {
        Student student = new Student();
        student.setId(row.getInt("id"));
        student.setFirstName(row.getString("first_name"));
        student.setLastName(row.getString("last_name"));
        student.setEmail(row.getString("email"));
        student.setTeacher_id(row.getInt("teacher_id"));
        return student;
    }
}
