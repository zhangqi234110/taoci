package com.example.taoci.service;

import com.example.taoci.pojo.User;

public interface UserService {
    User login(String name, String password);
}
