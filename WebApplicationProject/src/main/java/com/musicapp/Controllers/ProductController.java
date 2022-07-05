package com.musicapp.Controllers;

import com.musicapp.Entities.Product;
import com.musicapp.Repository.ProductRepository;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@ViewScoped
@Named
public class ProductController implements Serializable {

    private Product product;
    private List<Product> productList = new ArrayList<>();

    @Inject
    private ProductRepository repo;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @PostConstruct
    public void init() {
        this.product = new Product();
        productList = new ArrayList<>();
        this.productList = repo.findAll();
    }

    public void beforeCreate() {
        this.product = new Product();
    }

    public void create() {
        repo.create(product);
        productList = repo.findAll();
    }

    public void beforeEdit(Product p) {
        this.product = repo.findById(p.getId());
    }

    public void edit() {
        repo.edit(product);
        productList = repo.findAll();
    }

    public void delete(Product product) {
        repo.delete(product);
        productList = repo.findAll();
    }

    public void findAll() {
        repo.findAll();
    }

    public void findById(Long id) {

        repo.findById(id);
    }

}
