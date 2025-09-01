package com.xworkz.showapp;

import com.xworkz.showapp.podcast.PodCast;
import com.xworkz.showapp.show.Show;

public class ShowRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Show showOne=new PodCast();
        showOne.show();
        System.out.println("main ended");
    }
}
