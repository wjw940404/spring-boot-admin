package com.jerry.admin.client.eureka.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jerry.Wu
 * @description:
 * @date 2018/11/8 10:44
 */
@RestController
public class IndexController extends BaseController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/")
    public Object index() {
        logger.debug("有人访问了index");
        return "index";
    }

    @RequestMapping("/port")
    public String getPort() {
        return "Hello World, I'm from port : " + port;
    }

}
