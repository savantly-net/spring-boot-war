package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.GenericEntity;
import com.example.repository.GenericEntityRepository;

@RestController
@RequestMapping("/rest")
public class GenericEntityController {
    
    @Autowired
    GenericEntityRepository genericEntityRepository;

    @RequestMapping("/entity/all")
    public List<GenericEntity> findAll() {
        return genericEntityRepository.findAll();
    }

    @RequestMapping(value = "/entity", method = RequestMethod.POST)
    public GenericEntity addEntity(@RequestBody GenericEntity entity) {
        return genericEntityRepository.save(entity);
    }

    @RequestMapping("/entity/findby/{id}")
    public GenericEntity findById(@PathVariable Long id) {
        return genericEntityRepository.findOne(id);
    }

}
