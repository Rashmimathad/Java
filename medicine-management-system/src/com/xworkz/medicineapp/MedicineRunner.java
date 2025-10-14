package com.xworkz.medicineapp;

import com.xworkz.medicineapp.medicine.Medicine;
import com.xworkz.medicineapp.constants.MedicineForm;

import java.util.ArrayList;
import java.util.List;

public class MedicineRunner {

    public static void main(String[] args) {

        List<Medicine> medicines = new ArrayList<>();

        Medicine medicineOne = new Medicine(1, "Paracetamol", 500, MedicineForm.TABLET, "2025-01-01", "2027-01-01");
        Medicine medicineTwo = new Medicine(2, "Amoxicillin", 250, MedicineForm.TABLET, "2025-02-01", "2027-02-01");
        Medicine medicineThree = new Medicine(3, "Cough Syrup", 10, MedicineForm.SYRUP, "2025-03-01", "2027-03-01");
        Medicine medicineFour = new Medicine(4, "Insulin", 20, MedicineForm.INJECTION, "2025-04-01", "2027-04-01");
        Medicine medicineFive = new Medicine(5, "Vitamin C", 1000, MedicineForm.CAPSULE, "2025-05-01", "2027-05-01");
        Medicine medicineSix = new Medicine(6, "Ibuprofen", 400, MedicineForm.TABLET, "2025-06-01", "2027-06-01");
        Medicine medicineSeven = new Medicine(7, "Cetirizine", 10, MedicineForm.TABLET, "2025-07-01", "2027-07-01");
        Medicine medicineEight = new Medicine(8, "Loperamide", 2, MedicineForm.TABLET, "2025-08-01", "2027-08-01");
        Medicine medicineNine = new Medicine(9, "Diphenhydramine", 25, MedicineForm.TABLET, "2025-09-01", "2027-09-01");
        Medicine medicineTen = new Medicine(10, "Omeprazole", 20, MedicineForm.TABLET, "2025-10-01", "2027-10-01");
        Medicine medicineEleven = new Medicine(11, "Paracetamol", 500, MedicineForm.TABLET, "2025-11-01", "2027-11-01");
        Medicine medicineTwelve = new Medicine(12, "Amoxicillin", 250, MedicineForm.TABLET, "2025-12-01", "2027-12-01");
        Medicine medicineThirteen = new Medicine(13, "Cough Syrup", 10, MedicineForm.SYRUP, "2026-01-01", "2028-01-01");
        Medicine medicineFourteen = new Medicine(14, "Insulin", 20, MedicineForm.INJECTION, "2026-02-01", "2028-02-01");
        Medicine medicineFifteen = new Medicine(15, "Vitamin C", 1000, MedicineForm.CAPSULE, "2026-03-01", "2028-03-01");
        Medicine medicineSixteen = new Medicine(16, "Ibuprofen", 400, MedicineForm.TABLET, "2026-04-01", "2028-04-01");
        Medicine medicineSeventeen = new Medicine(17, "Cetirizine", 10, MedicineForm.TABLET, "2026-05-01", "2028-05-01");
        Medicine medicineEighteen = new Medicine(18, "Loperamide", 2, MedicineForm.TABLET, "2026-06-01", "2028-06-01");
        Medicine medicineNineteen = new Medicine(19, "Diphenhydramine", 25, MedicineForm.TABLET, "2026-07-01", "2028-07-01");
        Medicine medicineTwenty = new Medicine(20, "Omeprazole", 20, MedicineForm.TABLET, "2026-08-01", "2028-08-01");

        medicines.add(medicineOne);
        medicines.add(medicineTwo);
        medicines.add(medicineThree);
        medicines.add(medicineFour);
        medicines.add(medicineFive);
        medicines.add(medicineSix);
        medicines.add(medicineSeven);
        medicines.add(medicineEight);
        medicines.add(medicineNine);
        medicines.add(medicineTen);
        medicines.add(medicineEleven);
        medicines.add(medicineTwelve);
        medicines.add(medicineThirteen);
        medicines.add(medicineFourteen);
        medicines.add(medicineFifteen);
        medicines.add(medicineSixteen);
        medicines.add(medicineSeventeen);
        medicines.add(medicineEighteen);
        medicines.add(medicineNineteen);
        medicines.add(medicineTwenty);

        System.out.println("Total medicines:");
        for (Medicine medicine : medicines) {
            System.out.println(medicine);
        }
        System.out.println();

        List<Medicine> medicines1 = new ArrayList<>();
        Medicine medicineTwentyOne = new Medicine(21, "Paracetamol", 500, MedicineForm.TABLET, "2026-09-01", "2028-09-01");
        Medicine medicineTwentyTwo = new Medicine(22, "Amoxicillin", 250, MedicineForm.TABLET, "2026-10-01", "2028-10-01");
        Medicine medicineTwentyThree = new Medicine(23, "Cough Syrup", 10, MedicineForm.SYRUP, "2026-11-01", "2028-11-01");
        Medicine medicineTwentyFour = new Medicine(24, "Insulin", 20, MedicineForm.INJECTION, "2026-12-01", "2028-12-01");
        Medicine medicineTwentyFive = new Medicine(25, "Vitamin C", 1000, MedicineForm.CAPSULE, "2027-01-01", "2029-01-01");

        medicines1.add(medicineTwentyOne);
        medicines1.add(medicineTwentyTwo);
        medicines1.add(medicineTwentyThree);
        medicines1.add(medicineTwentyFour);
        medicines1.add(medicineTwentyFive);

        System.out.println("Total medicines of medicines1:");
        for (Medicine medicine : medicines1) {
            System.out.println(medicine);
        }
        System.out.println();

        System.out.println("Is medicines1 added to medicines: " + medicines.addAll(medicines1));
        System.out.println("Is medicines contains medicineSeven: " + medicines.contains(medicineSeven));
        System.out.println("Is medicines contains all medicines1: " + medicines.containsAll(medicines1));
        System.out.println();

        System.out.println("Total medicines:");
        for (Medicine medicine : medicines) {
            System.out.println(medicine);
        }

        System.out.println();
        System.out.println("Is medicineTwentyOne removed: " + medicines.remove(medicineTwentyOne));
        System.out.println("Is medicines1 removed from medicines: " + medicines.removeAll(medicines1));
        System.out.println();
        System.out.println("Total medicines:");
        for (Medicine medicine : medicines) {
            System.out.println(medicine);
        }
    }
}
