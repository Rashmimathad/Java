package com.xworkz.traineeapp;

import com.xworkz.traineeapp.constants.Gender;
import com.xworkz.traineeapp.trainee.Trainee;

import java.util.ArrayList;
import java.util.List;

public class TraineeRunner {
    public static void main(String[] args) {

        List<Trainee> traineesList=new ArrayList<>();

        Trainee traineeOne = new Trainee(101,"M Rashmi",21, Gender.FEMALE,"Rajajinagar","Java FullStack Development",6);
        Trainee traineeTwo = new Trainee(102,"Inchara Y S",22,Gender.FEMALE,"Mariappanapalya","Java FullStack Development",6);
        Trainee traineeThree = new Trainee(103,"Lavanya K",21,Gender.FEMALE,"Gandhi Nagar","Python FullStack Development",5);
        Trainee traineeFour = new Trainee(104,"Deepthi Reddy C",21,Gender.FEMALE,"Mysuru Road","AWS",4);
        Trainee traineeFive =  new Trainee(105,"Sai Kiran M",20,Gender.MALE,"Silk Board","Front-end Development",3);
        Trainee traineeSix = new Trainee(106,"Poojitha T",21,Gender.FEMALE,"Doddaballapura","Cloud Database",5);
        Trainee traineeSeven = new Trainee(107,"Roopa B K",21,Gender.FEMALE,"Gandhi Nagar","Python FullStack Development",6);
        Trainee traineeEight = new Trainee(108,"Saleem",22,Gender.MALE,"Majestic","Java FullStack Development",5);
        Trainee traineeNine = new Trainee(109,"Chandra Shekar",23,Gender.MALE,"Kurugodu","Java FullStack Development",6);
        Trainee traineeTen = new Trainee(110,"Vinay",22,Gender.MALE,"Yelahanka","Python FullStack Development",5);
        Trainee traineeEleven = new Trainee(111,"Praveen",22,Gender.MALE,"Parvathi Nagar","Java FullStack Development",6);
        Trainee traineeTwelve = new Trainee(112,"Sahana M",28,Gender.FEMALE,"Yelahanka","AWS",3);
        Trainee traineeThirteen = new Trainee(113,"Sachin Kumar",29,Gender.MALE,"Yelahanka","Java FullStack Development",6);
        Trainee traineeFourteen = new Trainee(114,"Nayana K",21,Gender.FEMALE,"Yeshwantpur","Java FullStack Development",6);
        Trainee traineeFifteen = new Trainee(115,"Keerthi B",22,Gender.FEMALE,"Bank Colony","Python FullStack Development",5);
        Trainee traineeSixteen = new Trainee(116,"Chaitanya",22,Gender.FEMALE,"Marthalli","AWS",4);
        Trainee traineeSeventeen = new Trainee(117,"Chaitra",22,Gender.FEMALE,"Hubli","VLSI",4);
        Trainee traineeEighteen = new Trainee(118,"Anusha",21,Gender.FEMALE,"Ballari","Python FullStack Development",4);
        Trainee traineeNineteen = new Trainee(119,"Geethanjali B P",22,Gender.FEMALE,"Mahalakshmi Layout","Java FullStack Development",6);
        Trainee traineeTwenty = new Trainee(120,"Kavya M Patil",22,Gender.FEMALE,"Hubli","Java FullStack Development",6);

        traineesList.add(traineeOne);
        traineesList.add(traineeTwo);
        traineesList.add(traineeThree);
        traineesList.add(traineeFour);
        traineesList.add(traineeFive);
        traineesList.add(traineeSix);
        traineesList.add(traineeSeven);
        traineesList.add(traineeEight);
        traineesList.add(traineeNine);
        traineesList.add(traineeTen);
        traineesList.add(traineeEleven);
        traineesList.add(traineeTwelve);
        traineesList.add(traineeThirteen);
        traineesList.add(traineeFourteen);
        traineesList.add(traineeFifteen);
        traineesList.add(traineeSixteen);
        traineesList.add(traineeSeventeen);
        traineesList.add(traineeEighteen);
        traineesList.add(traineeNineteen);
        traineesList.add(traineeTwenty);

        System.out.println("Total Trainees List : ");
        for (Trainee trainee : traineesList){
            System.out.println(trainee);
        }
        System.out.println();
        System.out.println("Is Trainee List contains trainee fifteen : "+traineesList.contains(traineeFifteen));
        System.out.println("Is Trainee twenty removed : "+traineesList.remove(traineeTwenty));
        System.out.println("Is Trainee twenty added : "+traineesList.add(traineeTwenty));

        System.out.println();
        List<Trainee> traineesList1 = new ArrayList<>();
        traineesList1.add(new Trainee(121,"Kavana P",21,Gender.FEMALE,"Davangere","Python FullStack Development",4));
        traineesList1.add(new Trainee(122,"Nikitha G N",22,Gender.FEMALE,"Davangere","Front-end Development",3));
        traineesList1.add(new Trainee(123,"Manasa K",22,Gender.FEMALE,"Hospet","AWS",4));

        System.out.println("Trainess List 1 : ");
        for (Trainee trainee : traineesList1){
            System.out.println(trainee);
        }
        System.out.println();

        System.out.println("Is Trainee List 1 added to trainee list : "+traineesList.addAll(traineesList1));
        for (Trainee trainee : traineesList){
            System.out.println(trainee);
        }
        System.out.println();
        System.out.println("Is Trainee List contains to trainee list 1 : "+traineesList.containsAll(traineesList1));
        System.out.println("Is Trainee List 1 removed : "+traineesList.removeAll(traineesList1));
        System.out.println("Total trainees list : ");
        for (Trainee trainee : traineesList){
            System.out.println(trainee);
        }


    }
}
