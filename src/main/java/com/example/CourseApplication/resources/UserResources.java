package com.example.CourseApplication.resources;

import com.example.CourseApplication.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<User> finAll() {
        User u = new User(1L, "Lucas", "lulu@gmail.com", "12456789", "123123");
        return ResponseEntity.ok().body(u);
    }
}
