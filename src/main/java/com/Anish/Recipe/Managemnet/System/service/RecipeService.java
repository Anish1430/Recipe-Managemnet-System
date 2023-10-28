package com.Anish.Recipe.Managemnet.System.service;

import com.Anish.Recipe.Managemnet.System.model.Recipe;
import com.Anish.Recipe.Managemnet.System.repository.RecipeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class RecipeService {

    @Autowired
    RecipeRepo recipeRepo;

    public Recipe createRecipe(Recipe recipe) {
       return recipeRepo.save(recipe);
    }
}
