package com.company;

public class Teacher extends User {
    String faculty;

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Teacher(String faculty){
        this.faculty = faculty;
    }
}
