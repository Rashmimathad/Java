package com.xworkz.organizerapp.impl;

import com.xworkz.organizerapp.organizer.Organizer;

public class FestivalOrganizerImpl implements Organizer {
    @Override
    public void planEvent() {
        System.out.println("Festival event planned");
    }

    @Override
    public void conductEvent() {
        System.out.println("Festival event conducted");
    }

    @Override
    public void closeEvent() {
        System.out.println("Festival event closed");
    }
}
