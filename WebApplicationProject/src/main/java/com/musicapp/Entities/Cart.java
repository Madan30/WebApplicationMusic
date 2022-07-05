///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.musicapp.Entities;
//
//import java.util.Objects;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
///**
// *
// * @author mrg1813
// */
//@Entity
//@Table(name = "Cart_tbl")
//public class Cart {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "cart_id", nullable = false, unique = true)
//    private int cartId;
//
//    private String imge;
//    private String pname;
//
//    @Column(name = "cart_qty")
//    private int quantity;
//
//    private int price;
//
//    private int total;
//
//    private Product product;
//    private Customer customer;
//
//    // creating constructor
//    public Cart() {
//
//    }
//
//    // creating parameter constructor
//    public Cart(String imge, String pname, int quantity, int price, int total, Product product, Customer customer) {
//        this.imge = imge;
//        this.pname = pname;
//        this.quantity = quantity;
//        this.price = price;
//        this.total = total;
//        this.product = product;
//        this.customer = customer;
//    }
//
//    public int getCartId() {
//        return cartId;
//    }
//
//    public void setCartId(int cartId) {
//        this.cartId = cartId;
//    }
//
//    public String getImge() {
//        return imge;
//    }
//
//    public void setImge(String imge) {
//        this.imge = imge;
//    }
//
//    public String getPname() {
//        return pname;
//    }
//
//    public void setPname(String pname) {
//        this.pname = pname;
//    }
//
//    public int getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
//    public int getTotal() {
//        return total;
//    }
//
//    public void setTotal(int total) {
//        this.total = total;
//    }
//
//    public Product getProduct() {
//        return product;
//    }
//
//    public void setProduct(Product product) {
//        this.product = product;
//    }
//
//    public Customer getCustomer() {
//        return customer;
//    }
//
//    public void setCustomer(Customer customer) {
//        this.customer = customer;
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 97 * hash + Objects.hashCode(this.imge);
//        hash = 97 * hash + Objects.hashCode(this.pname);
//        hash = 97 * hash + this.quantity;
//        hash = 97 * hash + this.price;
//        hash = 97 * hash + this.total;
//        hash = 97 * hash + Objects.hashCode(this.product);
//        hash = 97 * hash + Objects.hashCode(this.customer);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Cart other = (Cart) obj;
//        if (this.quantity != other.quantity) {
//            return false;
//        }
//        if (this.price != other.price) {
//            return false;
//        }
//        if (this.total != other.total) {
//            return false;
//        }
//        if (!Objects.equals(this.imge, other.imge)) {
//            return false;
//        }
//        if (!Objects.equals(this.pname, other.pname)) {
//            return false;
//        }
//        if (!Objects.equals(this.product, other.product)) {
//            return false;
//        }
//        if (!Objects.equals(this.customer, other.customer)) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "Cart{" + "cartId=" + cartId + ", imge=" + imge + ", pname=" + pname + ", quantity=" + quantity + ", price=" + price + ", total=" + total + ", product=" + product + ", customer=" + customer + '}';
//    }
//
//}
