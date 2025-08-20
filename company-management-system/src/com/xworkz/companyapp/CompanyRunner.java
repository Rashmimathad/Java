package com.xworkz.companyapp;

import com.xworkz.companyapp.company.Company;
import com.xworkz.companyapp.project.Project;

public class CompanyRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        System.out.println();

        Project projectOne = new Project();
        projectOne.setProjectId(1);
        projectOne.setProjectName("E-Commerce Platform");
        projectOne.setStartDate("02/05/2023");
        projectOne.setEndDate("02/09/2023");
        projectOne.setTeamSize(7);
        projectOne.setManagerName("Rahul Mehta");

        Company company=new Company();
        boolean isProjectAdded=company.addProject(projectOne);
        System.out.println("IS Project Added? "+isProjectAdded);

        if (isProjectAdded)
            company.getProjectDetails();

        System.out.println();
        System.out.println("main ended");
    }
}
