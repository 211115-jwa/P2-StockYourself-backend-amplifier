package com.revature.stockYourself.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.stockYourself.beans.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

}
