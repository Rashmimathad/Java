package com.xworkz.patientapp;

import com.xworkz.patientapp.patient.Patient;
import com.xworkz.patientapp.constant.BloodGroup;
import com.xworkz.patientapp.constant.Gender;

import java.util.ArrayList;
import java.util.List;

public class PatientRunner {



    public static void main(String[] args) {

        PatientRunner runner =new PatientRunner();
        List<Patient> patientsList =new ArrayList<>();

        Patient patientOne = new Patient(1,"Rashmi",21,"Rajajinagar",Gender.FEMALE,BloodGroup.B_NEGATIVE,"Viral Fever");
        Patient patientTwo = new Patient(2,"Inchara",22,"Mariappanapalya",Gender.FEMALE,BloodGroup.A_POSITIVE,"Fever");
        Patient patientThree = new Patient(3,"Sai Kiran",20,"Silk Board",Gender.MALE,BloodGroup.B_POSITIVE,"Cough");
        Patient patientFour = new Patient(4,"Chandra Shekar",23,"Ballari",Gender.MALE,BloodGroup.O_POSITIVE,"High Fever");
        Patient patientFive = new Patient(5,"Lavanya",21,"Gandhi Nagar",Gender.FEMALE,BloodGroup.B_POSITIVE,"Viral fever");
        Patient patientSix = new Patient(6,"Nayana",22,"Yelahanka",Gender.FEMALE,BloodGroup.A_NEGATIVE,"Eye Cataract");
        Patient patientSeven = new Patient(7,"Pavithra",39,"Shashtri Nagar",Gender.FEMALE,BloodGroup.B_POSITIVE,"Diabetis");
        Patient patientEight = new Patient(8,"Prakash",59,"Shashtri Nagar",Gender.MALE,BloodGroup.O_POSITIVE,"High Blood Pressure");
        Patient patientNine = new Patient(9,"Keerthi",21,"Bank Colony",Gender.FEMALE,BloodGroup.AB_POSITIVE,"Fever");
        Patient patientTen =  new Patient(10,"Anusha M P",22,"Yeshwantpura",Gender.FEMALE,BloodGroup.AB_NEGATIVE,"Low Blood Pressure");

        patientsList.add(patientOne);
        patientsList.add(patientTwo);
        patientsList.add(patientThree);
        patientsList.add(patientFour);
        patientsList.add(patientFive);
        patientsList.add(patientSix);
        patientsList.add(patientSeven);
        patientsList.add(patientEight);
        patientsList.add(patientNine);
        patientsList.add(patientTen);


        System.out.println("Patients List info : ");
        for (Patient patient: patientsList){
            System.out.println(patient);
        }
        System.out.println();

        List<Patient> patientsList1 = new ArrayList<>();

        Patient patientEleven =  new Patient(11,"Poojitha",21,"Doddaballapura",Gender.FEMALE,BloodGroup.O_NEGATIVE,"Thyroid");
        Patient patientTwelve = new Patient(12,"Roopa",22,"Ballari",Gender.FEMALE,BloodGroup.AB_NEGATIVE,"Low Blood Pressure");
        Patient patientThirteen = new Patient(13,"Saleem",23,"Parvathi Nagar",Gender.MALE,BloodGroup.O_POSITIVE,"VIral Fever");
        Patient patientFourteen = new Patient(14,"Yuvraj Singh",35,"BTM Layout",Gender.MALE,BloodGroup.A_NEGATIVE,"Blood Cancer");
        Patient patientFifteen = new Patient(15,"Rachana",25,"Nandhi Colony",Gender.FEMALE,BloodGroup.O_NEGATIVE,"Low Blood Pressure");
        Patient patientSixteen = new Patient(16,"Shiva Kumar",65,"Hyderabad",Gender.MALE,BloodGroup.AB_POSITIVE,"Brain Tumor");
        Patient patientSeventeen = new Patient(17,"Saraswathi",50,"Guntakal",Gender.FEMALE,BloodGroup.B_NEGATIVE,"High Blood Pressure");
        Patient patientEighteen = new Patient(18,"Shiva Chikkanna",92,"Ballari",Gender.MALE,BloodGroup.O_POSITIVE,"Diabetis");
        Patient patientNineteen = new Patient(19,"Niranjan",63,"Nandi Colony",Gender.MALE,BloodGroup.B_POSITIVE,"Diabetis");
        Patient patientTwenty = new Patient(20,"Vinutha",35,"Gadag",Gender.FEMALE,BloodGroup.AB_POSITIVE,"Low Blood Group");


        patientsList1.add(patientEleven);
        patientsList1.add(patientTwelve);
        patientsList1.add(patientThirteen);
        patientsList1.add(patientFourteen);
        patientsList1.add(patientFifteen);
        patientsList1.add(patientSixteen);
        patientsList1.add(patientSeventeen);
        patientsList1.add(patientEighteen);
        patientsList1.add(patientNineteen);
        patientsList1.add(patientTwenty);

        System.out.println("Patients List 1 info : ");
        for (Patient patient: patientsList1){
            System.out.println(patient);
        }

        System.out.println();
        System.out.println("Total Patients List : ");
        patientsList.addAll(patientsList1);
        for (Patient patient: patientsList){
            System.out.println(patient);
        }

        System.out.println();
        System.out.println("Is Patient thirteen removed : "+ patientsList.remove(patientThirteen));
        System.out.println("Is Patients List 1 removed : "+ patientsList.removeAll(patientsList1));


        System.out.println();
        System.out.println("Is Patients List 1 added : "+ patientsList.addAll(patientsList1));
        System.out.println("Total Patients List : ");
        for (Patient patient: patientsList){
            System.out.println(patient);
        }

        System.out.println();
        System.out.println("Is Patients List contains patient five : "+patientsList.contains(patientFive));
        System.out.println("Is Patients List contains Patients List1 : "+patientsList.containsAll(patientsList1));

        System.out.println();
        System.out.println("Is Patients List 1 retained : "+ patientsList.retainAll(patientsList1));
        for (Patient patient: patientsList){
            System.out.println(patient);
        }

    }
}
