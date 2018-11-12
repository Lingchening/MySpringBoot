package com.example.zl.service.impl;

import com.example.zl.domain.WebDao;
import com.example.zl.domain.WebDomain;
import com.example.zl.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("templateService")
public class TemplateServiceImpl implements TemplateService {

    @Autowired
    private WebDao webDao;

    @Override
    public List<WebDomain> getList() {
        return webDao.getList();
    }
}
