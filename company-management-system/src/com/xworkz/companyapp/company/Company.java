package com.xworkz.companyapp.company;

import com.xworkz.companyapp.constants.ProjectStatus;
import com.xworkz.companyapp.project.Project;

public interface Company {
    boolean addProject(Project project);
    boolean deleteProjectById(int projectId);
    boolean updateProjectStatusById(int projectId, ProjectStatus updatedProjectStatus);
    String getProjectNameById(int projectId);
    int getTeamSizeById(int projectId);
    String getEndDateByprojectId(int projectId);
    String getManagerNameByProjectName(String projectName);
    Project getProjectInfoById(int projectId);
    void displayProjectInfo(Project project);
    void getProjectDetails();
}
