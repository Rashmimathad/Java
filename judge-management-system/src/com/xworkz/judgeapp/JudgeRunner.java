package com.xworkz.judgeapp;

import com.xworkz.judgeapp.impl.DistrictJudgeImpl;
import com.xworkz.judgeapp.judge.Judge;

public class JudgeRunner {
    public static void main(String[] args) {
        Judge judge=new DistrictJudgeImpl();
        judge.hearCase();
        judge.giveVerdict();
        judge.signOrder();
    }
}
