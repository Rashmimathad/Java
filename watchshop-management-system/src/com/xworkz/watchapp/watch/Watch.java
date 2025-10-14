package com.xworkz.watchapp.watch;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Watch {

    private int watchId;
    private String brandName;
    private double price;
    private String materialType;
    private String manufacturerName;
    private boolean isWaterResistant;

    @Override
    public String toString() {
        return "Watch{" +
                "watchId=" + watchId +
                ", brandName='" + brandName + '\'' +
                ", price=" + price +
                ", materialType='" + materialType + '\'' +
                ", manufacturerName='" + manufacturerName + '\'' +
                ", isWaterResistant=" + isWaterResistant +
                '}';
    }
}
