package com.mksun.maven.subtwo;

import com.mksun.maven.subone.entity.RtnJSON;
import com.mksun.maven.subone.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

@RestController
public class TestAnotherController {

    @Resource
    private TestService testService;

    @GetMapping("/test")
    public String test(){
        return "Hello, world!"+new Date().getTime();
    }

    @GetMapping("/queryTests")
    public RtnJSON queryTests(@RequestParam(value = "id", defaultValue = "") String id) {
        RtnJSON result = new RtnJSON();
        result.setInfo(testService.queryTestList());
        return result;
    }
}
