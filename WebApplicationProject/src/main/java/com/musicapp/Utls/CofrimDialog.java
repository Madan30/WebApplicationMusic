/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.musicapp.Utls;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 *
 * @author mrg1813
 */
@ManagedBean(name = "confirmDialog")
public class CofrimDialog {
    
    public void confirm(){
        
    }
    
    public void addMessage(String summary, String details){
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, details);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    
}
