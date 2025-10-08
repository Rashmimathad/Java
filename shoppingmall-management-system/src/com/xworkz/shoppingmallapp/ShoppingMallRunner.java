package com.xworkz.shoppingmallapp;

import com.xworkz.shoppingmallapp.constants.Floor;
import com.xworkz.shoppingmallapp.shop.Shop;
import com.xworkz.shoppingmallapp.impl.OrionMallImpl;

import java.util.Scanner;

public class ShoppingMallRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        System.out.println();

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of shops to be added : ");
        OrionMallImpl shoppingMall=new OrionMallImpl(sc.nextInt());

        System.out.println("Total number of shops to be added : "+shoppingMall.shops.length);
        System.out.println();
        for (int i = 0; i < shoppingMall.shops.length ; i++) {
            Shop shop=new Shop();
            System.out.println("Enter the shop "+(i+1)+" details : ");

            System.out.print("Enter the shop Id : ");
            shop.setShopId(sc.nextInt());

            System.out.print("Enter the shop name : ");
            shop.setShopName(sc.next());

            System.out.print("Enter the shop type : ");
            shop.setShopType(sc.next());

            System.out.print("Enter the manager name of the shop : ");sc.nextLine();
            shop.setManagerName(sc.nextLine());

            System.out.print("Enter the number of staff members in shop : ");
            shop.setNoOfStaffMembers(sc.nextInt());

            System.out.print("Enter the floor number : ");
            shop.setFloorNumber(Floor.valueOf(sc.next().toUpperCase()));

            System.out.println();
            shoppingMall.addShop(shop);
            System.out.println();
            System.out.println(shop);
            System.out.println("Number of shops left to be added : "+(shoppingMall.shops.length-(i+1)));
            System.out.println();
        }

        System.out.println();
        shoppingMall.getAllShopsDetails();

        System.out.println();
        System.out.print("Enter the shop Id to get shop name : ");
        shoppingMall.getShopNameByShopId(sc.nextInt());

        System.out.println();
        System.out.print("Enter the shop Id to get shop details : ");
        shoppingMall.displayShopInfo(shoppingMall.getShopInfoById(sc.nextInt()));

        System.out.println();
        System.out.print("Enter the shop Id to be deleted : ");
        shoppingMall.deleteShopById(sc.nextInt());


//        Shop shopOne=new Shop();
//
//        shopOne.setShopId(1);
//        shopOne.setShopName("Zudio");
//        shopOne.setShopType("Clothing");
//        shopOne.setManagerName("Anita Sharma");
//        shopOne.setNoOfStaffMembers(25);
//        shopOne.setFloorNumber(2);
//
//        Shop shopTwo = new Shop();
//        shopTwo.setShopId(2);
//        shopTwo.setShopName("Lifestyle");
//        shopTwo.setShopType("Fashion & Lifestyle");
//        shopTwo.setManagerName("Rohit Mehta");
//        shopTwo.setNoOfStaffMembers(40);
//        shopTwo.setFloorNumber(1);
//
//        Shop shopThree = new Shop();
//        shopThree.setShopId(3);
//        shopThree.setShopName("Pantaloons");
//        shopThree.setShopType("Clothing");
//        shopThree.setManagerName("Sneha Reddy");
//        shopThree.setNoOfStaffMembers(30);
//        shopThree.setFloorNumber(2);
//
//        Shop shopFour = new Shop();
//        shopFour.setShopId(4);
//        shopFour.setShopName("Croma");
//        shopFour.setShopType("Electronics");
//        shopFour.setManagerName("Amit Verma");
//        shopFour.setNoOfStaffMembers(20);
//        shopFour.setFloorNumber(3);
//
//        Shop shopFive = new Shop();
//        shopFive.setShopId(5);
//        shopFive.setShopName("Archies");
//        shopFive.setShopType("Gift & Stationery");
//        shopFive.setManagerName("Neha Gupta");
//        shopFive.setNoOfStaffMembers(12);
//        shopFive.setFloorNumber(1);
//
//        Shop shopSix = new Shop();
//        shopSix.setShopId(6);
//        shopSix.setShopName("Starbucks");
//        shopSix.setShopType("Cafe");
//        shopSix.setManagerName("Vikram Singh");
//        shopSix.setNoOfStaffMembers(18);
//        shopSix.setFloorNumber(11);
//
//        Shop shopSeven = new Shop();
//        shopSeven.setShopId(7);
//        shopSeven.setShopName("H&M");
//        shopSeven.setShopType("Clothing");
//        shopSeven.setManagerName("Priya Nair");
//        shopSeven.setNoOfStaffMembers(35);
//        shopSeven.setFloorNumber(2);
//
//        Shop shopEight = new Shop();
//        shopEight.setShopId(8);
//        shopEight.setShopName("Adidas");
//        shopEight.setShopType("Sportswear");
//        shopEight.setManagerName("Rahul Khanna");
//        shopEight.setNoOfStaffMembers(22);
//        shopEight.setFloorNumber(1);
//
//        Shop shopNine = new Shop();
//        shopNine.setShopId(9);
//        shopNine.setShopName("FabIndia");
//        shopNine.setShopType("Ethnic Wear");
//        shopNine.setManagerName("Kavya Desai");
//        shopNine.setNoOfStaffMembers(28);
//        shopNine.setFloorNumber(2);
//
//        Shop shopTen = new Shop();
//        shopTen.setShopId(10);
//        shopTen.setShopName("PVR Cinemas");
//        shopTen.setShopType("Entertainment");
//        shopTen.setManagerName("Arjun Rao");
//        shopTen.setNoOfStaffMembers(50);
//        shopTen.setFloorNumber(4);
//
//        Shop shopEleven = new Shop();
//        shopEleven.setShopId(11);
//        shopEleven.setShopName("Food Court");
//        shopEleven.setShopType("Multi-cuisine");
//        shopEleven.setManagerName("Shalini Menon");
//        shopEleven.setNoOfStaffMembers(60);
//        shopEleven.setFloorNumber(5);
//
//        Shop shopTwelve = new Shop();
//        shopTwelve.setShopId(12);
//        shopTwelve.setShopName("Bata");
//        shopTwelve.setShopType("Footwear");
//        shopTwelve.setManagerName("Manoj Bhat");
//        shopTwelve.setNoOfStaffMembers(15);
//        shopTwelve.setFloorNumber(1);
//
//        Shop shopThirteen = new Shop();
//        shopThirteen.setShopId(13);
//        shopThirteen.setShopName("Reliance Digital");
//        shopThirteen.setShopType("Electronics");
//        shopThirteen.setManagerName("Divya Kapoor");
//        shopThirteen.setNoOfStaffMembers(27);
//        shopThirteen.setFloorNumber(3);
//
//        ShoppingMall shoppingMall=new ShoppingMall();
//        System.out.println("Is Shop One Added? "+shoppingMall.addShop(shopOne));
//        System.out.println("Is Shop Two Added? "+shoppingMall.addShop(shopTwo));
//        System.out.println("Is Shop Three Added? "+shoppingMall.addShop(shopThree));
//        System.out.println("Is Shop Four Added? "+shoppingMall.addShop(shopFour));
//        System.out.println("Is Shop Five Added? "+shoppingMall.addShop(shopFive));
//        System.out.println("Is Shop Six Added? "+shoppingMall.addShop(shopSix));
//        System.out.println("Is Shop Seven Added? "+shoppingMall.addShop(shopSeven));
//        System.out.println("Is Shop Eight Added? "+shoppingMall.addShop(shopEight));
//        System.out.println("Is Shop Nine Added? "+shoppingMall.addShop(shopNine));
//        System.out.println("Is Shop Ten Added? "+shoppingMall.addShop(shopTen));
//        System.out.println("Is Shop Eleven Added? "+shoppingMall.addShop(shopEleven));
//        System.out.println("Is Shop Twelve Added? "+shoppingMall.addShop(shopTwelve));
//        System.out.println("Is Shop Thirteen Added? "+shoppingMall.addShop(shopThirteen));


        System.out.println("main ended");
    }
}
