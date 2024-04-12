package org.example.dao;

import org.apache.commons.dbcp2.BasicDataSource;
import org.example.models.Teacher;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.util.*;

public class TeacherDAO {
    private JdbcTemplate jdbcTemplate;

    public TeacherDAO (BasicDataSource dataSource) {
       jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<Teacher> getAllTeachers() {
        List<Teacher> teachers = new ArrayList<>();

        String sql = "SELECT * FROM teachers ORDER BY id ASC;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);

        while (results.next()) {
            Teacher teacher = mapRowToTeacher(results);
            teachers.add(teacher);
        }
        return teachers;
    }

    public Teacher mapRowToTeacher(SqlRowSet row) {
        Teacher teacher = new Teacher();
        teacher.setId(row.getInt("id"));
        teacher.setFirstName(row.getString("first_name"));
        teacher.setLastName(row.getString("last_name"));
        teacher.setEmail(row.getString("email"));

        return teacher;
    }
}
