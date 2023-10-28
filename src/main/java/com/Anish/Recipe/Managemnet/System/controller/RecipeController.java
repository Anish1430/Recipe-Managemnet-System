package com.Anish.Recipe.Managemnet.System.controller;

import com.Anish.Recipe.Managemnet.System.model.Comment;
import com.Anish.Recipe.Managemnet.System.model.Recipe;
import com.Anish.Recipe.Managemnet.System.service.CommentService;
import com.Anish.Recipe.Managemnet.System.service.RecipeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/recipes")
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

    @Autowired
    private CommentService commentService;

    @GetMapping
    public List<Recipe> getAllRecipes() {
        return recipeService.getAllRecipes();
    }

    @GetMapping("/{id}")
    public Optional<Recipe> getRecipeById(@PathVariable Long id) {
        return recipeService.getRecipeById(id);
    }

    @PostMapping
    public Recipe createRecipe(@Valid @RequestBody Recipe recipe) {
        return recipeService.createRecipe(recipe);
    }

    @PutMapping("/{id}")
    public Recipe updateRecipe(@PathVariable Long id, @Valid @RequestBody Recipe updatedRecipe) {
        return recipeService.updateRecipe(id, updatedRecipe);
    }

    @DeleteMapping("/{id}")
    public void deleteRecipe(@PathVariable Long id) {
        recipeService.deleteRecipe(id);
    }

    @PostMapping("/{id}/comments")
    public Comment createComment(@PathVariable Long id, @Valid @RequestBody Comment comment) {
        Optional<Recipe> recipe = recipeService.getRecipeById(id);

        if (recipe.isPresent()) {
            return commentService.createComment(recipe.get(), comment);
        } else {
            return null; // Recipe with the given id not found
        }
    }
}