package com.company;

public class Student extends User {
    private int yearOfSchool ;

    public int getYearOfSchool() {
        return yearOfSchool;
    }

    public void setYearOfSchool(int yearOfSchool) {
        this.yearOfSchool = yearOfSchool;
    }

    public Student(int yearOfSchool){
        this.yearOfSchool=yearOfSchool;
    }

    public Student(){

    }

}
