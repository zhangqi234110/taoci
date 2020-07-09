package com.example.taoci.dao;

import com.example.taoci.pojo.Count;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountDao {
    List<Count> findAll();

}
