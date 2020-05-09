package com.mksun.maven.subone.service.impl;

import com.mksun.maven.subone.dao.TestDao;
import com.mksun.maven.subone.entity.Test;
import com.mksun.maven.subone.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    @Resource
    private TestDao testDao;
    @Override
    public List<Test> queryTestList() {
        return testDao.queryTestList();
    }

    @Override
    public Test queryTestById(String id) {
        return testDao.queryTestById(id);
    }
}
