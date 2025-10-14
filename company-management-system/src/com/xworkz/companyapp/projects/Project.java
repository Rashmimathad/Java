package com.xworkz.companyapp.projects;

import com.xworkz.companyapp.constants.ProjectStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class Project {
    private int projectId;
    private String projectName;
    private int teamSize;
    private String teamLeadName;
    private String startDate;
    private String endDate;
    private ProjectStatus projectStatus;

    @Override
    public  String toString(){
        return "Project = {projectId = "+projectId+",projectName = "+projectName+",teamSize = "+teamSize+",teamLeadName = "+teamLeadName+",startDate = "+startDate+",endDate = "+endDate+",projectStatus = "+projectStatus+"}";
    }
}
