package com.xworkz.companyapp.validator;

import com.xworkz.companyapp.project.Project;

public class ProjectValidator {



    public boolean validateProject(Project project){
        boolean isProjectValidated=false;
        boolean isProjectIdValid=false;
        boolean isProjectNameValid=false;
        boolean isStartDateValid=false;
        boolean isEndDateValid=false;
        boolean isTeamSizeValid=false;
        boolean isManagerNameValid=false;

        if (project.getProjectId()!=0)
            isProjectIdValid=true;
        else System.out.println("Invalid Project Id");

        if (project.getProjectName()!=null && !project.getProjectName().isEmpty())
            isProjectNameValid=true;
        else System.out.println("Invalid Project Name");

        if (project.getStartDate()!=null && !project.getStartDate().isEmpty())
            isStartDateValid=true;
        else System.out.println("Invalid start date");

        if (project.getEndDate()!=null && !project.getEndDate().isEmpty())
            isEndDateValid=true;
        else System.out.println("Invalid end date");

        if (project.getTeamSize()!=0)
            isTeamSizeValid=true;
        else System.out.println("Team size invalid");

        if (project.getManagerName()!=null && !project.getManagerName().isEmpty())
            isManagerNameValid=true;
        else System.out.println("Invalid manager Name");

        if (isProjectIdValid && isProjectNameValid && isStartDateValid && isEndDateValid && isTeamSizeValid && isManagerNameValid){
            isProjectValidated=true;
        }

        return isProjectValidated;
    }
}
