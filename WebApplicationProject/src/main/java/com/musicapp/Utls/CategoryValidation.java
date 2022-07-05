/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.musicapp.Utls;

import com.musicapp.Entities.Category;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.ValidatorException;
import javax.inject.Inject;


/**
 *
 * @author mrg1813
 */
@ManagedBean
@SessionScoped
@FacesValidator("categoryValidator")
public class CategoryValidation implements Serializable {
    
   

    @ManagedProperty(value = "#{category}")
    @Inject
    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
    
    

    public void validate(FacesContext context, UIComponent ui, Object object) throws ValidatorException {
        String name = (String) object;

        if (name.length() > 3) {
            FacesMessage fm = new FacesMessage("Category Name should be at least four character");
            fm.setSeverity(FacesMessage.SEVERITY_ERROR);

            throw new ValidatorException(fm);
        }

    }

}
