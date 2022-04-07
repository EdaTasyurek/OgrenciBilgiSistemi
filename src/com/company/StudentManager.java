package com.company;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    List<Student> list = new ArrayList();

    public void add(Student student){
        list.add(student);
        System.out.println(student.name + " Listeye eklendi");
    }

    public void delete(Student student){
        list.remove(0);
        System.out.println(list + " Güncel Liste");
    }

    public void update(Student student,int id){
        list.set(id,student);
        System.out.println(list);
    }

    public Student get(int id){

        return list.get(id);

    }




}
