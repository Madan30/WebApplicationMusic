package com.musicapp.Utls;

import com.musicapp.Entities.Category;
import com.musicapp.Repository.CategoryRepository;
import javax.enterprise.context.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

/**
 *
 * @author mrg1813
 */
@RequestScoped
@FacesConverter(value = "categoryConverter")
public class CategoryConverter implements Converter{
    
   @Inject
    private CategoryRepository cateRepo;
   
   

   
    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
        if (value == null || value.isEmpty() || value.length() == 0 || value.equals(" ") || value.equals("")) {
            return null;
        }
        
        return cateRepo.findById(Long.valueOf(value));
        
    }
    
    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object value) {
        if (value == null || value.equals(" ") || value.equals("")) {
            return " ";
        } else {
            Long id = ((Category) value).getId();
            return String.valueOf(id);
        }
        //  return ((Category) o).getId().toString();
    }
    
}
