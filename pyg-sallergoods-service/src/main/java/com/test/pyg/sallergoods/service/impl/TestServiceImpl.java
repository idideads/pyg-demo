package com.test.pyg.sallergoods.service.impl;


import com.test.pyg.mapper.TestMapper;
import com.test.pyg.sallergoods.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author idideads
 * Created on 2020-02-08-0:04
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;
    @Override
    public String queryNow() {
        return testMapper.queryNow();
    }
}
