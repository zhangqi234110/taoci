package com.example.taoci.dao;

import com.example.taoci.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    User login(String name,String password);

}
