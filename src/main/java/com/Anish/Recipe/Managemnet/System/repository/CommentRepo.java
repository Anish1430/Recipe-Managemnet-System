package com.Anish.Recipe.Managemnet.System.repository;

import com.Anish.Recipe.Managemnet.System.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepo extends JpaRepository<Comment,Long> {
}
