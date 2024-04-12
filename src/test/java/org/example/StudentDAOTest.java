package org.example;
import org.example.dao.*;
import org.example.models.*;
import java.util.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StudentDAOTest extends BaseDaoTests {
    private StudentDAO studentDAO;

    private static final Student STUDENT_1 = new Student(
        1, 1, "bblevins@gmail.com", "Blevins", "Beau"
    );
    private static final Student STUDENT_2 = new Student(
        2, 1, "cnoel@gmail.com", "Noel", "Cina"
    );
    private static final Student STUDENT_3 = new Student(
        3, 1, "eguo@gmail.com", "Guo", "Eddy"
    );
    private static final Student STUDENT_4 = new Student(
        4, 2, "jwong@gmail.com", "Wong", "Justin"
    );
    private static final Student STUDENT_5 = new Student(
        5, 2, "ljohnson@gmail.com", "Johnson", "Lena"
    );
    private static final Student STUDENT_6 = new Student(
        6, 2, "rvincelli@gmail.com", "Vincelli", "Raina"
    );

    @Before
    public void setup() {
        studentDAO = new StudentDAO(dataSource);
    }

    @Test
    public void getAllStudents_returns_all_students() {
        List<Student> students = studentDAO.getAllStudents();
        Assert.assertEquals(6, students.size());

        assertStudentsMatch(STUDENT_1, students.get(0));
        assertStudentsMatch(STUDENT_2, students.get(1));
        assertStudentsMatch(STUDENT_3, students.get(2));
        assertStudentsMatch(STUDENT_4, students.get(3));
        assertStudentsMatch(STUDENT_5, students.get(4));
        assertStudentsMatch(STUDENT_6, students.get(5));
    }

    private void assertStudentsMatch(Student expected, Student actual) {
        Assert.assertEquals(expected.getId(), actual.getId());
        Assert.assertEquals(expected.getTeacher_id(), actual.getTeacher_id());
        Assert.assertEquals(expected.getEmail(), actual.getEmail());
        Assert.assertEquals(expected.getFirstName(), actual.getFirstName());
        Assert.assertEquals(expected.getLastName(), actual.getLastName());
    }
}
