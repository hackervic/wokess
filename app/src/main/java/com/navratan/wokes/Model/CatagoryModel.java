package com.navratan.wokes.Model;

public class CatagoryModel {

    String catagoryimage , catagoryname;

    public CatagoryModel(String catagoryimage, String catagoryname) {
        this.catagoryimage = catagoryimage;
        this.catagoryname = catagoryname;
    }

    public CatagoryModel() {
    }

    public String getCatagoryimage() {
        return catagoryimage;
    }

    public void setCatagoryimage(String catagoryimage) {
        this.catagoryimage = catagoryimage;
    }

    public String getCatagoryname() {
        return catagoryname;
    }

    public void setCatagoryname(String catagoryname) {
        this.catagoryname = catagoryname;
    }
}
