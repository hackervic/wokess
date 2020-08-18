package com.navratan.wokes.Model;

public class OrdersModel {

    String getOrder_product_status,order_time_stamp,order_id,order_payment_mode,order_quantity;

    public OrdersModel(String getOrder_product_status, String order_time_stamp, String order_id, String order_payment_mode, String order_quantity) {
        this.getOrder_product_status = getOrder_product_status;
        this.order_time_stamp = order_time_stamp;
        this.order_id = order_id;
        this.order_payment_mode = order_payment_mode;
        this.order_quantity = order_quantity;
    }

    public OrdersModel() {
    }

    public String getGetOrder_product_status() {
        return getOrder_product_status;
    }

    public void setGetOrder_product_status(String getOrder_product_status) {
        this.getOrder_product_status = getOrder_product_status;
    }

    public String getOrder_time_stamp() {
        return order_time_stamp;
    }

    public void setOrder_time_stamp(String order_time_stamp) {
        this.order_time_stamp = order_time_stamp;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getOrder_payment_mode() {
        return order_payment_mode;
    }

    public void setOrder_payment_mode(String order_payment_mode) {
        this.order_payment_mode = order_payment_mode;
    }

    public String getOrder_quantity() {
        return order_quantity;
    }

    public void setOrder_quantity(String order_quantity) {
        this.order_quantity = order_quantity;
    }
}
