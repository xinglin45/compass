package com.hydsoft.compass.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("openApi")
/**  
* @title: ApiController.java
* @description: Test对接接口
* @author xingl
* @date 2019/5/27 16:49
*/
public class ApiController {
    //日志句柄
    private static final Logger LOGGER = LogManager.getLogger(ApiController.class);

    /**
     * Test对接接口
     * @param
     * @return
     */
    @RequestMapping(method =  RequestMethod.POST,value = "/duerosApi")
    public void test() {
        System.out.println("Test***********************");
        System.out.println("test2222222222222222222222");
    }

}
