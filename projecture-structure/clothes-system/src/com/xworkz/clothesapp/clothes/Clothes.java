package com.xworkz.clothesapp.clothes;

public class Clothes {
     private String fabricType;
     private double price;
     private int noOfPiecesInStore;
     private String clotheType;
     private boolean isFadable;
     private boolean isWeaven;

     public String getFabricType(){
          return fabricType;
     }

     public double getPrice(){
          return price;
     }

     public int getNoOfPiecesInStore(){
          return noOfPiecesInStore;
     }

     public  String getClotheType(){
          return clotheType;
     }

     public boolean getIsFadable(){
          return isFadable;
     }

     public boolean getIsWeaven(){
          return isWeaven;
     }

     public void setFabricType(String fabricType){
          this.fabricType=fabricType;
     }

     public void setPrice(double price){
          this.price=price;
     }

     public void setNoOfPiecesInStore(int noOfPiecesInStore){
          this.noOfPiecesInStore=noOfPiecesInStore;
     }

     public void setClotheType(String clotheType){
          this.clotheType=clotheType;
     }

     public void setIsFadable(boolean isFadable){
          this.isFadable=isFadable;
     }

     public void setIsWeaven(boolean isWeaven){
          this.isWeaven=isWeaven;
     }
}
