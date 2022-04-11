package com.thoughtworks.springbootlearnings;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UsersController {

    @GetMapping
    public String getUsers(){
     return "Get Request was sent";
    }

    @GetMapping("/{userId}")
    public String getUser(@PathVariable String userId){
        return "Get Request was sent for the user " +userId;
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
