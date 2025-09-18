package com.xworkz.teacherapp;

import com.xworkz.teacherapp.impl.MathsTeacherImpl;
import com.xworkz.teacherapp.teacher.Teacher;

public class TeacherRunner {
    public static void main(String[] args) {
        Teacher teacher=new MathsTeacherImpl();
        teacher.guide();
        teacher.teach();
        teacher.evaluate();
    }
}
