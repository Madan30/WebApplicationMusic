package com.musicapp.Repository;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author mrg1813
 */
@Stateless
public class UserRepository implements Serializable {

    @PersistenceContext(name = "sample")
    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }
    
    
    

}
