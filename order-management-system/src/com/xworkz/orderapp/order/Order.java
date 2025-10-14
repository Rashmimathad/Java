package com.xworkz.orderapp.order;

import com.xworkz.orderapp.constants.OrderStatus;
import com.xworkz.orderapp.constants.PaymentMethod;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Order {

    private int orderId;
    private String orderItemName;
    private String orderDate;
    private String deliveryAddress;
    private PaymentMethod paymentMethod;
    private OrderStatus orderStatus;

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderItemName='" + orderItemName + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", paymentMethod=" + paymentMethod +
                ", orderStatus=" + orderStatus +
                '}';
    }
}
