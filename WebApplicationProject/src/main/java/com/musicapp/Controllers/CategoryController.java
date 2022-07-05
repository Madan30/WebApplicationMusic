package com.musicapp.Controllers;

import com.musicapp.Entities.Category;
import com.musicapp.Repository.CategoryRepository;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@ViewScoped
@Named
public class CategoryController implements Serializable {

    private Category category;

    private List<Category> categoryList = new ArrayList<>();

    @Inject
    private CategoryRepository catRepo;

    // create getter and setter of category and list category
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    @PostConstruct
    public void init() {
        this.category = new Category();
        categoryList = new ArrayList<>();
        this.categoryList = catRepo.findAll();
    }

    public void create() {
        catRepo.create(category);
        categoryList = catRepo.findAll();

    }

    public void beforeEdit(Category category) {
        this.category = catRepo.findById(category.getId());
    }

    public void edit() {
        catRepo.edit(category);
        categoryList = catRepo.findAll();
    }

    public void delete(Category category) {
        catRepo.delete(category);
        categoryList = catRepo.findAll();
    }

    public void findAll() {
        catRepo.findAll();
    }

    public void findById(Long id) {

        catRepo.findById(id);
    }

    public List<Category> categoryListNames() {

        List<String> nameList = new ArrayList<>();
        for (Category c : categoryList) {
          nameList.add(c.getName());
        }
        return categoryList;
    }

}
