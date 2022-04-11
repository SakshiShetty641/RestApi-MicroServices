package com.thoughtworks.springbootlearnings;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UsersController {

    @GetMapping
    public String getUsers(){
     return "Get Request was sent";
    }

    @PostMapping
    public String createUser(){
        return "Post Request was send ";
    }

    @PutMapping
    public String updateUser(){
        return "Put Request was send";
    }

    @DeleteMapping
    public String deleteUser(){
        return "Delete Request was send";
    }
}
