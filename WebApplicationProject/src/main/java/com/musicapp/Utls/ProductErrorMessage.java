///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.musicapp.Utls;
//
//import javax.faces.application.FacesMessage;
//import javax.faces.bean.ManagedBean;
//import javax.faces.context.FacesContext;
//import javax.faces.view.ViewScoped;
//
///**
// *
// * @author mrg1813
// */
//@ManagedBean(name = "prodError")
//@ViewScoped
//public class ProductErrorMessage {
//    
//    private String name;
//    private String price;
//    private String desc;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getPrice() {
//        return price;
//    }
//
//    public void setPrice(String price) {
//        this.price = price;
//    }
//
//    public String getDesc() {
//        return desc;
//    }
//
//    public void setDesc(String desc) {
//        this.desc = desc;
//    }
//    
//    public void displayMessage(){
//        FacesContext context = FacesContext.getCurrentInstance();
//        context.addMessage(null, new FacesMessage("Please fill the required form" + name + " " + price + " " + desc));
//    }
//    
//}
