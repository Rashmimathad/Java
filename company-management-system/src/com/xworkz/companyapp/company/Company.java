package com.xworkz.companyapp.company;

import com.xworkz.companyapp.constants.ProjectStatus;
import com.xworkz.companyapp.project.Project;
import com.xworkz.companyapp.validator.ProjectValidator;

public class Company {


    public Company(int size){
        this.projects=new Project[size];
    }

    public Project[] projects;
    int index;

    public boolean addProject(Project project){
        boolean isProjectAdded=false;

        ProjectValidator validateProject = new ProjectValidator();
        if (project!=null && validateProject.validateProject(project) ){
            projects[index++]=project;
            isProjectAdded=true;
        }else System.out.println("Project not added!!!");
        return isProjectAdded;
    }


    public boolean deleteProjectById(int projectId){
        boolean isProjectDeleted=false;
        int length=projects.length;
        for (int i = 0; i < projects.length; i++) {
            if (projects[i].getProjectId()==projectId){
                for (int j=i;j<projects.length-1;j++){
                    projects[j]=projects[j+1];
                }
                projects[projects.length-1]=null;
                length--;
                isProjectDeleted=true;
                break;
            }
        }
        if (isProjectDeleted!=false) System.out.println("Project Id "+projectId+" is deleted");
        else System.out.println("Project with Id "+projectId+" not found");
        return isProjectDeleted;
    }

    public boolean updateProjectStatusById(int projectId, ProjectStatus updatedProjectStatus){
        boolean isProjectStatusUpdated=false;
        for (Project project:projects){
            if (project.getProjectId()==projectId){
                project.setProjectStatus(updatedProjectStatus);
                isProjectStatusUpdated=true;
            }
        }
        if (isProjectStatusUpdated!=false) System.out.println("The Updated project status of the project Id "+projectId+" is : "+updatedProjectStatus);
        else System.out.println("Project with Id "+projectId+" not found");
        return isProjectStatusUpdated;
    }

    public String getProjectNameById(int projectId){
        for (Project project:projects){
            if (project.getProjectId()==projectId){
                return "The name of the project with Id "+projectId+" is : "+project.getProjectName();
            }
        }
        return "Project with Id "+projectId+" not found";
    }

    public int getTeamSizeById(int projectId){
        for (Project project:projects){
            if (project.getProjectId()==projectId){
                return project.getTeamSize();
            }
        }
        return 0;
    }

    public String getEndDateByprojectId(int projectId){
        for (Project project:projects){
            if (project.getProjectId()==projectId){
                return "The End Date for the project with id "+projectId+" is : "+project.getEndDate();
            }
        }
        return "Project with Id "+projectId+" not found";
    }

    public String getManagerNameByProjectName(String projectName){
        for (Project project:projects){
            if (project.getProjectName().equalsIgnoreCase(projectName)) {
                return "The Manager name for the project " + projectName + " is : " + project.getManagerName();
            }
        }
            return "The Project "+projectName+" not found";
    }

    public Project getProjectInfoById(int projectId){
        Project project=null;
        for (Project project1:projects){
            if (project1.getProjectId()==projectId){
                project=project1;
            }
        }
        if (project!=null)return project;
        return null;
    }


    public void displayProjectInfo(Project project){
        if (project!=null) {
            System.out.println("Project Id is : " + project.getProjectId());
            System.out.println("Project Name is : " + project.getProjectName());
            System.out.println("Project start date is : " + project.getStartDate());
            System.out.println("Project end date is : " + project.getEndDate());
            System.out.println("Team size of the project is : " + project.getTeamSize());
            System.out.println("Manager Name of the project is : " + project.getManagerName());
            System.out.println("Project status is : " + project.getProjectStatus());
            System.out.println("--------------------------------------------------------------------");
        }
    }
    public void getProjectDetails(){
        System.out.println("Project Details are :");
        System.out.println();
        for (Project project : projects) {
            if (project!=null) {
                System.out.println("Project Id is : " + project.getProjectId());
                System.out.println("Project Name is : " + project.getProjectName());
                System.out.println("Project start date is : " + project.getStartDate());
                System.out.println("Project end date is : " + project.getEndDate());
                System.out.println("Team size of the project is : " + project.getTeamSize());
                System.out.println("Manager Name of the project is : " + project.getManagerName());
                System.out.println("Project status is : " + project.getProjectStatus());
                System.out.println("--------------------------------------------------------------------");
            }
        }
    }
}
