package com.Anish.Recipe.Managemnet.System.repository;

import com.Anish.Recipe.Managemnet.System.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepo extends JpaRepository<Recipe,Long> {

}
