package com.xworkz.loksabhaapp.loksabha;

import com.xworkz.loksabhaapp.constants.PoliticalParty;
import com.xworkz.loksabhaapp.politician.Politician;

public interface LokSabha {
    boolean addPolitician(Politician politician);
    String getPoliticianNameBYId(int politicianId);
    String getPoliticalPartyByPoliticianName(String politicianName);
    String getDesignationByPoliticianName(String politicianName);
    boolean updatePoliticalPartyById(int politicianId, PoliticalParty updatedPoliticalParty);
    String getDesignationById(int politicianId);
    boolean deletePoliticianById(int politicianId);
    Politician getPolitcianInfoById(int politicianId);
    void getPoliticianInfo(Politician politician);
    void getAllPoliticiansDetails();
}
