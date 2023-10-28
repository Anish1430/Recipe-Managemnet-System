package com.Anish.Recipe.Managemnet.System.service;

import com.Anish.Recipe.Managemnet.System.model.Recipe;
import com.Anish.Recipe.Managemnet.System.repository.RecipeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class RecipeService {
        @Autowired
        RecipeRepo recipeRepo;

        public List<Recipe> getAllRecipes() {
            return recipeRepo.findAll();
        }

        public Optional<Recipe> getRecipeById(Long id) {
            return recipeRepo.findById(id);
        }

        public Recipe createRecipe(Recipe recipe) {
            return recipeRepo.save(recipe);
        }

        public Recipe updateRecipe(Long id, Recipe updatedRecipe) {
            Optional<Recipe> existingRecipe = recipeRepo.findById(id);

            if (existingRecipe.isPresent()) {
                Recipe recipe = existingRecipe.get();

                // Assuming you have validation annotations in your Recipe model
                recipe.setName(updatedRecipe.getName());
                recipe.setIngredients(updatedRecipe.getIngredients());
                recipe.setInstructions(updatedRecipe.getInstructions());

                return recipeRepo.save(recipe);
            } else {
                return null; // Recipe with the given id not found
            }
        }

        public void deleteRecipe(Long id) {
            recipeRepo.deleteById(id);
        }
    }
