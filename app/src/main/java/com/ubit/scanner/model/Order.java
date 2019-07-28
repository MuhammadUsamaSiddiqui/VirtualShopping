package com.ubit.scanner.model;

public class Order {

    private String orderId;
    private String userId;
    private String username;
    private String dressId;

    public Order(){

    }

    public Order(String orderId, String userId, String username, String dressId) {
        this.orderId = orderId;
        this.userId = userId;
        this.username = username;
        this.dressId = dressId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setDressId(String dressId) {
        this.dressId = dressId;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getDressId() {
        return dressId;
    }
}
