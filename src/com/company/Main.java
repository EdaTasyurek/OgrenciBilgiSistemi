package com.company;

public class Main {
    public static void main (String[] args){

        Student student1 = new Student();
        student1.id = 0;
        student1.email = "edkljfksdg";
        student1.lastName="fdsdgdf";
        student1.name="eda";
        student1.password="4545";

        Student student2 = new Student();
        student2.id = 1;
        student2.email = "edkljfksdg";
        student2.lastName="fdsdgdf";
        student2.name="iso";
        student2.password="4545";

        Student student3 = new Student();
        student3.id = 2;
        student3.email = "edkljfksdg";
        student3.lastName="fdsdgdf";
        student3.name="ali";
        student3.password="4545";

        Student student4 = new Student();
        student4.id = 3;
        student4.email = "edkljfksdg";
        student4.lastName="fdsdgdf";
        student4.name="kutsi";
        student4.password="4545";

        StudentManager studentManager = new StudentManager();
        studentManager.add(student1);
        studentManager.add(student2);
        studentManager.add(student3);
        studentManager.add(student4);


        for (int i = 0; i < 4; i++) {
            Student student = studentManager.get(i);
            System.out.println("-------------------------------");
            System.out.println(student.id);
            System.out.println(student.name);
            System.out.println(student.lastName);
            System.out.println(student.email);
            System.out.println("-------------------------------");

        };







    }



}
