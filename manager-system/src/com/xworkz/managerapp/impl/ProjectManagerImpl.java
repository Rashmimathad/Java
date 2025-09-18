package com.xworkz.managerapp.impl;

import com.xworkz.managerapp.manager.Manager;

public class ProjectManagerImpl implements Manager {
    @Override
    public void plan() {
        System.out.println("Project Manager plans the events of work");
    }

    @Override
    public void organize() {
        System.out.println("Project manager organizes the events of work");
    }

    @Override
    public void execute() {
        System.out.println("Project manager executes the events of work by assigning them to employees");
    }
}
