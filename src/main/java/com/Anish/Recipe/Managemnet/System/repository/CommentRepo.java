package com.Anish.Recipe.Managemnet.System.repository;

import com.Anish.Recipe.Managemnet.System.model.Comment;
import com.Anish.Recipe.Managemnet.System.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepo extends JpaRepository<Comment,Long> {
    List<Comment> findByRecipe(Recipe recipe);
}
