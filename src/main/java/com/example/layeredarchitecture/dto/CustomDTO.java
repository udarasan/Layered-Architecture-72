package com.example.layeredarchitecture.dto;

public class CustomDTO {
    private int orderId;
    private String customerName;
    private String OrderDetailDate;
    private String OrderDate;
    private String OrderStatus;

    public CustomDTO(int OrderId, String CustomerName, String OrderDetailDate) {
        this.orderId = OrderId;
        this.customerName = CustomerName;
        this.OrderDetailDate = OrderDetailDate;
    }
    public CustomDTO(int OrderId, String CustomerName, String OrderDetailDate, String OrderStatus) {
        this.orderId = OrderId;
        this.customerName = CustomerName;
        this.OrderDetailDate = OrderDetailDate;
        this.OrderStatus = OrderStatus;
    }
}
