package com.example.cliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cliente.entity.cliente;
import com.example.cliente.service.clienteservice;

@RestController
@RequestMapping("/cliente")
public class clientecontroller {
    @Autowired
    private clienteservice cs;

    @GetMapping
    public ResponseEntity<List<cliente>> list() {
        return ResponseEntity.ok().body(cs.list());
    }

    @PostMapping
    public  ResponseEntity<cliente> save(@RequestBody cliente cliente) {
        return ResponseEntity.ok(cs.save(cliente));
    }
    @PutMapping()
    public ResponseEntity<cliente> update(@RequestBody cliente cliente) {
        return ResponseEntity.ok(cs.update(cliente));
    }

    @GetMapping("/{id}")
    public ResponseEntity<cliente> listById(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok().body(cs.listById(id).get());
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id) {
        cs.deleteById(id);
        return "Deleted Successfully";
    }
}
