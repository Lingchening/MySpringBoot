package com.example.zl.controller;

import com.example.zl.beantest.LearnBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/learn")
public class TemplateController {

    @RequestMapping("/")
    public ModelAndView index(){
        List<LearnBean> list = new ArrayList<LearnBean>();

        LearnBean learn = new LearnBean();
        learn.setName("百度");
        learn.setUrl("http://www.baidu.com");
        list.add(learn);

        learn = new LearnBean();
        learn.setName("淘宝");
        learn.setUrl("http://www.taobao.com");
        list.add(learn);

        learn = new LearnBean();
        learn.setName("谷歌");
        learn.setUrl("http://www.google.com");
        list.add(learn);

        ModelAndView model = new ModelAndView("/index");

        model.addObject("list",list);
        return model;
    }
}
