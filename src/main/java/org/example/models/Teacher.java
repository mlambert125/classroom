package org.example.models;

public class Teacher {
    private int id;
    private String firstName;
    private String lastName;
    private String email;

    public Teacher() {
    }

    public Teacher(int id, String email, String lastName, String firstName) {
        this.id = id;
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

    public String toString() {
        return this.firstName + " " + this.lastName + " " + this.email;
    }
}
