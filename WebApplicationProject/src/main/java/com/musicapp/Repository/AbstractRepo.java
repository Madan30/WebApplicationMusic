///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.musicapp.Repository;
//
//import com.musicapp.DAO.DataRepo;
//import java.util.List;
//import javax.persistence.EntityManager;
//
///**
// *
// * @author mrg1813
// */
//abstract  class AbstractRepo<T> implements DataRepo<T>{
//    public abstract EntityManager getEntityManager();
//    private Class<T> entityClass;
//
//    public Class<T> getEntityClass() {
//        return entityClass;
//    }
//
//    public void setEntityClass(Class<T> entityClass) {
//        this.entityClass = entityClass;
//    }
//    
//    @Override
//    public void create(T obj){
//        getEntityManager().persist(obj);
//        getEntityManager().flush();
//    }
//    
//     @Override
//    public void edit(T obj){
//        getEntityManager().merge(obj);
//        getEntityManager().flush();
//    }
//    
//     @Override
//    public List<T> findAll(){
//        return getEntityManager().createQuery("Select t from" + entityClass.getName()+ "t").getResultList();
//    }
//    
//     @Override
//    public T findById(Long id){
//        return getEntityManager().find(entityClass, id);
//    }
//    
//    
//    
//}
