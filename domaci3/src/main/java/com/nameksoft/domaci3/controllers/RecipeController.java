package com.nameksoft.domaci3.controllers;

import com.nameksoft.domaci3.models.Recipe;
import com.nameksoft.domaci3.repositiories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipeController {

    @Autowired
    RecipeRepository recipeRepository;

    @RequestMapping(method=RequestMethod.GET, value="/recipes")
    public Iterable<Recipe> contact() {
        return recipeRepository.findAll();
    }

    @RequestMapping(method=RequestMethod.POST, value="/recipes")
    public Recipe save(@RequestBody Recipe recipe) {
        recipeRepository.save(recipe);
        
        return recipe;
    }

    @RequestMapping(method=RequestMethod.GET, value="/recipes/{id}")
    public Recipe show(@PathVariable String id) {
        return recipeRepository.findById(id).get();
    }

    @RequestMapping(method=RequestMethod.PUT, value="/recipes/{id}")
    public Recipe update(@PathVariable String id, @RequestBody Recipe contact) {
    	Recipe c = recipeRepository.findById(id).get();
        if(contact.getName() != null)
            c.setName(contact.getName());
        if(contact.getDescription() != null)
            c.setDescription(contact.getDescription());
        if(contact.getIngredients() != null)
            c.setIngredients(contact.getIngredients());
        recipeRepository.save(c);
        return contact;
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/recipes/{id}")
    public String delete(@PathVariable String id) {
        Recipe contact = recipeRepository.findById(id).get();
        recipeRepository.delete(contact);

        return "";
    }
}