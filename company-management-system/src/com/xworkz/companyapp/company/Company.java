package com.xworkz.companyapp.company;

import com.xworkz.companyapp.project.Project;
import com.xworkz.companyapp.validator.ProjectValidator;

public class Company {

    Project[] projects=new Project[20];
    int index;

    public boolean addProject(Project project){
        boolean isProjectAdded=false;

        ProjectValidator validateProject = new ProjectValidator();
        if (project!=null && validateProject.validateProject(project) ){
            projects[index++]=project;
            isProjectAdded=true;
        }
        return isProjectAdded;
    }

    public void getProjectDetails(){

        System.out.println("Project Details are :");
        System.out.println();
        for (Project project : projects) {
            System.out.println("Project Id is : " + project.getProjectId());
            System.out.println("Project Name is : " + project.getProjectName());
            System.out.println("Project start date is : " + project.getStartDate());
            System.out.println("Project end date is : " + project.getEndDate());
            System.out.println("Team size of the project is : " + project.getTeamSize());
            System.out.println("Manager Name of the project is : " + project.getManagerName());
            System.out.println("--------------------------------------------------------------------");
        }
    }
}
