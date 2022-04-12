//package com.thoughtworks.springbootlearnings;
//
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/users")
//public class UsersController {
//
//    @GetMapping
//    public String getUsers(@RequestParam(value = "page") int pageno, @RequestParam(value = "limit") int limit){
//     return "Get Request was sent with pageno as : " +pageno + " and limit  as : " +limit;
//    }
//
//    @GetMapping("/{userId}")
//    public String getUser(@PathVariable String userId){
//        return "Get Request was sent for the user " +userId;
//    }
//
//
//    @PostMapping
//    public String createUser(){
//        return "Post Request was send ";
//    }
//
//    @PutMapping
//    public String updateUser(){
//        return "Put Request was send";
//    }
//
//    @DeleteMapping
//    public String deleteUser(){
//        return "Delete Request was send";
//    }
//}
