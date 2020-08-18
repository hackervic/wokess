package com.navratan.wokes.Model;

public class ShopsModel {

    String shop_name , shop_address , shop_status, shop_image ;

    public ShopsModel() {
    }

    public ShopsModel(String shop_name, String shop_address, String shop_status, String shop_image) {
        this.shop_name = shop_name;
        this.shop_address = shop_address;
        this.shop_status = shop_status;
        this.shop_image = shop_image;
    }

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    public String getShop_address() {
        return shop_address;
    }

    public void setShop_address(String shop_address) {
        this.shop_address = shop_address;
    }

    public String getShop_status() {
        return shop_status;
    }

    public void setShop_status(String shop_status) {
        this.shop_status = shop_status;
    }

    public String getShop_image() {
        return shop_image;
    }

    public void setShop_image(String shop_image) {
        this.shop_image = shop_image;
    }
}
