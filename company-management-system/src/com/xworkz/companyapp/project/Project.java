package com.xworkz.companyapp.project;

import com.xworkz.companyapp.constants.ProjectStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
