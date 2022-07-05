/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.musicapp.Repository;

import com.musicapp.Entities.Product;
import java.io.Serializable;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author mrg1813
 */

@Stateless
public class ProductRepository implements Serializable  {

    @PersistenceContext(name = "sample")
    private EntityManager entityManager;

    public ProductRepository() {

    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void create(Product product) {
        getEntityManager().persist(product);
        getEntityManager().flush();
    }

    public Product findById(Long id) {
        Product productfound = getEntityManager().find(Product.class, id);
        return productfound;
    }

    public List<Product> findAll() {
        return getEntityManager().createQuery("select p from Product p", Product.class).getResultList();

    }

    public void delete(Product product) {
        getEntityManager().remove(findById(product.getId()));
        getEntityManager().flush();
    }

    public void edit(Product product) {
        getEntityManager().merge(product);
        getEntityManager().flush();
    }
    

}
