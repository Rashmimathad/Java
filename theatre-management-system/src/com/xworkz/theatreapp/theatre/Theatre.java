package com.xworkz.theatreapp.theatre;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Theatre {
    private int theatreId;
    private String theatreName;
    private String theatreLocation;
    private int noOfScreens;
    private  int seatingCapacity;
    private String ownerName;

    @Override
    public String toString() {
        return "Theatre{" +
                "theatreId=" + theatreId +
                ", theatreName='" + theatreName + '\'' +
                ", theatreLocation='" + theatreLocation + '\'' +
                ", noOfScreens=" + noOfScreens +
                ", seatingCapacity=" + seatingCapacity +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
