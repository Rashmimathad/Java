package com.xworkz.companyapp;

import com.xworkz.companyapp.company.Company;
import com.xworkz.companyapp.constants.ProjectStatus;
import com.xworkz.companyapp.project.Project;

import java.util.Scanner;

public class CompanyRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        System.out.println();

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number of projects to be added : ");
        Company company=new Company(sc.nextInt());
        System.out.print("Total number of projects to be added : "+company.projects.length);

        for (int i = 0; i < company.projects.length; i++) {
            Project project=new Project();
            System.out.println();
            System.out.print("Enter project "+(i+1)+" details : ");
            System.out.println();

            System.out.print("Enter the project Id : ");
            project.setProjectId(sc.nextInt());

            System.out.print("Enter the project name : ");sc.nextLine();
            project.setProjectName(sc.nextLine());

            System.out.print("Enter the start date of project : ");
            project.setStartDate(sc.next());

            System.out.print("Enter the end date of project : ");
            project.setEndDate(sc.next());

            System.out.print("Enter team size of project : ");
            project.setTeamSize(sc.nextInt());

            System.out.print("Enter manager name of project : ");sc.nextLine();
            project.setManagerName(sc.nextLine());

            System.out.print("Enter the project status : ");
            project.setProjectStatus(ProjectStatus.valueOf(sc.next().toUpperCase()));

            company.addProject(project);
            System.out.println("Number of projects left to be added : "+(company.projects.length-(i+1)));
        }

        System.out.println();
        company.getProjectDetails();


        System.out.println();
        System.out.print("Enter the Id to get project Name : ");
        System.out.println(company.getProjectNameById(sc.nextInt()));


        System.out.println();
        System.out.print("Enter the Id to get Project Info : ");
        company.displayProjectInfo(company.getProjectInfoById(sc.nextInt()));

        System.out.println();
        System.out.print("Enter the Project Id to be deleted : ");
        company.deleteProjectById(sc.nextInt());

//        Project projectOne = new Project();
//        projectOne.setProjectId(1);
//        projectOne.setProjectName("E-Commerce Platform");
//        projectOne.setStartDate("02/05/2023");
//        projectOne.setEndDate("02/09/2023");
//        projectOne.setTeamSize(7);
//        projectOne.setManagerName("Rahul Mehta");
//
//        Project projectTwo = new Project();
//        projectTwo.setProjectId(2);
//        projectTwo.setProjectName("Hospital Management System");
//        projectTwo.setStartDate("10/01/2023");
//        projectTwo.setEndDate("25/06/2023");
//        projectTwo.setTeamSize(10);
//        projectTwo.setManagerName("Anita Sharma");
//
//        Project projectThree = new Project();
//        projectThree.setProjectId(3);
//        projectThree.setProjectName("Online Banking System");
//        projectThree.setStartDate("15/03/2023");
//        projectThree.setEndDate("15/09/2023");
//        projectThree.setTeamSize(12);
//        projectThree.setManagerName("Vikram Singh");
//
//        Project projectFour = new Project();
//        projectFour.setProjectId(4);
//        projectFour.setProjectName("School ERP Solution");
//        projectFour.setStartDate("01/02/2023");
//        projectFour.setEndDate("01/08/2023");
//        projectFour.setTeamSize(8);
//        projectFour.setManagerName("Priya Nair");
//
//        Project projectFive = new Project();
//        projectFive.setProjectId(5);
//        projectFive.setProjectName("Restaurant Ordering App");
//        projectFive.setStartDate("20/04/2023");
//        projectFive.setEndDate("20/10/2023");
//        projectFive.setTeamSize(6);
//        projectFive.setManagerName("Rohit Kulkarni");
//
//        Project projectSix = new Project();
//        projectSix.setProjectId(6);
//        projectSix.setProjectName("Travel Booking Website");
//        projectSix.setStartDate("05/06/2023");
//        projectSix.setEndDate("05/12/2023");
//        projectSix.setTeamSize(9);
//        projectSix.setManagerName("Sneha Patil");
//
//        Project projectSeven = new Project();
//        projectSeven.setProjectId(7);
//        projectSeven.setProjectName("Inventory Management System");
//        projectSeven.setStartDate("12/05/2023");
//        projectSeven.setEndDate("12/11/2023");
//        projectSeven.setTeamSize(11);
//        projectSeven.setManagerName("Amit Verma");
//
//        Project projectEight = new Project();
//        projectEight.setProjectId(8);
//        projectEight.setProjectName("Hotel Reservation System");
//        projectEight.setStartDate("01/07/2023");
//        projectEight.setEndDate("01/01/2024");
//        projectEight.setTeamSize(7);
//        projectEight.setManagerName("Kiran Rao");
//
//        Project projectNine = new Project();
//        projectNine.setProjectId(9);
//        projectNine.setProjectName("Library Management System");
//        projectNine.setStartDate("10/02/2023");
//        projectNine.setEndDate("10/07/2023");
//        projectNine.setTeamSize(5);
//        projectNine.setManagerName("Sandeep Kumar");
//
//        Project projectTen = new Project();
//        projectTen.setProjectId(10);
//        projectTen.setProjectName("Fitness Tracking App");
//        projectTen.setStartDate("15/03/2023");
//        projectTen.setEndDate("15/09/2023");
//        projectTen.setTeamSize(6);
//        projectTen.setManagerName("Neha Gupta");
//
//        Project projectEleven = new Project();
//        projectEleven.setProjectId(11);
//        projectEleven.setProjectName("Food Delivery Platform");
//        projectEleven.setStartDate("20/04/2023");
//        projectEleven.setEndDate("20/12/2023");
//        projectEleven.setTeamSize(10);
//        projectEleven.setManagerName("Rajesh Iyer");
//
//        Project projectTwelve = new Project();
//        projectTwelve.setProjectId(12);
//        projectTwelve.setProjectName("Online Learning Portal");
//        projectTwelve.setStartDate("05/05/2023");
//        projectTwelve.setEndDate("05/11/2023");
//        projectTwelve.setTeamSize(8);
//        projectTwelve.setManagerName("Manisha Joshi");
//
//        Project projectThirteen = new Project();
//        projectThirteen.setProjectId(13);
//        projectThirteen.setProjectName("Stock Trading Application");
//        projectThirteen.setStartDate("01/06/2023");
//        projectThirteen.setEndDate("01/01/2024");
//        projectThirteen.setTeamSize(12);
//        projectThirteen.setManagerName("Deepak Yadav");
//
//        Project projectFourteen = new Project();
//        projectFourteen.setProjectId(14);
//        projectFourteen.setProjectName("Music Streaming Platform");
//        projectFourteen.setStartDate("15/07/2023");
//        projectFourteen.setEndDate("15/01/2024");
//        projectFourteen.setTeamSize(9);
//        projectFourteen.setManagerName("Arjun Reddy");
//
//        Project projectFifteen = new Project();
//        projectFifteen.setProjectId(15);
//        projectFifteen.setProjectName("Ride Sharing App");
//        projectFifteen.setStartDate("01/08/2023");
//        projectFifteen.setEndDate("01/02/2024");
//        projectFifteen.setTeamSize(10);
//        projectFifteen.setManagerName("Shalini Desai");
//
//        Project projectSixteen = new Project();
//        projectSixteen.setProjectId(16);
//        projectSixteen.setProjectName("Customer Support Chatbot");
//        projectSixteen.setStartDate("12/09/2023");
//        projectSixteen.setEndDate("12/03/2024");
//        projectSixteen.setTeamSize(7);
//        projectSixteen.setManagerName("Mohit Bansal");
//
//        Project projectSeventeen = new Project();
//        projectSeventeen.setProjectId(17);
//        projectSeventeen.setProjectName("Digital Marketing Dashboard");
//        projectSeventeen.setStartDate("10/10/2023");
//        projectSeventeen.setEndDate("10/04/2024");
//        projectSeventeen.setTeamSize(8);
//        projectSeventeen.setManagerName("Pooja Menon");
//
//        Project projectEighteen = new Project();
//        projectEighteen.setProjectId(18);
//        projectEighteen.setProjectName("Payment Gateway Integration");
//        projectEighteen.setStartDate("01/11/2023");
//        projectEighteen.setEndDate("01/05/2024");
//        projectEighteen.setTeamSize(6);
//        projectEighteen.setManagerName("Karthik Srinivas");
//
//        Project projectNineteen = new Project();
//        projectNineteen.setProjectId(19);
//        projectNineteen.setProjectName("Smart Home Automation");
//        projectNineteen.setStartDate("15/12/2023");
//        projectNineteen.setEndDate("15/06/2024");
//        projectNineteen.setTeamSize(9);
//        projectNineteen.setManagerName("Ramesh Pillai");
//
//        Project projectTwenty = new Project();
//        projectTwenty.setProjectId(20);
//        projectTwenty.setProjectName("AI Chat Assistant");
//        projectTwenty.setStartDate("05/01/2024");
//        projectTwenty.setEndDate("05/07/2024");
//        projectTwenty.setTeamSize(11);
//        projectTwenty.setManagerName("Divya Kapoor");
//
//        Company company=new Company();
//        System.out.println("Is Project One Added? "+company.addProject(projectOne));
//        System.out.println("Is Project Two Added? "+company.addProject(projectTwo));
//        System.out.println("Is Project Three Added? "+company.addProject(projectThree));
//        System.out.println("Is Project Four Added? "+company.addProject(projectFour));
//        System.out.println("Is Project Five Added? "+company.addProject(projectFive));
//        System.out.println("Is Project Six Added? "+company.addProject(projectSix));
//        System.out.println("Is Project Seven Added? "+company.addProject(projectSeven));
//        System.out.println("Is Project Eight Added? "+company.addProject(projectEight));
//        System.out.println("Is Project Nine Added? "+company.addProject(projectNine));
//        System.out.println("Is Project Ten Added? "+company.addProject(projectTen));
//        System.out.println("Is Project Eleven Added? "+company.addProject(projectEleven));
//        System.out.println("Is Project Twelve Added? "+company.addProject(projectTwelve));
//        System.out.println("Is Project Thirteen Added? "+company.addProject(projectThirteen));
//        System.out.println("Is Project Fourteen Added? "+company.addProject(projectFourteen));
//        System.out.println("Is Project Fifteen Added? "+company.addProject(projectFifteen));
//        System.out.println("Is Project Sixteen Added? "+company.addProject(projectSixteen));
//        System.out.println("Is Project Seventeen Added? "+company.addProject(projectSeventeen));
//        System.out.println("Is Project Eighteen Added? "+company.addProject(projectEighteen));
//        System.out.println("Is Project Nineteen Added? "+company.addProject(projectNineteen));
//        System.out.println("Is Project Twenty Added? "+company.addProject(projectTwenty));



        System.out.println();
        System.out.println("main ended");
    }
}
