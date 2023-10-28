package com.Anish.Recipe.Managemnet.System.service;


import com.Anish.Recipe.Managemnet.System.model.Comment;
import com.Anish.Recipe.Managemnet.System.model.Recipe;
import com.Anish.Recipe.Managemnet.System.repository.CommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CommentService {
    @Autowired
    private CommentRepo commentRepo;

    public Comment createComment(Recipe recipe, Comment comment) {
        comment.setRecipe(recipe);
        return commentRepo.save(comment);
    }
}
