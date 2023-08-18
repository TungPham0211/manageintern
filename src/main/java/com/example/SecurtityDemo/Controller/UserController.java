package com.example.SecurtityDemo.Controller;

import com.example.SecurtityDemo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


public class UserController {
//    @Autowired
//    private UserService userService;
//
//    @PostMapping("/forgot-password")
//    public String forgotPassword(@RequestParam String email) {
//
//        String response = userService.forgotPassword(email);
//
//        if (!response.startsWith("Invalid")) {
//            response = "http://localhost:8080/reset-password?token=" + response;
//        }
//        return response;
//    }
//
//    @PutMapping("/reset-password")
//    public String resetPassword(@RequestParam String token,
//                                @RequestParam String password) {
//
//        return userService.resetPassword(token, password);
//    }
}
