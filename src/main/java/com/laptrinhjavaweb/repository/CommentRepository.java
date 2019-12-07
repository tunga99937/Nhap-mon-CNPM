package com.laptrinhjavaweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laptrinhjavaweb.entity.Comment;
@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer>  {

}
