package com.mksun.maven.subone.dao;

import com.mksun.maven.subone.entity.Test;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TestDao {
    List<Test> queryTestList();
    Test queryTestById(String id);

    int saveTest(Test test);
}
