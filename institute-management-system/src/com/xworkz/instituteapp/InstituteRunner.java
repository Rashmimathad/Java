package com.xworkz.instituteapp;

import com.xworkz.instituteapp.constants.Gender;
import com.xworkz.instituteapp.impl.XworkzImpl;
import com.xworkz.instituteapp.trainee.Trainee;

import java.util.Scanner;

public class InstituteRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        System.out.println();

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of trainees to be added : ");
        XworkzImpl institute=new XworkzImpl(sc.nextInt());
        System.out.println("Total number of trainees to be added : "+institute.trainees.length);

        for (int i = 0; i < institute.trainees.length;i++) {
            Trainee trainee=new Trainee();
            System.out.println("Enter the trainee "+(i+1)+" details :");

            System.out.print("Enter the trainee Id  : ");
            trainee.setTraineeId(sc.nextInt());

            System.out.print("Enter the trainee name : ");sc.nextLine();
            trainee.setTraineeName(sc.nextLine());

            System.out.print("Enter the gender : ");
            trainee.setGender(Gender.valueOf(sc.next().toUpperCase()));

            System.out.print("Enter the phone number : ");
            trainee.setPhoneNo(sc.nextLong());

            System.out.print("Enter course trainee enrolled for : ");sc.nextLine();
            trainee.setCourseEnrolled(sc.nextLine());

            System.out.print("Enter term of enrolled course : ");
            trainee.setTermOfCourse(sc.nextInt());

            institute.addTrainee(trainee);
            System.out.println("Numbers of trainees left to be added : "+(institute.trainees.length-(i+1)));

        }
        System.out.println();
        institute.getAllTraineesDetails();

        System.out.println();
        System.out.print("Enter the trainee Id to get trainee name : ");
        System.out.println(institute.getTraineeNameById(sc.nextInt()));

        System.out.println();
        System.out.print("Enter the trainee Id and updated term of course to update : ");
        institute.updateTermOfCourseById(sc.nextInt(),sc.nextInt());

        System.out.println();
        System.out.print("Enter the trainee Id to get trainee Info  : ");
        institute.displayTraineeInfo(institute.getTraineeInfoById(sc.nextInt()));

        System.out.println();
        System.out.print("Enter the trainee Id to be deleted : ");
        institute.deleteTraineeById(sc.nextInt());

//        Trainee traineeOne = new Trainee();
//        traineeOne.setTraineeId(101);
//        traineeOne.setTraineeName("Rashmi");
//        traineeOne.setGender('F');
//        traineeOne.setPhoneNo(9019184800L);
//        traineeOne.setCourseEnrolled("Java Full Stack Development");
//        traineeOne.setTermOfCourse(6);
//
//        Trainee traineeTwo = new Trainee();
//        traineeTwo.setTraineeId(102);
//        traineeTwo.setTraineeName("Arjun");
//        traineeTwo.setGender('M');
//        traineeTwo.setPhoneNo(8431101915L);
//        traineeTwo.setCourseEnrolled("Python Full Stack Development");
//        traineeTwo.setTermOfCourse(6);
//
//        Trainee traineeThree = new Trainee();
//        traineeThree.setTraineeId(103);
//        traineeThree.setTraineeName("Sneha");
//        traineeThree.setGender('F');
//        traineeThree.setPhoneNo(7892622184L);
//        traineeThree.setCourseEnrolled("Data Science with Python");
//        traineeThree.setTermOfCourse(9);
//
//        Trainee traineeFour = new Trainee();
//        traineeFour.setTraineeId(104);
//        traineeFour.setTraineeName("Karthik");
//        traineeFour.setGender('M');
//        traineeFour.setPhoneNo(8105755408L);
//        traineeFour.setCourseEnrolled("AWS Cloud Practitioner");
//        traineeFour.setTermOfCourse(4);
//
//        Trainee traineeFive = new Trainee();
//        traineeFive.setTraineeId(105);
//        traineeFive.setTraineeName("Anita");
//        traineeFive.setGender('F');
//        traineeFive.setPhoneNo(9480398726L);
//        traineeFive.setCourseEnrolled("UI/UX Design");
//        traineeFive.setTermOfCourse(5);
//
//        Trainee traineeSix = new Trainee();
//        traineeSix.setTraineeId(106);
//        traineeSix.setTraineeName("Vikram");
//        traineeSix.setGender('M');
//        traineeSix.setPhoneNo(9632902375L);
//        traineeSix.setCourseEnrolled("Java Backend Development");
//        traineeSix.setTermOfCourse(6);
//
//        Trainee traineeSeven = new Trainee();
//        traineeSeven.setTraineeId(107);
//        traineeSeven.setTraineeName("Priya");
//        traineeSeven.setGender('F');
//        traineeSeven.setPhoneNo(98475687125L);
//        traineeSeven.setCourseEnrolled("Android App Development");
//        traineeSeven.setTermOfCourse(6);
//
//        Trainee traineeEight = new Trainee();
//        traineeEight.setTraineeId(108);
//        traineeEight.setTraineeName("Rohit");
//        traineeEight.setGender('M');
//        traineeEight.setPhoneNo(9748134566L);
//        traineeEight.setCourseEnrolled("Cyber Security Fundamentals");
//        traineeEight.setTermOfCourse(8);
//
//        Trainee traineeNine = new Trainee();
//        traineeNine.setTraineeId(109);
//        traineeNine.setTraineeName("Meena");
//        traineeNine.setGender('F');
//        traineeNine.setPhoneNo(9647123644L);
//        traineeNine.setCourseEnrolled("Machine Learning");
//        traineeNine.setTermOfCourse(10);
//
//        Trainee traineeTen = new Trainee();
//        traineeTen.setTraineeId(110);
//        traineeTen.setTraineeName("Suresh");
//        traineeTen.setGender('M');
//        traineeTen.setPhoneNo(8127034792L);
//        traineeTen.setCourseEnrolled("React Frontend Development");
//        traineeTen.setTermOfCourse(5);
//
//        Trainee traineeEleven = new Trainee();
//        traineeEleven.setTraineeId(111);
//        traineeEleven.setTraineeName("Divya");
//        traineeEleven.setGender('F');
//        traineeEleven.setPhoneNo(6745831426L);
//        traineeEleven.setCourseEnrolled("DevOps with Kubernetes");
//        traineeEleven.setTermOfCourse(6);
//
//        Trainee traineeTwelve = new Trainee();
//        traineeTwelve.setTraineeId(112);
//        traineeTwelve.setTraineeName("Manoj");
//        traineeTwelve.setGender('M');
//        traineeTwelve.setPhoneNo(6363023929L);
//        traineeTwelve.setCourseEnrolled("C# .NET Development");
//        traineeTwelve.setTermOfCourse(7);
//
//        Trainee traineeThirteen = new Trainee();
//        traineeThirteen.setTraineeId(113);
//        traineeThirteen.setTraineeName("Pooja");
//        traineeThirteen.setGender('F');
//        traineeThirteen.setPhoneNo(6475823466L);
//        traineeThirteen.setCourseEnrolled("Blockchain Development");
//        traineeThirteen.setTermOfCourse(9);
//
//        Trainee traineeFourteen = new Trainee();
//        traineeFourteen.setTraineeId(114);
//        traineeFourteen.setTraineeName("Rahul");
//        traineeFourteen.setGender('M');
//        traineeFourteen.setPhoneNo(9741117623L);
//        traineeFourteen.setCourseEnrolled("iOS App Development");
//        traineeFourteen.setTermOfCourse(6);
//
//        Trainee traineeFifteen = new Trainee();
//        traineeFifteen.setTraineeId(115);
//        traineeFifteen.setTraineeName("Neha");
//        traineeFifteen.setGender('F');
//        traineeFifteen.setPhoneNo(7485983145L);
//        traineeFifteen.setCourseEnrolled("Artificial Intelligence");
//        traineeFifteen.setTermOfCourse(12);
//
//        Institute institute=new Institute();
//        System.out.println("Is Trainee One Added? "+institute.addTrainee(traineeOne));
//        System.out.println("Is Trainee Two Added? "+institute.addTrainee(traineeTwo));
//        System.out.println("Is Trainee Three Added? "+institute.addTrainee(traineeThree));
//        System.out.println("Is Trainee Four Added? "+institute.addTrainee(traineeFour));
//        System.out.println("Is Trainee Five Added? "+institute.addTrainee(traineeFive));
//        System.out.println("Is Trainee Six Added? "+institute.addTrainee(traineeSix));
//        System.out.println("Is Trainee Seven Added? "+institute.addTrainee(traineeSeven));
//        System.out.println("Is Trainee Eight Added? "+institute.addTrainee(traineeEight));
//        System.out.println("Is Trainee Nine Added? "+institute.addTrainee(traineeNine));
//        System.out.println("Is Trainee Ten Added? "+institute.addTrainee(traineeTen));
//        System.out.println("Is Trainee ELeven Added? "+institute.addTrainee(traineeEleven));
//        System.out.println("Is Trainee Twelve Added? "+institute.addTrainee(traineeTwelve));
//        System.out.println("Is Trainee Thirteen Added? "+institute.addTrainee(traineeThirteen));
//        System.out.println("Is Trainee Fourteen Added? "+institute.addTrainee(traineeFourteen));
//        System.out.println("Is Trainee Fifteen Added? "+institute.addTrainee(traineeFifteen));




        System.out.println();
        System.out.println("main ended");
    }
}
