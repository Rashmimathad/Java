package com.xworkz.trainerapp;

import com.xworkz.trainerapp.dev.Dev;
import com.xworkz.trainerapp.trainer.Trainer;

public class TrainerRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Trainer trainerOne=new Dev();
        trainerOne.trainer();
        System.out.println("main ended");
    }
}
