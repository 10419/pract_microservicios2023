package com.example.catalogo.controller;

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

import com.example.catalogo.entity.category;
import com.example.catalogo.service.categoryservice;

@RestController
@RequestMapping("/categoria")
public class categorycontroller {
    @Autowired
    private categoryservice ps;

    @GetMapping()
    public ResponseEntity<List<category>> list() {
        return ResponseEntity.ok().body(ps.list());
    }

    @PostMapping()
    public ResponseEntity<category> save(@RequestBody category category) {
        return ResponseEntity.ok(ps.save(category));
    }

    @PutMapping()
    public ResponseEntity<category> update(@RequestBody category category) {
        return ResponseEntity.ok(ps.update(category));
    }

    @GetMapping("/{id}")
    public ResponseEntity<category> listById(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok().body(ps.listById(id).get());
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id) {
        ps.deleteById(id);
        return "Deleted Successfully";
    }
}
