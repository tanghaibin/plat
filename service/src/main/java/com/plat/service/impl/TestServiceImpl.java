package com.plat.service.impl;

import com.plat.po.TestPo;
import com.plat.repository.TestRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.plat.service.TestService;

import java.util.List;

/**
 * @author haibin.tang
 * @create 2018-04-27 上午9:17
 **/
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestRespository testRespository;

    @Override
    public List<TestPo> findAll() {
        return testRespository.findAll();
    }
}
