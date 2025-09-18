package com.xworkz.employeeapp;

import com.xworkz.employeeapp.emloyee.Employee;
import com.xworkz.employeeapp.impl.TesterImpl;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee employee=new TesterImpl();
        employee.attendMeeting();
        employee.work();
        employee.submitReport();
    }
}
