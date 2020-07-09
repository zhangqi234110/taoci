package com.example.taoci.service.serviceImpl;

import com.example.taoci.dao.CountDao;
import com.example.taoci.pojo.Count;
import com.example.taoci.service.CountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CountServiceImpl implements CountService {

    @Autowired
    private CountDao countDao;

    @Override
    public List<Count> findAll() {
        List<Count> all = countDao.findAll();
        return all;
    }
}
