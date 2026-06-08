package com.bhoomika.SpringBoootProject.repository;

import com.bhoomika.SpringBoootProject.Models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepo extends MongoRepository<Post, String> {

}
