//package com.policyinsur.controller;
//
//import com.policyinsur.entity.User;
//import com.policyinsur.service.UserService;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/users")
//public class UserController {
//
//    private final UserService userService;
//
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//
//    @PostMapping("/create")
//    public User createUser(
//            @RequestBody User user,
//            @RequestParam String role) {
//
//        return userService.createUser(user, role);
//    }
//}
