package com.mksun.maven.subone.service;

import com.mksun.maven.subone.entity.Test;

import java.util.List;

public interface TestService {
    List<Test> queryTestList();
    Test queryTestById(String id);
}
