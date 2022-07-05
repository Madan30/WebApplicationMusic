 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.musicapp.Controllers;

import com.musicapp.Entities.User;
import com.musicapp.Repository.UserRepository;
import java.io.Serializable;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;


/**
 *
 * @author mrg1813
 */
@ViewScoped
@Named
public class UserController  implements Serializable{

    private User user;
    
  
    
    @Inject
    UserRepository repository;

    public User getUser() {
        return user;
    }
    
    

    public void setUser(User user) {
        this.user = user;
    }
}
