package com.xworkz.judgeapp.impl;

import com.xworkz.judgeapp.judge.Judge;

public class DistrictJudgeImpl implements Judge {
    @Override
    public void hearCase() {
        System.out.println("District judge hears the case arguments");
    }

    @Override
    public void giveVerdict() {
        System.out.println("District judge gives the verdict");
    }

    @Override
    public void signOrder() {
        System.out.println("District judge signs the verdict order");
    }
}
