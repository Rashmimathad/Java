package com.xworkz.orderapp;

import com.xworkz.orderapp.order.Order;
import com.xworkz.orderapp.constants.OrderStatus;
import com.xworkz.orderapp.constants.PaymentMethod;

import java.util.ArrayList;
import java.util.List;

public class OrderRunner {

    public static void main(String[] args) {

        List<Order> orders = new ArrayList<>();

        Order orderOne = new Order(1, "Laptop", "2025-10-01", "Delhi", PaymentMethod.CREDIT_CARD, OrderStatus.PLACED);
        Order orderTwo = new Order(2, "Smartphone", "2025-10-02", "Mumbai", PaymentMethod.UPI, OrderStatus.SHIPPED);
        Order orderThree = new Order(3, "Headphones", "2025-10-03", "Bangalore", PaymentMethod.COD, OrderStatus.DELIVERED);
        Order orderFour = new Order(4, "Camera", "2025-10-04", "Chennai", PaymentMethod.DEBIT_CARD, OrderStatus.PLACED);
        Order orderFive = new Order(5, "Tablet", "2025-10-05", "Hyderabad", PaymentMethod.UPI, OrderStatus.SHIPPED);
        Order orderSix = new Order(6, "Smartwatch", "2025-10-06", "Pune", PaymentMethod.COD, OrderStatus.DELIVERED);
        Order orderSeven = new Order(7, "Speaker", "2025-10-07", "Kolkata", PaymentMethod.CREDIT_CARD, OrderStatus.PLACED);
        Order orderEight = new Order(8, "Monitor", "2025-10-08", "Lucknow", PaymentMethod.UPI, OrderStatus.SHIPPED);
        Order orderNine = new Order(9, "Printer", "2025-10-09", "Ahmedabad", PaymentMethod.COD, OrderStatus.DELIVERED);
        Order orderTen = new Order(10, "Keyboard", "2025-10-10", "Jaipur", PaymentMethod.DEBIT_CARD, OrderStatus.PLACED);
        Order orderEleven = new Order(11, "Mouse", "2025-10-11", "Surat", PaymentMethod.UPI, OrderStatus.SHIPPED);
        Order orderTwelve = new Order(12, "SSD", "2025-10-12", "Vadodara", PaymentMethod.COD, OrderStatus.DELIVERED);
        Order orderThirteen = new Order(13, "RAM", "2025-10-13", "Nagpur", PaymentMethod.CREDIT_CARD, OrderStatus.PLACED);
        Order orderFourteen = new Order(14, "Graphics Card", "2025-10-14", "Indore", PaymentMethod.UPI, OrderStatus.SHIPPED);
        Order orderFifteen = new Order(15, "Motherboard", "2025-10-15", "Bhopal", PaymentMethod.COD, OrderStatus.DELIVERED);
        Order orderSixteen = new Order(16, "Power Supply", "2025-10-16", "Lucknow", PaymentMethod.DEBIT_CARD, OrderStatus.PLACED);
        Order orderSeventeen = new Order(17, "Cabinet", "2025-10-17", "Patna", PaymentMethod.UPI, OrderStatus.SHIPPED);
        Order orderEighteen = new Order(18, "Router", "2025-10-18", "Ranchi", PaymentMethod.COD, OrderStatus.DELIVERED);
        Order orderNineteen = new Order(19, "Modem", "2025-10-19", "Agra", PaymentMethod.CREDIT_CARD, OrderStatus.PLACED);
        Order orderTwenty = new Order(20, "Webcam", "2025-10-20", "Udaipur", PaymentMethod.UPI, OrderStatus.SHIPPED);

        orders.add(orderOne);
        orders.add(orderTwo);
        orders.add(orderThree);
        orders.add(orderFour);
        orders.add(orderFive);
        orders.add(orderSix);
        orders.add(orderSeven);
        orders.add(orderEight);
        orders.add(orderNine);
        orders.add(orderTen);
        orders.add(orderEleven);
        orders.add(orderTwelve);
        orders.add(orderThirteen);
        orders.add(orderFourteen);
        orders.add(orderFifteen);
        orders.add(orderSixteen);
        orders.add(orderSeventeen);
        orders.add(orderEighteen);
        orders.add(orderNineteen);
        orders.add(orderTwenty);

        System.out.println("Total orders:");
        for (Order order : orders) {
            System.out.println(order);
        }
        System.out.println();

        List<Order> orders1 = new ArrayList<>();
        Order orderTwentyOne = new Order(21, "Microphone", "2025-10-21", "Patiala", PaymentMethod.DEBIT_CARD, OrderStatus.DELIVERED);
        Order orderTwentyTwo = new Order(22, "USB Drive", "2025-10-22", "Chandigarh", PaymentMethod.UPI, OrderStatus.PLACED);
        Order orderTwentyThree = new Order(23, "External HDD", "2025-10-23", "Amritsar", PaymentMethod.COD, OrderStatus.SHIPPED);
        Order orderTwentyFour = new Order(24, "Projector", "2025-10-24", "Jalandhar", PaymentMethod.CREDIT_CARD, OrderStatus.DELIVERED);
        Order orderTwentyFive = new Order(25, "Router", "2025-10-25", "Ludhiana", PaymentMethod.UPI, OrderStatus.PLACED);

        orders1.add(orderTwentyOne);
        orders1.add(orderTwentyTwo);
        orders1.add(orderTwentyThree);
        orders1.add(orderTwentyFour);
        orders1.add(orderTwentyFive);

        System.out.println("Total orders of orders1:");
        for (Order order : orders1) {
            System.out.println(order);
        }
        System.out.println();

        System.out.println("Is orders1 added to orders: " + orders.addAll(orders1));
        System.out.println("Is orders contains orderSeven: " + orders.contains(orderSeven));
        System.out.println("Is orders contains all orders1: " + orders.containsAll(orders1));
        System.out.println();

        System.out.println("Total orders:");
        for (Order order : orders) {
            System.out.println(order);
        }

        System.out.println();
        System.out.println("Is orderTwentyOne removed: " + orders.remove(orderTwentyOne));
        System.out.println("Is orders1 removed from orders: " + orders.removeAll(orders1));
        System.out.println();
        System.out.println("Total orders:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
