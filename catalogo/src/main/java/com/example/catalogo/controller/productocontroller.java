package com.example.catalogo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.catalogo.entity.producto;
import com.example.catalogo.service.productoservice;

@RestController
@RequestMapping("/producto")
@CrossOrigin("*")
public class productocontroller {
    @Autowired
    private productoservice ps;

    @GetMapping()
    public ResponseEntity<List<producto>> list() {
        return ResponseEntity.ok().body(ps.list());
    }

    @PostMapping()
    public ResponseEntity<producto> save(@RequestBody producto producto) {
        return ResponseEntity.ok(ps.save(producto));
    }

    @PutMapping()
    public ResponseEntity<producto> update(@RequestBody producto producto) {
        return ResponseEntity.ok(ps.update(producto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<producto> listById(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok().body(ps.listById(id).get());
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id) {
        ps.deleteById(id);
        return "Deleted Successfully";
    }
}
