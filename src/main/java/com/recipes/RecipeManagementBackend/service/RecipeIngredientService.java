package com.recipes.RecipeManagementBackend.service;

import com.recipes.RecipeManagementBackend.exception.EntityNotFoundException;
import com.recipes.RecipeManagementBackend.model.Recipe;
import com.recipes.RecipeManagementBackend.model.RecipeIngredient;
import com.recipes.RecipeManagementBackend.repository.RecipeIngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class RecipeIngredientService {
    private RecipeIngredientRepository recipeIngredientRepository;

    @Autowired
    public RecipeIngredientService(RecipeIngredientRepository recipeIngredientRepository) {
        this.recipeIngredientRepository = recipeIngredientRepository;
    }

    public void saveRecipeIngredient(RecipeIngredient recipeIngredient) {
        recipeIngredientRepository.save(recipeIngredient);
    }

    public RecipeIngredient getRecipeIngredientById(Long id) {
        return recipeIngredientRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("RecipeIngredient" + id + "not found!"));
    }



    public List<RecipeIngredient> getAllRecipesIngredient() {
        return recipeIngredientRepository.findAll();
    }
}

