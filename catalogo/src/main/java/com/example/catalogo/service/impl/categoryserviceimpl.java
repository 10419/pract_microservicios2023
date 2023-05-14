package com.example.catalogo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.catalogo.entity.category;
import com.example.catalogo.repository.categoryrepository;
import com.example.catalogo.service.categoryservice;

@Service
public class categoryserviceimpl implements categoryservice {
    @Autowired
    private categoryrepository cr;

    @Override
    public List<category> list(){
        return cr.findAll();
    }

    @Override
    public category save(category category) {
        return cr.save(category);
    }

    @Override
    public category update(category category) {
        return cr.save(category);
    }

    @Override
    public Optional<category> listById(Integer Id) {
        return cr.findById(Id);
    }

    @Override
    public void deleteById(Integer Id) {
        cr.deleteById(Id);
    }
}
