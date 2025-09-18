package com.xworkz.teacherapp.impl;

import com.xworkz.teacherapp.teacher.Teacher;

public class MathsTeacherImpl implements Teacher {
    @Override
    public void teach() {
        System.out.println("Maths teacher teaches maths");
    }

    @Override
    public void evaluate() {
        System.out.println("Maths teacher evaluates maths test");
    }

    @Override
    public void guide() {
        System.out.println("Maths teacher guides");
    }
}
