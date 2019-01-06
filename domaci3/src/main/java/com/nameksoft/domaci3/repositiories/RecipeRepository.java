package com.nameksoft.domaci3.repositiories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.nameksoft.domaci3.models.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, String> {
    @Override
    Optional<Recipe> findById(String id);

    @Override
    void delete(Recipe deleted);
}
