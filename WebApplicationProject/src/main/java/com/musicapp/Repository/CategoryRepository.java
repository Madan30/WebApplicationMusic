
package com.musicapp.Repository;

import com.musicapp.Entities.Category;
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
public class CategoryRepository implements Serializable {

    @PersistenceContext(name = "sample")
    private EntityManager entityManager;

    public EntityManager getEntityManger() {
        return entityManager;
    }

    public void create(Category category) {
        getEntityManger().persist(category);
        getEntityManger().flush();
    }

    public void edit(Category category) {
        getEntityManger().merge(category);
        getEntityManger().flush();
    }

    public void delete(Category category) {
        getEntityManger().remove(findById(category.getId()));
        getEntityManger().flush();
    }

    public List<Category> findAll() {
        return getEntityManger().createQuery("select c from Category c", Category.class).getResultList();

    }

    public Category findById(Long id) {
        return getEntityManger().find(Category.class, id);
    }

}
