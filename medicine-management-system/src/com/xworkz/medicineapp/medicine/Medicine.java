package com.xworkz.medicineapp.medicine;

import com.xworkz.medicineapp.constants.MedicineForm;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Medicine {
    private int medicineId;
    private String medicineName;
    private int medicineDose;
    private MedicineForm medicineForm;
    private String manufacturedDate;
    private String expiryDate;

    @Override
    public String toString() {
        return "Medicine{" +
                "medicineId=" + medicineId +
                ", medicineName='" + medicineName + '\'' +
                ", medicineDose=" + medicineDose +
                ", medicineForm=" + medicineForm +
                ", manufacturedDate='" + manufacturedDate + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                '}';
    }
}
