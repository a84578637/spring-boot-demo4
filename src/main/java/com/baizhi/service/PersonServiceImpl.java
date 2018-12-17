package com.baizhi.service;

import com.baizhi.entity.Person;
import com.baizhi.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonMapper personMapper;

    @Override
    public List<Person> getAll() {
        System.out.println("in serviceImpl");
        List<Person> list = personMapper.queryAll();
        System.out.println("serviceImpl+lsit+===" + list);
        return list;
    }


}
