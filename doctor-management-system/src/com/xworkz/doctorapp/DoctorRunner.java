package com.xworkz.doctorapp;

import com.xworkz.doctorapp.doctor.Doctor;

import java.util.ArrayList;
import java.util.List;

public class DoctorRunner {

    public static void main(String[] args) {

        List<Doctor> doctors = new ArrayList<>();

        Doctor doctorOne = new Doctor(1, "John Doe", "Cardiologist", 10, 8, 9);
        Doctor doctorTwo = new Doctor(2, "Jane Smith", "Dermatologist", 8, 6, 8);
        Doctor doctorThree = new Doctor(3, "Alice Johnson", "Pediatrician", 12, 10, 9);
        Doctor doctorFour = new Doctor(4, "Bob Brown", "Neurologist", 15, 5, 8);
        Doctor doctorFive = new Doctor(5, "Charlie Davis", "Orthopedic", 9, 7, 9);
        Doctor doctorSix = new Doctor(6, "Diana Evans", "Gynecologist", 11, 8, 9);
        Doctor doctorSeven = new Doctor(7, "Eve Harris", "ENT Specialist", 7, 6, 8);
        Doctor doctorEight = new Doctor(8, "Frank Clark", "Psychiatrist", 14, 5, 8);
        Doctor doctorNine = new Doctor(9, "Grace Lewis", "General Surgeon", 13, 7, 9);
        Doctor doctorTen = new Doctor(10, "Henry Walker", "Ophthalmologist", 10, 8, 9);
        Doctor doctorEleven = new Doctor(11, "Ivy Hall", "Cardiologist", 9, 6, 8);
        Doctor doctorTwelve = new Doctor(12, "Jack Allen", "Dermatologist", 12, 7, 9);
        Doctor doctorThirteen = new Doctor(13, "Kathy Young", "Pediatrician", 8, 5, 8);
        Doctor doctorFourteen = new Doctor(14, "Leo Hernandez", "Neurologist", 15, 6, 8);
        Doctor doctorFifteen = new Doctor(15, "Mona King", "Orthopedic", 11, 8, 9);
        Doctor doctorSixteen = new Doctor(16, "Nina Wright", "Gynecologist", 10, 7, 9);
        Doctor doctorSeventeen = new Doctor(17, "Oscar Scott", "ENT Specialist", 9, 6, 8);
        Doctor doctorEighteen = new Doctor(18, "Paul Green", "Psychiatrist", 14, 5, 8);
        Doctor doctorNineteen = new Doctor(19, "Quincy Adams", "General Surgeon", 13, 7, 9);
        Doctor doctorTwenty = new Doctor(20, "Rachel Baker", "Ophthalmologist", 10, 8, 9);

        doctors.add(doctorOne);
        doctors.add(doctorTwo);
        doctors.add(doctorThree);
        doctors.add(doctorFour);
        doctors.add(doctorFive);
        doctors.add(doctorSix);
        doctors.add(doctorSeven);
        doctors.add(doctorEight);
        doctors.add(doctorNine);
        doctors.add(doctorTen);
        doctors.add(doctorEleven);
        doctors.add(doctorTwelve);
        doctors.add(doctorThirteen);
        doctors.add(doctorFourteen);
        doctors.add(doctorFifteen);
        doctors.add(doctorSixteen);
        doctors.add(doctorSeventeen);
        doctors.add(doctorEighteen);
        doctors.add(doctorNineteen);
        doctors.add(doctorTwenty);

        System.out.println("Total doctors:");
        for (Doctor doctor : doctors) {
            System.out.println(doctor);
        }
        System.out.println();

        List<Doctor> additionalDoctors = new ArrayList<>();
        Doctor doctorTwentyOne = new Doctor(21, "Steve Moore", "Cardiologist", 11, 8, 9);
        Doctor doctorTwentyTwo = new Doctor(22, "Tracy Taylor", "Dermatologist", 9, 6, 8);
        Doctor doctorTwentyThree = new Doctor(23, "Uma Harris", "Pediatrician", 12, 7, 9);
        Doctor doctorTwentyFour = new Doctor(24, "Victor Martinez", "Neurologist", 14, 6, 8);
        Doctor doctorTwentyFive = new Doctor(25, "Wendy Robinson", "Orthopedic", 10, 8, 9);

        additionalDoctors.add(doctorTwentyOne);
        additionalDoctors.add(doctorTwentyTwo);
        additionalDoctors.add(doctorTwentyThree);
        additionalDoctors.add(doctorTwentyFour);
        additionalDoctors.add(doctorTwentyFive);

        System.out.println("Total additional doctors:");
        for (Doctor doctor : additionalDoctors) {
            System.out.println(doctor);
        }
        System.out.println();

        System.out.println("Is additionalDoctors added to doctors: " + doctors.addAll(additionalDoctors));
        System.out.println("Is doctors contains doctorSeven: " + doctors.contains(doctorSeven));
        System.out.println("Is doctors contains all additionalDoctors: " + doctors.containsAll(additionalDoctors));
        System.out.println();

        System.out.println("Total doctors:");
        for (Doctor doctor : doctors) {
            System.out.println(doctor);
        }

        System.out.println();
        System.out.println("Is doctorTwentyOne removed: " + doctors.remove(doctorTwentyOne));
        System.out.println("Is additionalDoctors removed from doctors: " + doctors.removeAll(additionalDoctors));
        System.out.println();
        System.out.println("Total doctors:");
        for (Doctor doctor : doctors) {
            System.out.println(doctor);
        }
    }
}
