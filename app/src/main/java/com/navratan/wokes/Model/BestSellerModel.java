package com.navratan.wokes.Model;

public class BestSellerModel {

    String shopimage , shopname, shopaddress , shopoffer , shoprating;

    public BestSellerModel(String shopimage, String shopname, String shopaddress, String shopoffer, String shoprating) {
        this.shopimage = shopimage;
        this.shopname = shopname;
        this.shopaddress = shopaddress;
        this.shopoffer = shopoffer;
        this.shoprating = shoprating;
    }

    public BestSellerModel() {
    }

    public String getShopimage() {
        return shopimage;
    }

    public void setShopimage(String shopimage) {
        this.shopimage = shopimage;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public String getShopaddress() {
        return shopaddress;
    }

    public void setShopaddress(String shopaddress) {
        this.shopaddress = shopaddress;
    }

    public String getShopoffer() {
        return shopoffer;
    }

    public void setShopoffer(String shopoffer) {
        this.shopoffer = shopoffer;
    }

    public String getShoprating() {
        return shoprating;
    }

    public void setShoprating(String shoprating) {
        this.shoprating = shoprating;
    }
}
