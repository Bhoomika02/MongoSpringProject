package com.bhoomika.SpringBoootProject.repository;

import com.bhoomika.SpringBoootProject.Models.Post;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SearchRepo {
    List<Post>  findByText (String text);
}
