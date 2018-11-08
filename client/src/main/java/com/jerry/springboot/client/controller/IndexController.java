package com.jerry.springboot.client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jerry.Wu
 * @description:
 * @date 2018/11/8 10:44
 */
@RestController
public class IndexController extends BaseController {

    @RequestMapping("/")
    public Object index() {
        logger.debug("有人访问了index");
        return "index";
    }



}
