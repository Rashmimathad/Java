package com.xworkz.companyapp.project;

import com.xworkz.companyapp.constants.ProjectStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Project {

    private int projectId;
    private String projectName;
    private String startDate;
    private String endDate;
    private int teamSize;
    private String managerName;
    private ProjectStatus projectStatus;

    @Override
    public String toString(){
        return "Project = {projectId= "+this.projectId+", projectName= "+this.projectName+", startDate= "+this.startDate+", endDate= "+this.endDate+", teamSize= "+this.teamSize+",managerName= "+this.managerName+",projectStatus="+this.projectStatus+"}";
    }

    @Override
    public boolean equals(Object o) {
       if (o instanceof Project){
           Project project=(Project) o;
           if (this.projectId==project.projectId&&this.projectName.equals(projectName)&&this.startDate.equals(project.startDate)&&this.endDate.equals(project.endDate)&&this.teamSize==project.teamSize&&this.managerName.equals(project.managerName)&&this.projectStatus.equals(project.projectStatus))
               return true;
           return false;
       }
       return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, projectName, startDate, endDate, teamSize, managerName, projectStatus);
    }

    //    public void setProjectId(int projectId){
//        this.projectId=projectId;
//    }
//
//    public void setProjectName(String projectName) {
//        this.projectName = projectName;
//    }
//
//    public void setStartDate(String startDate) {
//        this.startDate = startDate;
//    }
//
//    public void setEndDate(String endDate) {
//        this.endDate = endDate;
//    }
//
//    public void setTeamSize(int teamSize) {
//        this.teamSize = teamSize;
//    }
//
//    public void setManagerName(String managerName) {
//        this.managerName = managerName;
//    }
//
//    public int getProjectId() {
//        return projectId;
//    }
//
//    public String getProjectName(){
//        return projectName;
//    }
//
//    public String getStartDate() {
//        return startDate;
//    }
//
//    public String getEndDate() {
//        return endDate;
//    }
//
//    public int getTeamSize() {
//        return teamSize;
//    }
//
//    public String getManagerName() {
//        return managerName;
//    }
}
