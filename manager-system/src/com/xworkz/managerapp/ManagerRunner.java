package com.xworkz.managerapp;

import com.xworkz.managerapp.impl.ProjectManagerImpl;
import com.xworkz.managerapp.manager.Manager;

public class ManagerRunner {
    public static void main(String[] args) {
        Manager manager=new ProjectManagerImpl();
        manager.plan();
        manager.organize();
        manager.execute();
    }
}
