package com.xworkz.companyapp.company;

import com.xworkz.companyapp.project.Project;
import com.xworkz.companyapp.validator.ProjectValidator;

public class Company {

    Project project;

    public boolean addProject(Project project){
        boolean isProjectAdded=false;

        ProjectValidator validateProject = new ProjectValidator();
        boolean isProjectValidated=validateProject.validateProject(project);
        if (isProjectValidated){
            this.project=project;
            isProjectAdded=true;
        }
        return isProjectAdded;
    }

    public void getProjectDetails(){
        System.out.println("Project Id is : "+project.getProjectId());
        System.out.println("Project Name is : "+project.getProjectName());
        System.out.println("Project start date is : "+project.getStartDate());
        System.out.println("Project end date is : "+project.getEndDate());
        System.out.println("Team size of the project is : "+project.getTeamSize());
        System.out.println("Manager Name of the project is : "+project.getManagerName());
    }
}
