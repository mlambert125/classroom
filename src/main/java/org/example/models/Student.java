package org.example.models;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private int teacher_id;

    public Student() {
    }

    public Student(int id, int teacher_id, String email, String lastName, String firstName) {
        this.id = id;
        this.teacher_id = teacher_id;
        this.email = email;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String toString() {
        return this.firstName + " " + this.lastName + " " + this.email + " " + this.teacher_id;
    }
}
