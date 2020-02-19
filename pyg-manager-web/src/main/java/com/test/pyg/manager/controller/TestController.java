package com.test.pyg.manager.controller;

import com.test.pyg.sallergoods.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author idideads
 * Created on 2020-02-08-0:06
 */
@Controller
public class TestController {
    @Autowired
    private TestService testservice;

    @RequestMapping("/test/qureyNow")
    @ResponseBody
    public String queryNow(){
        System.out.println("TestController.queryNow");
        //1.引入服务
        //2.注入服务
        //3.调用服务的方法
        return testservice.queryNow();
    }
}
