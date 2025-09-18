package com.xworkz.employeeapp.impl;

import com.xworkz.employeeapp.emloyee.Employee;

public class TesterImpl implements Employee {
    @Override
    public void attendMeeting() {
        System.out.println("Tester attends the meeting");
    }

    @Override
    public void work() {
        System.out.println("Tester is working");
    }

    @Override
    public void submitReport() {
        System.out.println("Tester submits the report");
    }
}
