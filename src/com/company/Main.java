package com.company;

public class Main {
    public static void main (String[] args){

        Student student1 = new Student();
        student1.id = 0;
        student1.name="Eda";
        student1.lastName="Taşyürek";
        student1.password="4545";
        student1.email = "tasyurekeda@gmail.com";
        student1.setYearOfSchool(1);
        student1.setAverageGrade(2);

        Student student2 = new Student();
        student2.id = 1;
        student2.name="İsmail";
        student2.lastName="Karaca";
        student1.password="7878";
        student2.email = "ismailkrc@gmail.com";
        student2.setAverageGrade(4);
        student2.setYearOfSchool(3);



        Teacher teacher1 = new Teacher();
        teacher1.id = 0;
        teacher1.name = "Ayşe";
        teacher1.lastName = "Yüksel";
        teacher1.password = "9898";
        teacher1.email = "ayseyuksel@gmail.com";
        teacher1.faculty = "Eğitim";
        teacher1.courseName = "Pdr";

        Teacher teacher2 = new Teacher();
        teacher2.id =1;
        teacher2.name = "Volkan";
        teacher2.lastName = "Tunalı";
        teacher2.password = "2525";
        teacher2.email = "volkantunali@gmail.com";
        teacher2.faculty = "Mühendislik";
        teacher2.courseName="Database System";

        StudentManager studentManager = new StudentManager();
        studentManager.add(student1);
        studentManager.add(student2);

        TeacherManager teacherManager = new TeacherManager();
        teacherManager.add(teacher1);
        teacherManager.add(teacher2);


        for (int i = 0; i < 2; i++) {
            Student student = studentManager.get(i);
            System.out.println("-------------------------------");
            System.out.println("Student ID : " + student.id);
            System.out.println("Name :" +student.name);
            System.out.println("Lastname :" + student.lastName);
            System.out.println("Email :" + student.email);
            System.out.println("Average Grade :" + student.getAverageGrade());
            System.out.println("Year of school :" +student.getYearOfSchool());
            System.out.println("-------------------------------");

        }

        for (int i = 0 ; i<2 ; i++){

            Teacher teacher = teacherManager.get(i);
            System.out.println("Teacher ID:" + teacher.id);
            System.out.println("Name :" + teacher.name);
            System.out.println("Faculty : " +teacher.getFaculty());
            System.out.println("Course name : " + teacher.getCourseName());
            System.out.println("------------------------");
        }








    }



}
