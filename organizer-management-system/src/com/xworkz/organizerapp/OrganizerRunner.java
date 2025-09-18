package com.xworkz.organizerapp;

import com.xworkz.organizerapp.impl.FestivalOrganizerImpl;
import com.xworkz.organizerapp.organizer.Organizer;

public class OrganizerRunner {
    public static void main(String[] args) {
        Organizer organizer=new FestivalOrganizerImpl();
        organizer.planEvent();
        organizer.conductEvent();
        organizer.closeEvent();
    }
}
