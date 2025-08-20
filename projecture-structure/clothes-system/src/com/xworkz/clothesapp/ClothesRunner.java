package com.xworkz.clothesapp;

import com.xworkz.clothesapp.clothes.Clothes;

public class ClothesRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Clothes clothes = new Clothes();

        clothes.setFabricType("Silk");
        clothes.setPrice(2500.00);
        clothes.setNoOfPiecesInStore(15);
        clothes.setClotheType("Saree");
        clothes.setIsFadable(false);
        clothes.setIsWeaven(true);

        System.out.println("Clothes Details : ");
        String fabricType = clothes.getFabricType();
        double clothePrice = clothes.getPrice();
        int noOfPiecesInStore = clothes.getNoOfPiecesInStore();
        String clotheType = clothes.getClotheType();
        boolean isFadable = clothes.getIsFadable();
        boolean isWeaven = clothes.getIsWeaven();

        System.out.println("Fabric type of clothe is : "+fabricType);
        System.out.println("Price of the clothe is : "+clothePrice);
        System.out.println("No of pieces in the store are : "+noOfPiecesInStore);
        System.out.println("Clothe type is : "+clotheType);
        System.out.println("Is clothe fadable? "+isFadable);
        System.out.println("Is Weaven? "+isWeaven);

        System.out.println("main ended ");
    }
}
