package com.example.zl.controller;

import com.example.zl.beantest.LearnBean;
import com.example.zl.domain.WebDomain;
import com.example.zl.service.TemplateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/learn")
public class TemplateController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private TemplateService templateService;

    /**
     * The first test to show data
     * @return
     */
    @RequestMapping("/first")
    public ModelAndView index() {
//        List<LearnBean> list = new ArrayList<LearnBean>();
//
//        LearnBean learn = new LearnBean();
//        learn.setName("百度");
//        learn.setUrl("http://www.baidu.com");
//        list.add(learn);
//
//        learn = new LearnBean();
//        learn.setName("淘宝");
//        learn.setUrl("http://www.taobao.com");
//        list.add(learn);
//
//        learn = new LearnBean();
//        learn.setName("谷歌");
//        learn.setUrl("http://www.google.com");
//        list.add(learn);
        List<WebDomain> list = templateService.getList();
        //model.addAttribute("list",list);
        ModelAndView model = new ModelAndView("index");

        model.addObject("list", list);
        return model;
    }

    /**
     * Get websit list
     * @author zl
     * @date 2018.11.12
     */
    @RequestMapping(value = "getList",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    @ResponseBody
    public void getList(Model model){
        List<WebDomain> list = templateService.getList();
        model.addAttribute("list",list);
    }

}
