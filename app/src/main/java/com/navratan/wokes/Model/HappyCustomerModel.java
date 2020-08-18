package com.navratan.wokes.Model;

public class HappyCustomerModel {

    String hcname , hclocation , hccomment , hcimage;

    public HappyCustomerModel(String hcname, String hclocation, String hccomment, String hcimage) {
        this.hcname = hcname;
        this.hclocation = hclocation;
        this.hccomment = hccomment;
        this.hcimage = hcimage;
    }

    public HappyCustomerModel() {
    }

    public String getHcname() {
        return hcname;
    }

    public void setHcname(String hcname) {
        this.hcname = hcname;
    }

    public String getHclocation() {
        return hclocation;
    }

    public void setHclocation(String hclocation) {
        this.hclocation = hclocation;
    }

    public String getHccomment() {
        return hccomment;
    }

    public void setHccomment(String hccomment) {
        this.hccomment = hccomment;
    }

    public String getHcimage() {
        return hcimage;
    }

    public void setHcimage(String hcimage) {
        this.hcimage = hcimage;
    }
}
