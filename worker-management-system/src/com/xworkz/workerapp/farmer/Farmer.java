package com.xworkz.workerapp.farmer;

import com.xworkz.workerapp.worker.Worker;

public class Farmer extends Worker {
//    public Farmer(){
//        System.out.println("Farmer constructor invoked");
//    }

    @Override
    public void worker(){
        System.out.println("Farmer is a worker");
    }
}
