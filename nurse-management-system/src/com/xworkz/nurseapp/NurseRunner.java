package com.xworkz.nurseapp;

import com.xworkz.nurseapp.impl.IcuNurseImpl;
import com.xworkz.nurseapp.nurse.Nurse;

public class NurseRunner {
    public static void main(String[] args) {
        Nurse nurse=new IcuNurseImpl();
        nurse.assist();
        nurse.monitor();
        nurse.care();
    }
}
