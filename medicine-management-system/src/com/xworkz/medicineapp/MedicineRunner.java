package com.xworkz.medicineapp;

import com.xworkz.medicineapp.dolo.Dolo;
import com.xworkz.medicineapp.medicine.Medicine;

public class MedicineRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Medicine medicineOne=new Dolo();
        medicineOne.medicine();
        System.out.println("main ended");
    }
}
