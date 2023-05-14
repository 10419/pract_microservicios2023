package com.example.cliente.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cliente.entity.cliente;
import com.example.cliente.repository.clienterepository;
import com.example.cliente.service.clienteservice;

@Service
public class clienteserviceimpl implements clienteservice {
    @Autowired
    private clienterepository cr;

    @Override
    public List<cliente> list() {
        return cr.findAll();
    }

    @Override
    public cliente save(cliente cliente) {
        return cr.save(cliente);
    }

    @Override
    public cliente update(cliente cliente) {
        return cr.save(cliente);
    }

    @Override
    public Optional<cliente> listById(Integer Id) {
        return cr.findById(Id);
    }

    @Override
    public void deleteById(Integer Id) {
        cr.deleteById(Id);
    }
}
