package com.josamtechie.feign.client.api.controller;

import com.josamtechie.feign.client.api.client.UserClient;
import com.josamtechie.feign.client.api.dto.UserResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController
{

    private UserClient userClient;

    public UserController(UserClient userClient)
    {
        this.userClient = userClient;
    }

    @GetMapping("/allUsers")
    public List<UserResponse> getAllUsers()
    {
        return userClient.getUsers();
    }
}
