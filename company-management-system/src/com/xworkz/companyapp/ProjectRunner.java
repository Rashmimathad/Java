package com.xworkz.companyapp;

import com.xworkz.companyapp.constants.ProjectStatus;
import com.xworkz.companyapp.projects.Project;

import java.util.ArrayList;
import java.util.List;

public class ProjectRunner {
    public static void main(String[] args) {

        List<Project> projectsList =new ArrayList<>();

        Project projectOne = new Project(1, "AI Chatbot", 5, "Ravi Kumar", "2025-01-10", "2025-05-20", ProjectStatus.COMPLETED);
        Project projectTwo = new Project(2, "E-Commerce Website", 8, "Sneha Patil", "2025-02-01", "2025-08-10", ProjectStatus.IN_PROGRESS);
        Project projectThree = new Project(3, "Banking App", 10, "Amit Sharma", "2025-03-15", "2025-09-30", ProjectStatus.IN_PROGRESS);
        Project projectFour = new Project(4, "Smart Home System", 6, "Priya Nair", "2025-04-05", "2025-10-15", ProjectStatus.NOT_STARTED);
        Project projectFive = new Project(5, "Fitness Tracker", 4, "Vikram Rao", "2025-01-25", "2025-07-05", ProjectStatus.COMPLETED);
        Project projectSix = new Project(6, "Online Learning Platform", 7, "Ananya Gupta", "2025-02-18", "2025-11-10", ProjectStatus.IN_PROGRESS);
        Project projectSeven = new Project(7, "Inventory Management", 6, "Rahul Mehta", "2025-03-10", "2025-09-25", ProjectStatus.ON_HOLD);
        Project projectEight = new Project(8, "Travel Booking App", 8, "Kavita Desai", "2025-04-20", "2025-12-30", ProjectStatus.NOT_STARTED);
        Project projectNine = new Project(9, "Food Delivery App", 9, "Arjun Singh", "2025-02-15", "2025-08-05", ProjectStatus.IN_PROGRESS);
        Project projectTen = new Project(10, "Weather Forecast System", 5, "Divya Reddy", "2025-03-01", "2025-10-01", ProjectStatus.ON_HOLD);
        Project projectEleven = new Project(11, "Hospital Management", 12, "Kiran Joshi", "2025-01-10", "2025-07-20", ProjectStatus.COMPLETED);
        Project projectTwelve = new Project(12, "Stock Trading Bot", 6, "Sanjay Menon", "2025-02-25", "2025-09-10", ProjectStatus.IN_PROGRESS);
        Project projectThirteen = new Project(13, "Smart Glasses", 10, "Rashmi Mathad", "2025-03-05", "2025-11-25", ProjectStatus.IN_PROGRESS);
        Project projectFourteen = new Project(14, "Digital Library", 7, "Neha Kulkarni", "2025-04-01", "2025-09-15", ProjectStatus.NOT_STARTED);
        Project projectFifteen = new Project(15, "Online Voting System", 9, "Suresh Babu", "2025-01-20", "2025-06-30", ProjectStatus.COMPLETED);
        Project projectSixteen = new Project(16, "Healthcare Analytics", 11, "Pooja Iyer", "2025-02-10", "2025-12-20", ProjectStatus.IN_PROGRESS);
        Project projectSeventeen = new Project(17, "Chat Support Automation", 6, "Vivek Shetty", "2025-03-22", "2025-10-18", ProjectStatus.ON_HOLD);
        Project projectEighteen = new Project(18, "Expense Tracker", 5, "Aditi Jain", "2025-04-11", "2025-09-01", ProjectStatus.NOT_STARTED);
        Project projectNineteen = new Project(19, "Gaming Engine", 10, "Nikhil Verma", "2025-01-28", "2025-11-30", ProjectStatus.IN_PROGRESS);
        Project projectTwenty = new Project(20, "Voice Recognition System", 8, "Deepa Kaur", "2025-02-14", "2025-12-10", ProjectStatus.NOT_STARTED);


        projectsList.add(projectOne);
        projectsList.add(projectTwo);
        projectsList.add(projectThree);
        projectsList.add(projectFour);
        projectsList.add(projectFive);
        projectsList.add(projectSix);
        projectsList.add(projectSeven);
        projectsList.add(projectEight);
        projectsList.add(projectNine);
        projectsList.add(projectTen);
        projectsList.add(projectEleven);
        projectsList.add(projectTwelve);
        projectsList.add(projectThirteen);
        projectsList.add(projectFourteen);
        projectsList.add(projectFifteen);
        projectsList.add(projectSixteen);
        projectsList.add(projectSeventeen);
        projectsList.add(projectEighteen);
        projectsList.add(projectNineteen);
        projectsList.add(projectTwenty);

        System.out.println("Total Projects List :");
        for (Project project:projectsList){
            System.out.println(project);
        }
        System.out.println();

        List<Project> projectsList1 = new ArrayList<>();
        Project projectTwentyOne = new Project(21, "Blockchain Payment System", 9, "Anil Kumar", "2025-05-01", "2026-01-15", ProjectStatus.IN_PROGRESS);
        Project projectTwentyTwo = new Project(22, "Smart Agriculture", 7, "Meena Reddy", "2025-03-10", "2025-12-25", ProjectStatus.NOT_STARTED);
        Project projectTwentyThree = new Project(23, "Cybersecurity Dashboard", 6, "Rohit Nair", "2025-04-05", "2025-09-30", ProjectStatus.IN_PROGRESS);
        Project projectTwentyFour = new Project(24, "Virtual Reality Game", 10, "Asha Shetty", "2025-02-20", "2025-11-05", ProjectStatus.ON_HOLD);
        Project projectTwentyFive = new Project(25, "Data Backup Service", 8, "Manoj Tiwari", "2025-03-25", "2025-10-15", ProjectStatus.COMPLETED);

        projectsList1.add(projectTwentyOne);
        projectsList1.add(projectTwentyTwo);
        projectsList1.add(projectTwentyThree);
        projectsList1.add(projectTwentyFour);
        projectsList1.add(projectTwentyFive);
        System.out.println("Project list 1 :");
        for (Project project:projectsList1){
            System.out.println(project);
        }

        System.out.println();
        System.out.println("Is project list 1 added to project list : "+projectsList.addAll(projectsList1));
        System.out.println("Total projects list:");
        for (Project project:projectsList){
            System.out.println(project);
        }
        System.out.println();
        System.out.println("Is project list  contains project twentyOne : "+projectsList.contains(projectTwentyOne));
        System.out.println("Is project list  contains project list 1 : "+projectsList.containsAll(projectsList1));
        System.out.println("Is project twentyThree removed : "+projectsList.remove(projectTwentyThree));
        System.out.println("Is project list1 removed : "+projectsList.removeAll(projectsList1));

        System.out.println();
        System.out.println("Total projects list:");
        for (Project project:projectsList){
            System.out.println(project);
        }
    }

}
