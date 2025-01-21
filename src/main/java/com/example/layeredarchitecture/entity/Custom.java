package com.example.layeredarchitecture.entity;

public class Custom {
    private int orderId;
    private String customerName;
    private String OrderDetailDate;
    private String OrderDate;
    private String OrderStatus;

    public Custom(int OrderId, String CustomerName, String OrderDetailDate) {
        this.orderId = OrderId;
        this.customerName = CustomerName;
        this.OrderDetailDate = OrderDetailDate;
    }
    public Custom(int OrderId, String CustomerName, String OrderDetailDate, String OrderStatus) {
        this.orderId = OrderId;
        this.customerName = CustomerName;
        this.OrderDetailDate = OrderDetailDate;
        this.OrderStatus = OrderStatus;
    }
}
