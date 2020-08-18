package com.navratan.wokes.Model;

public class CartModel {
    String cart_product_image , cart_product_name , cart_product_price , cart_count ;

    public CartModel(String cart_product_image, String cart_product_name, String cart_product_price, String cart_count) {
        this.cart_product_image = cart_product_image;
        this.cart_product_name = cart_product_name;
        this.cart_product_price = cart_product_price;
        this.cart_count = cart_count;
    }

    public CartModel() {

    }

    public String getCart_product_image() {
        return cart_product_image;
    }

    public void setCart_product_image(String cart_product_image) {
        this.cart_product_image = cart_product_image;
    }

    public String getCart_product_name() {
        return cart_product_name;
    }

    public void setCart_product_name(String cart_product_name) {
        this.cart_product_name = cart_product_name;
    }

    public String getCart_product_price() {
        return cart_product_price;
    }

    public void setCart_product_price(String cart_product_price) {
        this.cart_product_price = cart_product_price;
    }

    public String getCart_count() {
        return cart_count;
    }

    public void setCart_count(String cart_count) {
        this.cart_count = cart_count;
    }
}
