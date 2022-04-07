package com.company;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    List<Student> students = new ArrayList();

    public void add(Student student){
        students.add(student);
        System.out.println(student.name + " Listeye eklendi");
    }

    public void delete(Student student){
        students.remove(0);
        System.out.println(student);
    }

    public Student get(int id){

        return students.get(id);

    }




}
