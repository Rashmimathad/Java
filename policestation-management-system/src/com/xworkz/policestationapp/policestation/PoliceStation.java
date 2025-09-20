package com.xworkz.policestationapp.policestation;

import com.xworkz.policestationapp.police.Police;

public interface PoliceStation {
    boolean addPolice(Police police);
    String getPoliceNameById(int policeId);
    String getDesignationByPoliceName(String policeName);
    String getDepartmentByPoliceName(String policeName);
    String getYearsOfServiceById(int policeId);
    String getDesignationById(int policeId);
    boolean deletePoliceById(int policeId);
    Police getPoliceInfoById(int policeId);
    boolean updateDesignationById(int policeId,String updatedDesignation);
    void displayPoliceInfo(Police police);
    void getAllPolicesDetails();

}
