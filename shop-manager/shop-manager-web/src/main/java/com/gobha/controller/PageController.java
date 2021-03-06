package com.gobha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转Controller
 * 
 * @author gobhazeng
 * @date 2018-05-19 下午9:04:01
 */
@Controller
public class PageController {

    /**
     * 跳转首页
     * 
     * @return
     */
    @RequestMapping("/")
    public String showIndex() {
        return "index";
    }

    /**
     * 跳转各功能页面
     * 
     * @param page
     * @return
     */
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page) {
        return page;
    }

}
