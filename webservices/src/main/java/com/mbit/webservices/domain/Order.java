package com.mbit.webservices.domain;

public class Order {
    private String orderId;
    private String productId;
    private String status;



    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }



    @Override
    public String toString() {
        return "Your Order has been placed. Order Id is " + orderId ;
    }
}
