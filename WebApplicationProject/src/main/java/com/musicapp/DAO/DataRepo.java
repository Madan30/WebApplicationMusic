/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.musicapp.DAO;

import java.util.List;

/**
 *
 * @author mrg1813
 */
public interface DataRepo<T> {

    public  void create(T e);

    public List<T> findAll();

    public T findById(Long id);

    public void delete(T e);

    public void edit(T e);

}
