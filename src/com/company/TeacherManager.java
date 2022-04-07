package com.company;

import java.util.ArrayList;
import java.util.List;

public class TeacherManager {
    List<Teacher> teachers = new ArrayList();

    public void add(Teacher teacher){
        teachers.add(teacher);
        System.out.println(teacher.name + " Listeye eklendi");
    }

    public void delete(Teacher teacher){
        teachers.remove(0);
        System.out.println(teachers);
    }


    public Teacher get(int id){

        return teachers.get(id);

    }


}


