package com.bhoomika.SpringBoootProject.Controller;

import com.bhoomika.SpringBoootProject.Models.Post;
import com.bhoomika.SpringBoootProject.repository.PostRepo;
import com.bhoomika.SpringBoootProject.repository.SearchRepo;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostRepo repo;
    @Autowired
    SearchRepo searchRepo;
    @ApiResponse
    @RequestMapping("/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }

    @GetMapping("/getPosts")
    public List<Post> getAllPosts(){

        return repo.findAll();
    }

    @PostMapping("/addPosts")
    public List<Post> addPosts(@RequestBody List<Post> posts){

        return repo.saveAll(posts);
    }

    @GetMapping("/getPosts/{text}")
    public List<Post> search (@PathVariable String text){
        return searchRepo.findByText(text);
    }
}
