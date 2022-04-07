package com.company;

public class Student extends User {
    private int yearOfSchool ;
    private int averageGrade;

    public int getYearOfSchool() {
        return yearOfSchool;
    }

    public void setYearOfSchool(int yearOfSchool) {
        this.yearOfSchool = yearOfSchool;
    }

    public int getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(int averageGrade) {
        this.averageGrade = averageGrade;
    }

    public Student(int yearOfSchool , int averageGrade){
        this.yearOfSchool = yearOfSchool;
        this.averageGrade = averageGrade;
    }
    public Student(){

    }

}
