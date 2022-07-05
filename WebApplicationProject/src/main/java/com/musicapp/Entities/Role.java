/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.musicapp.Entities;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author mrg1813
 */
@Entity
@Table(name = "Role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "u_Id", nullable = false, unique = true)
    private Long uId;

    @Column(name = "u_Desc", nullable = false)
    private String uDesc;

    // creating default constructor
    // constructor is used to initialize the object in java
    public Role() {

    }

    // creating paramter constructor
    public Role(Long uId, String uDesc) {
        this.uId = uId;
        this.uDesc = uDesc;
    }

    // creating constructor
    public Role(String uDesc) {

        this.uDesc = uDesc;
    }

    public void setuId(Long uId) {
        this.uId = uId;
    }

    public String getuDesc() {
        return uDesc;
    }

    public void setuDesc(String uDesc) {
        this.uDesc = uDesc;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.uDesc);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Role other = (Role) obj;
        if (!Objects.equals(this.uDesc, other.uDesc)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Role{" + "uId=" + uId + ", uDesc=" + uDesc + '}';
    }

}
