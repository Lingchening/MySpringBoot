package com.example.zl.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class WebDaoImpl implements WebDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private PreparedStatement ps;

    @Override
    public List<WebDomain> getList() {
        try{
            List<WebDomain> list = jdbcTemplate.query("select * from website",  new BeanPropertyRowMapper(WebDomain.class));
            if(null != list && list.size()>0){
                return list;
            }else{
                return new ArrayList<WebDomain>();
            }
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList<WebDomain>();
        }
    }
}
