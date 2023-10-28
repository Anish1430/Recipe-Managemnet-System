package com.Anish.Recipe.Managemnet.System.service;

import com.Anish.Recipe.Managemnet.System.model.Recipe;
import com.Anish.Recipe.Managemnet.System.repository.RecipeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class RecipeService {

    @Autowired
    RecipeRepo recipeRepo;
    public List<Recipe> getAllRecipes() {
        return recipeRepo.findAll();
    }

    public Recipe getRecipeById(Long id) {
        return recipeRepo.findById(id).orElse(null);
    }

    public Recipe createRecipe(Recipe recipe) {
        return recipeRepo.save(recipe);
    }

    public Recipe updateRecipe(Long id, Recipe updatedRecipe) {
        Recipe existingRecipe = recipeRepo.findById(id).orElse(null);
        if (existingRecipe != null) {
            existingRecipe.setName(updatedRecipe.getName());
            existingRecipe.setIngredients(updatedRecipe.getIngredients());
            existingRecipe.setInstructions(updatedRecipe.getInstructions());
            return recipeRepo.save(existingRecipe);
        }
        return null;
    }

    public void deleteRecipe(Long id) {
         recipeRepo.deleteById(id);
    }
}
