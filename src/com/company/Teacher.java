package com.company;

public class Teacher extends User {
    String faculty;
    String courseName;

    public String getFaculty() {

        return faculty;
    }

    public void setFaculty(String faculty) {

        this.faculty = faculty;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Teacher(String faculty , String courseName){

        this.faculty = faculty;
        this.courseName = courseName;
    }

    public Teacher(){

    }
}
