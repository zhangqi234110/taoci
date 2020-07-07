package com.example.taoci.service.serviceImpl;

import com.example.taoci.dao.UserDao;
import com.example.taoci.pojo.User;
import com.example.taoci.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User login(String name, String password) {
        User login = userDao.login(name, password);
        return login;
    }
}
